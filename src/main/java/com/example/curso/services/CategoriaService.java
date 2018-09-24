package com.example.curso.services;

import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.curso.domain.Categoria;
import com.example.curso.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new com.example.curso.services.exception.ObjectNotFoundException(
	"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}

}
