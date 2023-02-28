package entities;

public class FuncionarioTerceirizado extends Funcionario{
    private double despesaAdicional;

    public FuncionarioTerceirizado(){
    super();
    }
    public FuncionarioTerceirizado(String nome, int horas, double valorHora, double despesaAdicional){
        super(nome, horas, valorHora);
        this.despesaAdicional = despesaAdicional;
    }

    public double getDespesaAdicional(){
        return despesaAdicional;
    }
    public void setDespesaAdicional(){
        this.despesaAdicional = despesaAdicional;
    }

    @Override
    public double pagarFuncionario(){
        return (getHoras() * getValorHora()) + despesaAdicional * 1.1;

    }

}
