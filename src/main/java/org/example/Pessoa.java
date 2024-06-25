package org.example;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public void FazerAniversario() {
        this.setIdade(getIdade() + 1);
        System.out.println(this.getNome() + " Fez aniversário, a idade dele agora é " + getIdade());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        if (sexo.equalsIgnoreCase("masculino") || sexo.equalsIgnoreCase("feminino")) {
            this.sexo = sexo;
        } else {
            System.out.println(" Sexo inválido ");
        }
    }

}
