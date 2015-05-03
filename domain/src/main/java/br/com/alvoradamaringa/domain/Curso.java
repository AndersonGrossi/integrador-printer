package br.com.alvoradamaringa.domain;

public class Curso {
     private long idCurso;
     private String descricao;   

     public void setId(Integer  idcurso){
          this.idcurso=idcurso;
          
     }
     public Integer getid(Integer idcurso){
          return this.idcurso;
     }
     public void setdescricao(String descricao){
          this.descricao=descricao;
     }
     public String getDescricao(String descricao){
          return this.descricao;
     }
}


