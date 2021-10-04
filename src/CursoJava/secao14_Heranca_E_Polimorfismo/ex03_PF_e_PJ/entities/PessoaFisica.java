package CursoJava.secao14_Heranca_E_Polimorfismo.ex03_PF_e_PJ.entities;

public class PessoaFisica extends Pessoa {

    public Double gastosComSaude;

    public PessoaFisica(String nome, Double renda, Double gastosComSaude) {
        super(nome, renda);
        this.gastosComSaude = gastosComSaude;
    }

    public Double getGastosComSaude() {
        return gastosComSaude;
    }

    public void setGastosComSaude(Double gastosComSaude) {
        this.gastosComSaude = gastosComSaude;
    }

    @Override
    public Double impostoDevido() {
        if (getRenda() < 20000.0) {
            return (getRenda() * 0.15) - (gastosComSaude * 0.5);
        } else {
            return (getRenda() * 0.25) - (gastosComSaude * 0.5);
        }
    }
}
