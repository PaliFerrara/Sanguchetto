package tallerweb.sangucheto.controladores;

public class ComandoStock {
	private Integer cantidad;
	private String nombreIngrediente;
	
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public String getNombreIngrediente() {
		return nombreIngrediente;
	}
	public void setNombreIngrediente(String nombreIngrediente) {
		this.nombreIngrediente = nombreIngrediente;
	}
}
