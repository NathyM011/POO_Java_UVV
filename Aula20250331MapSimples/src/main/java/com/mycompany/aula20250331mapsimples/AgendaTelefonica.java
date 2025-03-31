package com.mycompany.aula20250331mapsimples;

import java.util.HashMap;
import java.util.Map;


public class AgendaTelefonica {
     private Map<String, String> colecao;

    public AgendaTelefonica() {
        this.colecao = new HashMap<>();
    }
    
    public void inserir(String nome, String telefone){
        this.colecao.put(nome, telefone);
    }
    
    public String buscar(String nome){
        return this.colecao.get(nome);
    }
    
    public int quantidade(){
        return this.colecao.size();
    }
    
    public void remover(String nome){
        if(this.colecao.remove(nome)!= null){
            System.out.println("Contato removido");
        }else{
            System.out.println("Nao encontrado");

        }    
    }
    
    public void imprimir(){
        if(this.colecao.isEmpty()){
            System.out.println("Agenda Vazia");
        }else{
            
            for(Map.Entry<String, String> contato: colecao.entrySet()){
                System.out.println("Nome: "+contato.getKey()+" ("+contato.getValue()+")");
            } 
            
            for(String chave : colecao.keySet()){
                System.out.println("Nome: "+chave+" ("+colecao.get(chave)+")");
            }
            
        }
        
        
    }
}
