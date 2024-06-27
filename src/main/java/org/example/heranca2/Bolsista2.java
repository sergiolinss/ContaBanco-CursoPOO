package org.example.heranca2;

public class Bolsista2 extends Aluno2 {
    private float bolsa;

    public void RenovarBolsa(){
        System.out.println(" Renovando bolsa de " + this.nome);

    }

// @Override é um conceito de polimorfismo
    @Override
    public void pagarMensalidade(){
        System.out.println(this.nome + " é bolsista! pagamento facilitado");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
