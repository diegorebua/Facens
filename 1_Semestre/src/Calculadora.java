package src;
// Ja foi visto

import java.util.Scanner;

public class Calculadora{

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        double primeiro = 0.0, segundo = 0.0, resultado = 0.0;
        char op = ' ', escolhaSaida = ' ';

        do{
            System.out.println("\nInsira dois números: ");
            System.out.println("\nPrimeiro número: ");
            primeiro = scn.nextDouble();

            System.out.println("Segundo número: ");
            segundo = scn.nextDouble();

            System.out.println("\nSelecione uma operação: ");
            System.out.println("1: Soma");
            System.out.println("2: Subtração");
            System.out.println("3: Divisão");
            System.out.println("4: Multiplicação");
            op = scn.next().charAt(0);

            switch (op){
                case '1':
                    resultado = primeiro + segundo;
                    break;
                case '2':
                    resultado = primeiro - segundo;
                    break;
                case '3':
                    resultado = primeiro/segundo;
                    break;
                case '4':
                    resultado = primeiro*segundo;
                    break;
                default:
                    System.out.println("Opereação invalida");
                    break;           
            }

            System.out.println("O resultado é: " + resultado);

            System.out.println(" ");

            System.out.println("Deseja continuar? (S) - sim, qualquer para sair");
            escolhaSaida = scn.next().charAt(0);

        } while(escolhaSaida == 'S');

        scn.close();
    }
}