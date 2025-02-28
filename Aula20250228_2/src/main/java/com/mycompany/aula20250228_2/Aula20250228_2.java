
package com.mycompany.aula20250228_2;
public class Aula20250228_2 {

    public static void main(String[] args) {
        System.out.println("Banco");
        
        //declaração do cliente joão e da conta de joão
        Cliente j = new Cliente();
        j.cpf = "123456789";
        j.nome = "João";
        j.sobrenome = "Silva";
        
        Conta contJoao = new Conta();
        contJoao.numero = 123;
        contJoao.limite = 1000;
        contJoao.saldo = 20000.00;
        contJoao.titular = j;
        
        //declaração da cliente Maria e da conta de Maria
        Cliente m = new Cliente();
        m.cpf = "0987654";
        m.nome = "Maria";
        m.sobrenome = "Silva";
        
        Conta contMaria = new Conta();
        contMaria.numero = 987;
        contMaria.limite = 500;
        contMaria.saldo = 34000.00;
        contMaria.titular = m;
        
        //Declaração dos conjuges e contas
        j.conta = contJoao; //digo que o cliente joão possui uma conta contJoao;
        m.conta = contMaria; //digo que a cliente Maria possui uma conta contMaria;

        m.conjuge = j; //setando o conjuge de maria como o objeto joão
        j.conjuge = m; //setando o conjuge de joão como o objeto maria
        
        //alteração dos dados de maria por meio de joão
        j.conjuge.conta.limite = 1000;
        System.out.printf("Novo limite de Maria: " + contMaria.limite);
        
    }
}
