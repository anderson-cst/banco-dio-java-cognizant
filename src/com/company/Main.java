package com.company;

public class Main {

    public static void main(String[] args) {

        Cliente anderson = new Cliente();
        anderson.setNome("Anderson");

        Conta cc = new ContaCorrente(anderson);
        Conta poupanca = new ContaPoupanca(anderson);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
