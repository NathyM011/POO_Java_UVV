package com.mycompany.aula20250317;

public class Aula20250317 {

    public static void main(String[] args) {
        Motorista motorista1 = new Motorista("Joao", "987654");
        Motorista motorista2 = new Motorista("Maria", "123456");

        Motor motor1 = new Motor(125, "Gasolina");
        Motor motor2 = new Motor(200, "Etanol");

        Carro carro1 = new Carro("Ford", motor1);
        Carro carro2 = new Carro("Ferrari", motor2);

        carro1.trocarDeMotorista(motorista1);
        carro2.trocarDeMotorista(motorista2);

        System.out.println(carro1);
        System.out.println(carro2);

    }
}
