package tallerweb.sanguchetto.modelo;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import tallerweb.sangucheto.modelo.Ingrediente;
import tallerweb.sangucheto.modelo.Sanguchetto;
import tallerweb.sangucheto.modelo.TipoIngrediente;

public class SanguchettoTest {

    @Before 
    public void inicializar() {
        Ingrediente mayonesa = new Ingrediente();
        mayonesa.setNombre("Mayonesa");
        mayonesa.setPrecio(1.00);
        mayonesa.setTipo(TipoIngrediente.CONDIMENTO);
        
    	Ingrediente queso = new Ingrediente();
        queso.setNombre("Queso");
        queso.setPrecio(1.00);
        queso.setTipo(TipoIngrediente.INGREDIENTE);
        
        Ingrediente jamon = new Ingrediente();
        jamon.setNombre("Jamon");
        jamon.setPrecio(4.5);
        jamon.setTipo(TipoIngrediente.INGREDIENTE);
        
        Ingrediente tomate = new Ingrediente();
        tomate.setNombre("Tomate");
        tomate.setPrecio(0.75);
        tomate.setTipo(TipoIngrediente.INGREDIENTE);
        

        
        /*Ingrediente ketchup = new Ingrediente();
        ketchup.setNombre("Ketchup");
        ketchup.setPrecio(0.25);
        ketchup.setTipo(TipoIngrediente.CONDIMENTO);*/
        
        
        Sanguchetto.getInstance().agregarIngrediente(queso);
        Sanguchetto.getInstance().agregarIngrediente(tomate);
        Sanguchetto.getInstance().agregarIngrediente(jamon);
       // Sanguchetto.getInstance().agregarIngrediente(ketchup);

    }
    
    /*@After 
    public void vaciarInstancia() {
        Sanguchetto.getInstance().vaciar();
    }*/
    
    @Test
    public void testVaciar() {
        Sanguchetto.getInstance().vaciar();
        
        Integer ingredientes = Sanguchetto.getInstance().verIngredientes().size();
    	Integer condimentos = Sanguchetto.getInstance().verCondimentos().size();
    	
    	Assert.assertTrue(ingredientes+condimentos == 0);    }

    @Test
    public void testAgregarIngrediente() {
    	Ingrediente lechuga = new Ingrediente();
    	lechuga.setNombre("Lechuga");
    	lechuga.setPrecio(1.50);
    	lechuga.setTipo(TipoIngrediente.INGREDIENTE);
        
        Sanguchetto.getInstance().agregarIngrediente(lechuga);
    	
    	Integer ingredientes = Sanguchetto.getInstance().verIngredientes().size();
    	Integer condimentos = Sanguchetto.getInstance().verCondimentos().size();
    	
    	Assert.assertTrue(ingredientes+condimentos == 4);    }

    @Test
    public void testVerIngredientes() {
    	Assert.assertTrue(Sanguchetto.getInstance().verIngredientes().size() == 3);
    }

    @Test
    public void testVerCondimentos() {
    	Assert.assertTrue(Sanguchetto.getInstance().verCondimentos().size() == 0);
    }

    @Test
    public void testGetPrecio() {
    	Assert.assertTrue(Sanguchetto.getInstance().getPrecio() == 6.25);
    }
}
