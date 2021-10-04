package CursoJava.secao14_Heranca_E_Polimorfismo.a03_Override_Super.entities;

public final class BusinessAccount extends Account {
    //final indica que a classe não pode ser herdada
    //e indica que um método não pode ser sobrescrito

    private Double loanLimit;

    public BusinessAccount() {
    }

    public BusinessAccount(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount) {
        if (amount <= loanLimit) {
            balance += amount - 10.0;
        }
    }

    @Override
    public final void withdraw(double amount) {
        super.withdraw(amount);
        balance -= 2.0;
    }

    public final void deposit(double amount) {
        balance += amount;
    }
}
