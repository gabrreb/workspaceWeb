package br.com.isidrocorp.eventdash.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.isidrocorp.eventdash.dao.AlarmeDAO;
import br.com.isidrocorp.eventdash.model.Alarme;

@CrossOrigin("*")
@RestController
public class AlarmeController {
	
	//aqui o autowired é responsável por, além de buscar um objeto que faz a 
	//implementação da interface, ele também cria a instanciação do objeto
	// ou seja, não preciso dar NEW.
	@Autowired
	private AlarmeDAO dao;

	// quero criar um método que me retorne TODOS os Alarmes gravados no banco
	@GetMapping("/alarmes")
	public ArrayList<Alarme> recuperarTodos(){
		
		ArrayList<Alarme> lista;
		lista = (ArrayList<Alarme>)dao.findAll();
		return lista;
		
	}
}
