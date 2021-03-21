package com.request.app.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@Anotações

@RestController//Sinalizando que este é um restController
@RequestMapping(value ="/categorias")//nome padrão responde neste endpoint
public class CategoriaResource {
  
  @RequestMapping(method = RequestMethod.GET)//Metodo GET para ter acesso essa funçao exemplo localhost:8080/categorias
  public String listar() {
    return "REST esta funcionando";
  }

}
