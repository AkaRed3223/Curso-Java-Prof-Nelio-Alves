package CursoJava.secao18_Interfaces.a01_Ex01_SemInterface.model.services;

public class BrazilTaxService {

    public double tax(double amount) {
        if (amount <= 100.0) {
            return amount * 0.2;
        } else {
            return amount * 0.15;
        }
    }
}
