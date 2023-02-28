package entities;

public class Funcionario {
    private String nome;
    private int horas;
    private double valorHora;

    public Funcionario(){
    }
    public Funcionario(String nome, int horas, double valorHora){
        this.nome = nome;
        this.horas = horas;
        this.valorHora = valorHora;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getHoras(){
        return horas;
    }
    public void setHoras(int horas){
        this.horas = horas;
    }

    public double getValorHora(){
        return valorHora;
    }

    public void setValorHora(double valorHora){
        this.valorHora = valorHora;
    }

    public double pagarFuncionario(){
        return horas * valorHora;
    }


}
