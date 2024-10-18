package ifrn.pi.gn.eventos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventosController {

	@RequestMapping("/eventos/form")
	public String form() {
		return "formEvento";
	}
	
	@RequestMapping("/eventos/form/enviar")
	public String enviar() {
		System.out.println("Os dados foram enviados");
		return "enviar";
	}
	
}
