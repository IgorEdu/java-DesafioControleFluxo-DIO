package com.controlefluxo;

import java.util.Scanner;

import main.java.com.controlefluxo.ParametrosInvalidosException;

public class Contador {
    public static void main(String[] args) {
        try (Scanner terminal = new Scanner(System.in)) {
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();

            try {
                // chamando o método contendo a lógica de contagem
                contar(parametroUm, parametroDois);

            } catch (ParametrosInvalidosException exception) {
                // [x] imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
                System.err.println(exception);
            }
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // [x] validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroDois < parametroUm) {
            throw new ParametrosInvalidosException();
        }
        int contagem = parametroDois - parametroUm;
        // [x]realizar o for para imprimir os números com base na variável contagem
        for (int i = 0; i < contagem; i++) {
            System.out.println("Imprimindo o número " + (i + 1));
        }
    }
}