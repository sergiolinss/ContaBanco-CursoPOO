package org.example.UEC;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria() == l2.getCategoria() && l1 != l2) {
            setAprovada(true);
            desafiante = l1;
            desafiado = l2;
            System.out.println(" Luta aprovada ");
        } else {
            setAprovada(false);
            this.desafiado = null;
            this.desafiante = null;
            System.out.println(" Luta não foi aprovada ");
        }

    }

    public void lutar() {
        if (getAprovada()) {
            System.out.println("### Desafiado ###");
            this.desafiado.apresentar();
            System.out.println("### Desafiante ###");
            this.desafiante.apresentar();

            Random random = new Random();
            int vencedor = random.nextInt(3);

            switch (vencedor) {
                case 0: // empate
                    System.out.println(" A luta empatou");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;

                case 1: // Ganhou desafiado
                    System.out.println(this.desafiado.getNome() + " Venceu a luta ");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;

                case 2: // Ganhou desafiante
                    System.out.println(this.desafiante.getNome() + " Venceu a luta ");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }


        } else {
            System.out.println(" A luta não pode acontecer");
        }

    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }
}
