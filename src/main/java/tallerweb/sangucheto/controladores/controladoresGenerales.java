package tallerweb.sangucheto.controladores;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import tallerweb.sangucheto.modelo.Ingrediente;
import tallerweb.sangucheto.modelo.TipoIngrediente;
import tallerweb.sangucheto.modelo.Sanguchetto;
import tallerweb.sangucheto.modelo.Stock;

@Controller
public class controladoresGenerales {
	@RequestMapping("/stock")
	public ModelAndView obtenerStock() {
		ModelAndView stock = new ModelAndView("stock");
		stock.addObject("stock",Stock.getInstance().obtenerStock());
		return stock;
	}
	
	@RequestMapping("/irAAgregarStock")
	public ModelAndView irAAgregarStock() {
		ModelMap miMap = new ModelMap();
		miMap.put("command", new ComandoStock());
		miMap.put("listaDeIngredientes",Stock.getInstance().listarIngredientesDisponibles());
		return new ModelAndView("agregarStock",miMap);
	}
	
	@RequestMapping("/agregarStock")
	public ModelAndView agregarStock(ComandoStock command) {
		String mensaje;
		ModelMap miMapa = new ModelMap();
		Ingrediente ingrediente = new Ingrediente();
		ingrediente.setNombre(command.getNombreIngrediente());
		Boolean resultado = Stock.getInstance().agregarStock(ingrediente, command.getCantidad());
		
		if(resultado == true) {
			Integer stock = Stock.getInstance().obtenerStockDisponible(ingrediente);
			mensaje = "Se agreg&oacute; el Stock de "+command.getNombreIngrediente()+".Usted tiene "+stock+" unidades";
		}
		else {
			mensaje = "Ocurri&oacute; un error al modificar la cantidad";
		}
		miMapa.put("mensaje",mensaje);
		return new ModelAndView("resultado",miMapa);
	}
	
	@RequestMapping("/irAEliminarIngrediente")
	public ModelAndView irAEliminarIngrediente() {
    	ModelMap miMapa = new ModelMap();
		miMapa.put("listaDeIngredientes",Stock.getInstance().listarIngredientesDisponibles());
		miMapa.put("command", new Ingrediente());
		return new ModelAndView("eliminarIngrediente",miMapa);
	}
	
	@RequestMapping("/eliminarIngrediente")
	public ModelAndView eliminarIngrediente(Ingrediente ingrediente) {
		String mensaje;
		ModelMap miMapa = new ModelMap();
		Boolean resultado = Stock.getInstance().eliminarIngrediente(ingrediente);
		
		if(resultado == true) {
			mensaje = ingrediente.getNombre()+" eliminado.";
		}
		else {
			mensaje = "Ocurri&oacute un error al eliminar el ingrediente";
		}
		miMapa.put("mensaje",mensaje);
		return new ModelAndView("resultado",miMapa);
	}
	
	@RequestMapping(value="/AltaIngrediente")
	public ModelAndView AltaIngrediente() {
		ModelMap modelMap = new ModelMap();
		
		ArrayList<String> tipos = new ArrayList<String>();
		tipos.add(TipoIngrediente.CONDIMENTO.name());
		tipos.add(TipoIngrediente.INGREDIENTE.name());
		
		modelMap.put("tipos",tipos);
		
		modelMap.put("ingrediente", new Ingrediente()); 
		
		return new ModelAndView("AltaIngrediente",modelMap);
	}
	
	@RequestMapping(value="/darDeAltaIngrediente",method=RequestMethod.POST)
	public ModelAndView darDeAltaIngrediente(@ModelAttribute("ingrediente") Ingrediente ingrediente) {
		Ingrediente ingredienteNuevo = new Ingrediente();
		String mensaje;
		ModelMap miMap = new ModelMap();
		
		ingredienteNuevo.setNombre(ingrediente.getNombre());
		ingredienteNuevo.setPrecio(ingrediente.getPrecio());
		
		if(ingrediente.getTipo().equals("INGREDIENTE")){
			ingredienteNuevo.setTipo(TipoIngrediente.INGREDIENTE);
		} else {
			ingredienteNuevo.setTipo(TipoIngrediente.CONDIMENTO);
		}
			
		Boolean resultado = Stock.getInstance().agregarIngrediente(ingredienteNuevo);		
		
		if(resultado == true) {
			mensaje = "Se dio de alta " + ingrediente.getNombre();
		}
		else {
			mensaje = "Hubo un error al dar de alta el ingrediente";
		}
		miMap.put("mensaje",mensaje);
		return new ModelAndView("resultado",miMap);
	}
	
	@RequestMapping("/index")
	public ModelAndView armarSanguchetto() {
		ModelMap miMap = new ModelMap();	
		miMap.put("ingredientesSangucheto", Sanguchetto.getInstance().verIngredientes());
		miMap.put("condimentosSangucheto", Sanguchetto.getInstance().verCondimentos());
		miMap.put("precio", Sanguchetto.getInstance().getPrecio());
		miMap.put("ingredientesStock", Stock.getInstance().listarIngredientesEnStock());
		miMap.put("condimentosStock", Stock.getInstance().listarCondimentosEnStock());	
		miMap.put("ingredienteAgregar", new Ingrediente());
		miMap.put("condimentoAgregar", new Ingrediente());
		
		return new ModelAndView("sangucheto",miMap);
	}
	
	@RequestMapping(value="/agregarIngredienteASangucheto",method=RequestMethod.POST)
	public ModelAndView agregarIngredienteASangucheto(@ModelAttribute("ingredienteAgregar") Ingrediente ingrediente) {
		agregarASangucheto(ingrediente);
		return new ModelAndView("redirect:/sangucheto");
	}
	
	@RequestMapping(value="/agregarCondimentoASangucheto",method=RequestMethod.POST)
	public ModelAndView agregarCondimentoASangucheto(@ModelAttribute("condimentoAgregar") Ingrediente ingrediente) {
		agregarASangucheto(ingrediente);
		return new ModelAndView("redirect:/sangucheto");
	}
	
	public void agregarASangucheto(Ingrediente ingrediente) {
		ingrediente = Stock.getInstance().buscarIngrediente(ingrediente);
		Sanguchetto.getInstance().agregarIngrediente(ingrediente);
		Stock.getInstance().comprarIngrediente(ingrediente, 1);
	}
	
	@RequestMapping("/submitSangucheto")
	public ModelAndView submitSangucheto() {	
		ModelMap miMap = new ModelMap();	
		miMap.put("ingredientesSangucheto", Sanguchetto.getInstance().verIngredientes());
		miMap.put("condimentosSangucheto", Sanguchetto.getInstance().verCondimentos());
		miMap.put("precio", Sanguchetto.getInstance().getPrecio());
		Sanguchetto.getInstance().vaciar();
		return new ModelAndView("tuSangucheto",miMap);
	}
	
	@RequestMapping("/cancelarSangucheto")
	public ModelAndView cancelarSangucheto() {
		for (Ingrediente each : Sanguchetto.getInstance().getIngredientes()) {
			Stock.getInstance().agregarStock(each, 1);
		}
		Sanguchetto.getInstance().vaciar();
		return new ModelAndView("redirect:/sangucheto");
	}

}
