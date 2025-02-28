package com.mycompany.aula20250228;

public class Aula20250228 {

    public static void main(String[] args) {
        ContaBancaria contaTeste = new ContaBancaria();
        
        contaTeste.nomeTitular = "João";
        contaTeste.numero = 123456;
        contaTeste.saldo = 132660.22;
        
        contaTeste.imprimirDadosBancarios();
        contaTeste.depositarValor();
        contaTeste.sacarValor();
    }
}
