package tallerweb.sangucheto.modelo;

import java.util.LinkedList;
import java.util.List;


import tallerweb.sangucheto.modelo.Descuento;
import tallerweb.sangucheto.modelo.Ingrediente;
import tallerweb.sangucheto.modelo.TipoIngrediente;

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
		getIngredientes().remove(instance);
		
	}
	
	/**
	 * Agrega un ingrediente al carrito.<br>
	 * @param ingrediente
	 */
	public void agregarIngrediente(Ingrediente ingrediente){
		this.getIngredientes().add(ingrediente);
	}
	
	/**
	 * Lista todos los ingredientes que forman parte del sanguchetto.<br>
	 * @return
	 */
	public List<Ingrediente> verIngredientes(){
			List<Ingrediente> lista = new LinkedList<Ingrediente>();
			for(Ingrediente each : this.getIngredientes()) {
				if (each.getTipo().equals(TipoIngrediente.INGREDIENTE)) {
					lista.add(each);
				}
			}
			return lista;
		}
	
	
	/**
     * Lista todos los condimentos que forman parte del sanguchetto.<br>
     * @return
     */
    public List<Ingrediente> verCondimentos(){
		List<Ingrediente> listaCond = new LinkedList<Ingrediente>();
		for(Ingrediente each : this.getIngredientes()) {
			if (each.getTipo().equals(TipoIngrediente.CONDIMENTO)) {
				listaCond.add(each);
			}
		}
		return listaCond;
	}
	
	/**
	 * Devuelve el precio total del sanguchetto.<br>
	 * @return
	 */
	public Double getPrecio(){
		Double total = 0.00;
		for(Ingrediente each : this.getIngredientes()) {
			total += each.getPrecio();
		}
		return total;
	}

	public List<Ingrediente> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(List<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}
}
