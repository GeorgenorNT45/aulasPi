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
	public String enviar(String nome, String local, String data, String horario) {
		System.out.println("*Dados enviados*");
		System.out.println("Nome: " + nome);
		System.out.println("Local: " + local);
		System.out.println("Data: " + data);
		System.out.println("Horário: " + horario);
		return "enviar";
	}
	
}
