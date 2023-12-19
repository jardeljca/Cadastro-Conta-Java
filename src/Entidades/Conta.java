package Entidades;

public class Conta {
    private int numConta;
    private String nomeTitular;
    private double saldo;

    //construtores para saldo zerado
    public Conta(int conta, String nomeTitular) {
        this.numConta = conta;
        this.nomeTitular = nomeTitular;
    }
    //construtores
    public Conta(int conta, String nomeTitular, double depositoInicial) {
        this.numConta = conta;
        this.nomeTitular = nomeTitular;
        deposito(depositoInicial);
    }

    //geters e seters

    public int getNumConta() {
        return numConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getsaldo() {
        return saldo;
    }

    //Métodos
    public void deposito(double valor){
        saldo = saldo + valor;
    }
    public void saque (double valor){
        saldo = saldo - (valor + 5);
    }

    //toString
    public String toString(){
        return "Conta "
                + numConta
                + ", Titular: "
                + nomeTitular
                + ", Saldo $ "
                + String.format("%.2f", saldo);
    }
}