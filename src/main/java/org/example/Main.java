package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ControleRemoto controle1 = new ControleRemoto();
        controle1.ligar();
        controle1.maisVolume();
        controle1.play();
        controle1.abrirMenu();
        controle1.fecharMenu();
    }
}   