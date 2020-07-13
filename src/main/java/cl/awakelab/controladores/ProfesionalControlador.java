package cl.awakelab.controladores;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cl.awakelab.beans.Cliente;
import cl.awakelab.beans.PedirAsesoria;
import cl.awakelab.dao.ClienteDao;
import cl.awakelab.dao.EmpresaDao;

@Controller
public class ProfesionalControlador {
	
	@Autowired
	ClienteDao dao;
	
	@Autowired
	EmpresaDao empresaDao;
	
	@RequestMapping("/perfilprofesional")
	public String mostrarperfilprofesional(Model modelo) {
		modelo.addAttribute("muestraAlgo", new Cliente());
		return "perfilprofesional";
	}	
	
	@RequestMapping("/clienteRegistro")
	public String showform(Model modelo) {
		modelo.addAttribute("muestraAlgo", new Cliente());
		return "clienteRegistro";
	}
	
	@RequestMapping("/vista")
	public String muestraLista(Model modelo){
		
		List<Cliente> lista = dao.mostrarCliente();
		modelo.addAttribute("lista", lista);		
		return "vista";
		
	}	
		
	@RequestMapping(value="/save", method = RequestMethod.POST)
	public String creaUsuario(@ModelAttribute("cli") Cliente cliente) {
		
		dao.insertar(cliente);		
		return "redirect:/vista";
	}	
	
	@RequestMapping(value="/editcli/{id_cliente}")	
    public String editaUsuario(@PathVariable int id_cliente, Model sesion) {
		Cliente nuevoCliente = dao.buscarCliente(id_cliente);
		
		sesion.addAttribute("command", nuevoCliente);		
		return "editarCliente";		
	} 
	
	@RequestMapping(value="/guardaCambio", method = RequestMethod.POST)
	public String guardaCambio(@ModelAttribute("IdUsuario") Cliente cli) {
		
		dao.actualizar(cli);		
		return "redirect:/vista";
	}
		
	@RequestMapping(value="/deletecli/{id_cliente}")
	public String eliminar(@PathVariable int id_cliente, Model sesion) {
		
		dao.borrar(id_cliente);				
		return "redirect:/vista";
	}
	
	// METODO ASESORIAS!
	
	@RequestMapping("/vistaAsesoria")
	public String verAsesoria(Model modelo){
		
		List<PedirAsesoria> listaAsesoria = empresaDao.mostrarAsesoria();
		modelo.addAttribute("listaAsesoria", listaAsesoria);		
		return "vistaAsesoria";
		
	}
}
