package com.mycompany.aula20250317;

public class Motor {
    private int potencia;
    private String tipoCombustivel;
    
    //Construtores
    public Motor() {
    }

    public Motor(int potencia, String tipoCombustivel) {
        this.potencia = potencia;
        this.tipoCombustivel = tipoCombustivel;
    }
    
    //Getters e Setters
    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
    
     //Sobrescrição método toString
    @Override
    public String toString(){
        return "Potência do motor: " + this.potencia+"\n"+"Tipo de combustível: " + this.tipoCombustivel;
    }
    
}
