package CursoJava.secao14_Heranca_E_Polimorfismo.a03_Override_Super.entities;

public final class SavingsAccount extends Account{

    private Double interestRate;

    public SavingsAccount() {
    }

    public SavingsAccount(Double interestRate) {
        this.interestRate = interestRate;
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        balance += balance * interestRate;
    }

    @Override //informando ao compilador que esse método está sobrescrevendo outro da superclasse
    public final void withdraw(double amount) {
        balance -= amount;
    }

    public final void deposit(double amount) { //final indica que esse método não pode ser sobrescrito
        balance += amount;
    }

}
