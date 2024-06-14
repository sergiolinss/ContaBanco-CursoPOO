package org.example;

import java.lang.reflect.Constructor;
import java.math.BigDecimal;

public class ContaBanco {
    public int numConta;
    protected String tipoConta;
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual(){
        System.out.println("Conta: " + getNumConta() );
        System.out.println("tipo: " + getTipoConta() );
        System.out.println("dono: " + getDono());
        System.out.println("saldo: " + getSaldo());
        System.out.println("status: " + getStatus());
    }

    public ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    }

    public void abrirConta(String tipoConta) {
        this.setTipoConta(tipoConta);
        this.setStatus(true);
        if (tipoConta == "CC"){ this.setSaldo(50);
        }else if (tipoConta == "CP"){ this.setSaldo(150);}
        System.out.println("Conta aberta com sucesso");
    }

   public void fecharConta() {
        if (this.getSaldo() > 0){
            System.out.println("Conta não pode ser fechada pois ainda tem saldo");
        } else if(this.getSaldo() < 0){
            System.out.println("Conta em débito");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");} // conta fechada com sucesso


    }
   public void depositar(float valorDoDeposito){
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() + valorDoDeposito);
            System.out.println("Deposito realizado na conta de " + getDono());}
        else {System.out.println("Impossível depositar");}

    }
   public void sacar(float valorDoSaque){
        if( this.getStatus())
        {
            if(this.getSaldo() >= valorDoSaque) {
              this.setSaldo(this.getSaldo() - valorDoSaque);
              System.out.println("saque realizado na conta de " + getDono());}
            else {System.out.println("Saldo insuficiente");}
        } else{
            System.out.println("Impossível sacar em conta fechada");
        }

    }
    public void pagarMensalidade(){
        int valorMensalidade = 0;
        if (this.getTipoConta() == "CC"){
            valorMensalidade = 12;
        } else if (this.getTipoConta() == "CP"){
            valorMensalidade = 20;
        }
        if(this.getStatus()){
            if (this.getSaldo() > valorMensalidade){
                saldo = saldo - valorMensalidade;
            } else {
                System.out.println("saldo insuficiente para cobrar a mensalidade");
            }
        } else {
            System.out.println("Impossível pagar, conta possivelmente desativada");
        }
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
