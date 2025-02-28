package com.mycompany.aula20250228;
import java.util.Scanner;

public class ContaBancaria {
    Scanner scanner = new Scanner(System.in);
    
    int numero;
    double saldo;
    String nomeTitular;

    public void imprimirDadosBancarios() {
        System.out.println("Dados bancários: ");
        System.out.println("Numero: " + numero);
        System.out.println("Saldo: " + saldo);
        System.out.println("Titular: " + nomeTitular);
    }
    
    public double sacarValor(){
        System.out.print("Informe o valor que deseja sacar: ");
        double valorSaque = scanner.nextDouble();
        
        if(valorSaque > saldo){
            System.out.println("Você não possui saldo suficiente! Saldo atual: " + saldo);
        }
        else{
            saldo = saldo - valorSaque;
            System.out.println("Saque realizado com sucesso. Saldo atual: " + saldo);
        }
        return saldo;
    }
    
    public double depositarValor(){
        System.out.print("Informe o valor que deseja depositar: ");
        double valorDeposito = scanner.nextDouble();
        saldo = saldo + valorDeposito;
        
        System.out.println("Deposito realizado com sucesso! Saldo atual: " + saldo);
        return saldo;
    }
}
