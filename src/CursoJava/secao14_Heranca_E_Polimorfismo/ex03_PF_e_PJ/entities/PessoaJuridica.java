package CursoJava.secao14_Heranca_E_Polimorfismo.ex03_PF_e_PJ.entities;

public class PessoaJuridica extends Pessoa{

    private Integer numFuncionarios;

    public PessoaJuridica(String nome, Double renda, Integer numFuncionarios) {
        super(nome, renda);
        this.numFuncionarios = numFuncionarios;
    }

    public Integer getNumFuncionarios() {
        return numFuncionarios;
    }

    public void setNumFuncionarios(Integer numFuncionarios) {
        this.numFuncionarios = numFuncionarios;
    }

    @Override
    public Double impostoDevido() {
        if (getNumFuncionarios() <= 10) {
            return getRenda() * 0.16;
        } else {
            return getRenda() * 0.14;
        }
    }
}
