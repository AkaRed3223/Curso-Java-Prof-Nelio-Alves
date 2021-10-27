package CursoJava.secao18_Interfaces.e01_Parcelas.services;

public interface OnlinePaymentService {

    double paymentFee(double amount);
    double interest(double amount, int months);

}
