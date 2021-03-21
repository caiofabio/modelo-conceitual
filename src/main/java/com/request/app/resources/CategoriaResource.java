package com.request.app.resources;

import com.request.app.domain.Categoria;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

//@Anotações

@RestController//Sinalizando que este é um restController
@RequestMapping(value ="/categorias")//nome padrão responde neste endpoint
public class CategoriaResource {
  
  @RequestMapping(method = RequestMethod.GET)//Metodo GET para ter acesso essa funçao exemplo localhost:8080/categorias
  public List<Categoria> listar() {//Metodo retorna lista(tipocategoria)
    Categoria cat1 = new Categoria(1, "Informatica");
    Categoria cat2 = new Categoria(2, "Escritorio" );

    List<Categoria> lista = new ArrayList<>();
    lista.add(cat1);
    lista.add(cat2);
    return lista;//retorno no formato json
  }

}
