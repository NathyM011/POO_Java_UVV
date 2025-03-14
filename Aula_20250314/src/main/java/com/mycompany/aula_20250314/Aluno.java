package com.mycompany.aula_20250314;

import java.time.Year;
import java.util.Random;

public class Aluno {

    private static int quantidadeAluno = 0; //atributo estático é DA CLASSE!

    private String matricula;
    private String nome;
    private String curso;
    private String turma;
    private int periodo;
    private double nota1B;
    private double nota2B;
    private double notaFinal;

    public Aluno() {
        quantidadeAluno++;
        this.matricula = gerarMatricula();
    }

    public Aluno(String nome, String curso, String turma, int periodo, double nota1B, double nota2B) {
        this.nome = nome.toUpperCase();
        this.curso = curso;
        this.turma = turma;
        this.periodo = periodo;
        this.nota1B = nota1B;
        this.nota2B = nota2B;
        quantidadeAluno++;
        this.matricula = gerarMatricula();
        calcularNotaFinal();
    }

    private String gerarMatricula() {
        int ano = Year.now().getValue();
        Random rand = new Random();
        int randNumber = rand.nextInt(10000);

        return ano + String.format("%04d", randNumber);
    }

    public void calcularNotaFinal() {
        this.notaFinal = (this.nota1B + this.nota2B) / 2;
    }

    public boolean passar(String novaTurma, int novoPeriodo) {
        if (this.notaFinal >= 7) {
            this.turma = novaTurma;
            this.periodo = novoPeriodo;
            return true;
        }
        else System.out.print("Reprovado!"); return false;
    }
    
    public void imprimir(){
        System.out.print("Matricula: " + this.matricula);
        System.out.print("Nome: " + this.nome);
    }
    @Override
    public String toString(){
        return "Matricula: " + this.matricula+"\n"+"Nome: " + this.nome;
    }

    //GETTERS PARA VISUALIZAÇÃO//
    public static int getQuantidadeAluno() {
        return quantidadeAluno;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }

    public String getTurma() {
        return turma;
    }

    public int getPeriodo() {
        return periodo;
    }

    public double getNota1B() {
        return nota1B;
    }

    public double getNota2B() {
        return nota2B;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    //SETTERS PARA SETAR VALORES//
    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public void setNota1B(double nota1B) {
        this.nota1B = nota1B;
    }

    public void setNota2B(double nota2B) {
        this.nota2B = nota2B;
        calcularNotaFinal();
    }

}
