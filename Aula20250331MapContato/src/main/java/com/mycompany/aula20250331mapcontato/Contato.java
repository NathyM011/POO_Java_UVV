package com.mycompany.aula20250331mapcontato;

public class Contato {
    String nome;
    String numero;

    public Contato(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Contato{" + "nome=" + nome + ", numero=" + numero + '}';
    }
    
}
