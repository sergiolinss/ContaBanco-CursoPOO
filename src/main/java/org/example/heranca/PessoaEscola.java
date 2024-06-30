package org.example.heranca;

public class PessoaEscola {
    private String nome;
    private int idade;
    private String sexo;

    public void fazerAniversario(){
        this.idade++;
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
        if(sexo.equalsIgnoreCase("masculno") || sexo.equalsIgnoreCase("m")){
            this.sexo = sexo;
            System.out.println(sexo);
        }
        else if(sexo.equalsIgnoreCase("feminino" ) || sexo.equalsIgnoreCase("f")){
            this.sexo = sexo;
        } else {
            System.out.println(" Sexo inválido, procure um psiquiatra ");
        }

    }

    @Override
    public String toString() {
        return "PessoaEscola{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
