package cl.awakelab.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cl.awakelab.beans.PedirAsesoria;
import cl.awakelab.dao.EmpresaDao;

@Controller
public class ControladorEmpresa {
	
	@Autowired
	EmpresaDao daoempresa;
	
	@RequestMapping("/perfilcliente")
	public String showPerfilCliente(Model model) {
		model.addAttribute("usuario", new PedirAsesoria ());
		
		return("perfilcliente");		
	}

	@RequestMapping("/menuAsesoriaCliente")
	public String menuAsesoria(Model model) {
		model.addAttribute("command", new PedirAsesoria ());
		
		return("menuAsesoriaCliente");		
	}
	
	@RequestMapping("/solicitaasesoria")
	public String pideAsesoria(Model model) {
		model.addAttribute("command", new PedirAsesoria ());
		
		return("solicitaasesoria");		
	}
	
	@RequestMapping(value="/solicitudAsesoria", method = RequestMethod.POST)
	public String creaAsesoria(@ModelAttribute("cli") PedirAsesoria asesoria) {
		
		daoempresa.insertarAsesoria(asesoria);		
		return "redirect:/perfilcliente";
	}
	
	
}
