package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    Conta conta = new Conta();

    Cliente cliente = new Cliente();


    public void executarMenu(){

        boolean continuar = true;


        do {


        System.out.println("---------------- MENU -----------------");
        System.out.println("[1] Cadastrar cliente");
        System.out.println("[2] Consultar saldo");
        System.out.println("[3] Realizar depósito");
        System.out.println("[4] Realizar saque");
        System.out.println("[5] Sair");
        System.out.println("---------------------------------------");


        int optionClient = scanner.nextInt();
        scanner.nextLine();

        switch (optionClient){

            case 1:

                cliente.cadastrarCliente();

                break;

            case 2:

                conta.consultarSaldo();

                break;

            case 3:

                System.out.print("Informe um valor para o depósito:");
                double valorDeposito = scanner.nextDouble();
                scanner.nextLine();
                conta.realizarDeposito(valorDeposito);

                break;

            case 4:
                System.out.print("Informe um valor para o saque:");
                double valorSaque = scanner.nextDouble();
                scanner.nextLine();
                conta.realizarSaque(valorSaque);

                break;

            case 5:

                continuar = false;

                break;

           }

        } while (continuar);
    }
}
