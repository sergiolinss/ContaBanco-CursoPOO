package org.example.exercicioFinal;

public abstract class PessoaFinal {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected float experiencia;

    public PessoaFinal(String nome, int idade, String sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 0;
    }

    public void ganharExp(){

    }

    @Override
    public String toString() {
        return "PessoaFinal{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                ", experiencia=" + experiencia +
                '}';
    }
}
