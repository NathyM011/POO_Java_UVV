/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula20250214;

/**
 *
 * @author alunolab03
 */

import java.util.Scanner;

public class Aula20250214 {

    public static void main(String[] args) {
        int contador = 1;
        Scanner scanner = new Scanner(System.in);
        
        while(contador != 0){
            System.out.println("===================================================");
            System.out.println("\t\t\tMENU");
            System.out.println("===================================================");

            System.out.println("[1] - Adição");
            System.out.println("[2] - Subtração");
            System.out.println("[3] - Multiplicação");
            System.out.println("[4] - Divisão");
            System.out.println("[0] - Sair");
            
            System.out.print("Digite uma das opções abaixo: ");
            contador = scanner.nextInt();
            
            if(contador < 0 || contador > 4){
                System.out.println("Opção inválida!");
            }
            else if(contador == 1){
                System.out.println("=============================================");
                System.out.println("\t\tAdição");
                System.out.println("=============================================");
            }
            else if(contador == 2){
                System.out.println("=============================================");
                System.out.println("\tSubtração");
                System.out.println("=============================================");
            }
            else if(contador == 3){
                System.out.println("=============================================");
                System.out.println("\tMultiplicação");
                System.out.println("=============================================");
            }
            else if(contador == 4){
                System.out.println("=============================================");
                System.out.println("\tDivisão");
                System.out.println("=============================================");
            }
        }
        
    }
}
