package br.senai.sp.jandira.model;

public class Conta {

    private int numeroConta = 1234;

    private double saldo = 9563;

    private String agencia = "000-35-XX";


    public void realizarDeposito(Double valor){
        this.saldo += valor;
        System.out.println("O seu saldo é: " + this.saldo);

    }

    public void realizarSaque(Double valor){
        this.saldo -= valor;
        System.out.println("O saldo da conta é: " + this.saldo);

    }

    public void consultarSaldo(){

        System.out.println("Seu saldo é: " + this.saldo);


    }
}

