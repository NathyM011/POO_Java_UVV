
package com.mycompany.aula20250317;

public class Motorista {
    private String nome;
    private String cnh;

    //Construtores
    public Motorista() {
    }

    public Motorista(String nome, String cnh) {
        this.nome = nome;
        this.cnh = cnh;
    }
    
    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }
    
    //Sobrescrição método toString
    @Override
    public String toString(){
        return "Nome do motorista: " + this.nome+"\n"+"CNH: " + this.cnh;
    }
    
    
}
