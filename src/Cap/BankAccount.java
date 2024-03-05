package Cap;

public class BankAccount {

    private int balance;

    public BankAccount() {
        balance = 0;
    }

    //입금
    public void deposit(int amount) {
        if (isAmountValid(amount))
            balance += amount;
        else
            System.out.println("유효하지 않은 금액입니다.");
    }

    //출금
    public void withDraw(int amount) {
        if (isAmountValid(amount) && balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }

    public int getBalance() {
        return balance;
    }

    private boolean isAmountValid(int amount) {
        // 금액이 0보다 커야 함
        return amount > 0;
    }

}
