package tallerweb.sangucheto.modelo;

import java.util.LinkedList;
import java.util.List;

import tallerweb.sangucheto.modelo.Descuento;

public class Sanguchetto {

	public class Descuento {

	}

	private static Sanguchetto instance = new Sanguchetto();
	private List<Ingrediente> ingredientes = new LinkedList<Ingrediente>();
    private List<Descuento> descuentos = new LinkedList<Descuento>();

	
	private Sanguchetto(){}
	
	public static Sanguchetto getInstance(){
		return instance;
	}
	
	/**
	 * Elimina todos los ingredientes del sanguchetto.<br>
	 */
	public void vaciar(){
		ingredientes.remove(instance);
		
	}
	
	/**
	 * Agrega un ingrediente al carrito.<br>
	 * @param ingrediente
	 */
	public void agregarIngrediente(Ingrediente ingrediente){
		// Implementar
	}
	
	/**
	 * Lista todos los ingredientes que forman parte del sanguchetto.<br>
	 * @return
	 */
	public List<Ingrediente> verIngredientes(){
		// Implementar
		return null;
	}
	
	/**
     * Lista todos los condimentos que forman parte del sanguchetto.<br>
     * @return
     */
    public List<Ingrediente> verCondimentos(){
        // Implementar
        return null;
    }
	
	/**
	 * Devuelve el precio total del sanguchetto.<br>
	 * @return
	 */
	public Double getPrecio(){
		// Implementar
		return null;
	}
}
