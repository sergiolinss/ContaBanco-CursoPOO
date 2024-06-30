package org.example.polimorfismo2;

public class Cachorro2 extends Mamifero2 {

    @Override
    public void emitirSom() {
        System.out.println("au au au");
    }

    //sobrecarga
    public void reagir(String frase) {
        if (frase == "toma comida" || frase == "Olá") {
            System.out.println(" abanar e latir");
        } else {
            System.out.println("Rosnar");
        }
    }

    //sobrecarga
    public void reagir(int hora, int minuto) {
        if (hora < 12) {
            System.out.println("Abanar");
        } else if (hora >= 18) {
            System.out.println("Ignorar");
        } else {
            System.out.println(" Abanar e latir ");
        }
    }

    //sobrecarga
    public void reagir(boolean dono) {
        if (dono) {
            System.out.println("Abanar");
        } else {
            System.out.println("Rosnar e latir");
        }
    }

    //sobrecarga
    public void reagir(int idade, float peso) {
        if (idade < 5) {
            if (peso < 10) {
                System.out.println("Abanar");
            } else {
                System.out.println("latir");
            }
        } else {
            if (peso < 10) {
                System.out.println("Rosnar");

            } else {
                System.out.println("Ignorar");
            }
        }
    }
}
