package main.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner corpo = new Scanner(System.in);

        System.out.println("CRIAÇÃO DO OBJETO CORPO HUMANO");
        System.out.print("Digite a massa inicial (kg): ");
        float massa = corpo.nextFloat();

        System.out.print("Digite o volume inicial (m³): ");
        float volume = corpo.nextFloat();

        System.out.print("Digite a densidade inicial (kg/m³): ");
        float densidade = corpo.nextFloat();

        System.out.print("Digite a altura inicial (m): ");
        float altura = corpo.nextFloat();

        CorpoHumano c1 = new CorpoHumano(massa, volume, densidade, altura);

        System.out.println("Valores inciais");
        System.out.println("Massa: " + c1.getMassa() + " kg");
        System.out.println("Volume: " + c1.getVolume() + " m³");
        System.out.println("Densidade: " + c1.getDensidade() + " kg/m³");
        System.out.println("Altura: " + c1.getAltura() + " m");
        System.out.println("IMC: " + c1.calcularIMC());

        System.out.print("Digite uma nova massa (kg): ");
        float novaMassa = corpo.nextFloat();

        System.out.print("Digite uma nova altura (m): ");
        float novaAltura = corpo.nextFloat();

        c1.setMassa(novaMassa);
        c1.setAltura(novaAltura);

        System.out.println("Novos valores");
        System.out.println("Massa: " + c1.getMassa() + " kg");
        System.out.println("Altura: " + c1.getAltura() + " m");
        System.out.println("Novo IMC: " + c1.calcularIMC());

        corpo.close();



    }
}


