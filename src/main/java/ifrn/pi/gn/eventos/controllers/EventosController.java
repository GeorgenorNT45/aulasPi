package ifrn.pi.gn.eventos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ifrn.pi.gn.eventos.models.Evento;

@Controller
public class EventosController {

	@RequestMapping("/eventos/form")
	public String form() {
		return "formEvento";
	}
	
	@RequestMapping("/eventos/form/enviar")
	public String enviar(Evento evento) {
		System.out.println("*Dados enviados*");
		System.out.println("Nome: " + evento.getNome());
		System.out.println("Local: " + evento.getLocal());
		System.out.println("Data: " + evento.getData());
		System.out.println("Horário: " + evento.getHorario());
		return "enviar";
	}
	
}
