package com.request.app.domain;

import java.io.Serializable;

//Serializable Interface que sinaliza que objetos desta class podem ser convertidos em sequencia de bytes, ex: trafegar rede ou arquivos
public class Categoria implements Serializable{
  private static final long serialVersionUID = 1L;//Atendendo o contrato Serializable
  private Integer id;
  private String nome;

  public Categoria(){//Construtor vazio
  }

  public Categoria(Integer id, String nome){
    this.id = id;
    this.nome =  nome;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  @Override
  public int hashCode() {//Comparação entrer 2 objetos por conteudo e não end-memoria
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Categoria other = (Categoria) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    return true;
  }

}
