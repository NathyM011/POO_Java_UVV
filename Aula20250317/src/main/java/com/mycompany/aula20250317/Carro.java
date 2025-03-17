package com.mycompany.aula20250317;

public class Carro {

    private String modelo;
    private Motorista motorista;
    private Motor motor;
    private static int quantidadeDeDonos;
    private static int quantidadeDeUsos;

    public Carro(String modelo, Motor motor) {
        this.modelo = modelo;
        this.motor = motor;
        this.quantidadeDeUsos++;
    }

    public void trocarDeMotorista(Motorista newMotorista) {
        if (newMotorista == this.motorista) {
            System.out.println("O dono continua sendo o mesmo");
        } else {
            this.quantidadeDeDonos++;
            this.motorista = newMotorista;
        }
    }

    //Sobrescrição método toString
    @Override
    public String toString() {
        return "Modelo: " + this.modelo + "\n" + "Motorista: " + this.motorista + "\n" + this.motor + "\nQuantidade de donos: " + this.quantidadeDeDonos + "\nQuantidade de usos: " + this.quantidadeDeUsos;
    }
}
