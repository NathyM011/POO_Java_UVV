/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.aula20250221;

import java.util.Scanner;

/**
 *
 * @author alunolab09
 */
public class Aula20250221 {

    public static double SomarNumero(int quantidadeSoma) {
        Scanner scanner = new Scanner(System.in);
        double resultadoSoma = 0;

        for (int cont = 0; cont < quantidadeSoma; cont++) {
            System.out.print("Digite o número da soma: ");
            resultadoSoma = scanner.nextInt() + resultadoSoma;
        }

        return resultadoSoma;
    }

    public static double SubtrairNumero(int quantidadeSubtracao) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double resultadoSubtracao = scanner.nextFloat();

        for (int cont = 1; cont < quantidadeSubtracao; cont++) {
            System.out.print("Digite o número da subtração: ");
            float valorLeituraSubtracao = scanner.nextInt();
            resultadoSubtracao -= valorLeituraSubtracao;
        }

        return resultadoSubtracao;
    }

    public static double MultiplicarNumero(int quantidadeMultiplicacao) {
        Scanner scanner = new Scanner(System.in);
        double resultadoMultiplicacao = 1;

        for (int cont = 0; cont < quantidadeMultiplicacao; cont++) {
            System.out.print("Digite o número da multiplicação: ");
            resultadoMultiplicacao = scanner.nextInt() * resultadoMultiplicacao;
        }

        return resultadoMultiplicacao;

    }

    public static double DividirNumero(int quantidadeDivisao) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double resultadoDivisao = scanner.nextFloat();

        for (int cont = 1; cont < quantidadeDivisao; cont++) {
            System.out.print("Digite o número da divisao: ");
            float valorLeituraSubtracao = scanner.nextInt();
            resultadoDivisao /= valorLeituraSubtracao;
        }

        return resultadoDivisao;
    }

    public static void ExibirMenuCalculadora(int contador) {
        Scanner scanner = new Scanner(System.in);

        switch (contador) {
            case 0:
                System.out.println("Saindo...");
                break;
            case 1:
                System.out.println();
                System.out.println("=============================================");
                System.out.println("\t\tAdição");
                System.out.println("=============================================");

                int quantidadeSoma = 0;
                System.out.print("Quantos números deseja somar? ");
                quantidadeSoma = scanner.nextInt();

                System.out.println("=============================================");
                System.out.println(" -> Resultado da soma: " + SomarNumero(quantidadeSoma));
                System.out.println("=============================================");

                break;

            case 2:
                System.out.println("=============================================");
                System.out.println("\tSubtração");
                System.out.println("=============================================");

                int quantidadeSubtracao;
                System.out.print("Quantos números deseja subtrair? ");
                quantidadeSubtracao = scanner.nextInt();

                System.out.println("=============================================");
                System.out.println(" -> Resultado da subtração: " + SubtrairNumero(quantidadeSubtracao));
                System.out.println("=============================================");
                break;

            case 3:
                System.out.println("=============================================");
                System.out.println("\tMultiplicação");
                System.out.println("=============================================");

                System.out.print("Quantos números deseja multiplicar? ");
                int quantidadeMultiplicacao = scanner.nextInt();

                System.out.println("=============================================");
                System.out.println(" -> Resultado da multiplicação: " + MultiplicarNumero(quantidadeMultiplicacao));
                System.out.println("=============================================");
                break;

            case 4:
                System.out.println("=============================================");
                System.out.println("\tDivisão");
                System.out.println("=============================================");

                System.out.print("Quantos números deseja dividir? ");
                int quantidadeDivisao = scanner.nextInt();

                System.out.println("=============================================");
                System.out.println(" -> Resultado da divisão: " + DividirNumero(quantidadeDivisao));
                System.out.println("=============================================");
                break;

            default:
                System.out.println("=============================================");
                System.out.println("Opção inválida!");
                System.out.println("=============================================");
                break;
        }
    }

    public static void ExibirMenuInicial() {
        System.out.println("===================================================");
        System.out.println("\t\t\tMENU");
        System.out.println("===================================================");

        System.out.println("[1] - Adição");
        System.out.println("[2] - Subtração");
        System.out.println("[3] - Multiplicação");
        System.out.println("[4] - Divisão");
        System.out.println("[0] - Sair");

        System.out.print("Digite uma das opções abaixo: ");
    }

    public static void main(String[] args) {
        int contador;
        Scanner scanner = new Scanner(System.in);

        do {
            ExibirMenuInicial();
            ExibirMenuCalculadora(contador = scanner.nextInt());

        } while (contador != 0);
    }
}
