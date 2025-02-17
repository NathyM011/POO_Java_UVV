/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.aula20250217;

/**
 *
 * @author alunolab03
 */
import java.util.Scanner;

public class Aula20250217 {

    public static void main(String[] args) {
        int contador;
        Scanner scanner = new Scanner(System.in);

        do {
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

            switch (contador) {
                case 0:
                    System.out.println("Saindo...");
                    break;
                case 1:
                    System.out.println();
                    System.out.println("=============================================");
                    System.out.println("\t\tAdição");
                    System.out.println("=============================================");

                    int quantidadeSoma;
                    float resultadoSoma = 0;

                    System.out.print("Quantos números deseja somar? ");
                    quantidadeSoma = scanner.nextInt();

                    for (int cont = 0; cont < quantidadeSoma; cont++) {
                        System.out.print("Digite o número da soma: ");
                        resultadoSoma = scanner.nextInt() + resultadoSoma;
                    }
                    System.out.println("=============================================");
                    System.out.println(" -> Resultado da soma: " + resultadoSoma);
                    System.out.println("=============================================");

                    break;

                case 2:
                    System.out.println("=============================================");
                    System.out.println("\tSubtração");
                    System.out.println("=============================================");

                    int quantidadeSubtracao;
                    float resultadoSubtracao = 0;

                    System.out.print("Quantos números deseja subtrair? ");
                    quantidadeSubtracao = scanner.nextInt();

                    System.out.print("Digite o primeiro número: ");
                    resultadoSubtracao = scanner.nextFloat();

                    for (int cont = 1; cont < quantidadeSubtracao; cont++) {
                        System.out.print("Digite o número da subtração: ");
                        float valorLeituraSubtracao = scanner.nextInt();
                        resultadoSubtracao -= valorLeituraSubtracao;
                    }
                    System.out.println("=============================================");
                    System.out.println(" -> Resultado da subtração: " + resultadoSubtracao);
                    System.out.println("=============================================");
                    break;

                case 3:
                    System.out.println("=============================================");
                    System.out.println("\tMultiplicação");
                    System.out.println("=============================================");
                    break;

                case 4:
                    System.out.println("=============================================");
                    System.out.println("\tDivisão");
                    System.out.println("=============================================");
                    break;

                default:
                    System.out.println("=============================================");
                    System.out.println("Opção inválida!");
                    System.out.println("=============================================");
                    break;

            }
        }while (contador != 0); 


    }
}
