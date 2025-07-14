public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Иван Иванов");
        BankAccount account2 = new BankAccount("Петр Петров");

        System.out.println("Баланс account1: " + account1.getBalance());
        System.out.println("Баланс account2: " + account2.getBalance());

        boolean depositResult = account1.deposit(1000);
        System.out.println("Пополнение на 1000: " + (depositResult ? "Успешно" : "Неудача"));
        System.out.println("Баланс account1: " + account1.getBalance());

        boolean withdrawResult = account1.withdraw(1500);
        System.out.println("Снятие 1500: " + (withdrawResult ? "Успешно" : "Неудача"));
        System.out.println("Баланс account1: " + account1.getBalance());

        withdrawResult = account1.withdraw(500);
        System.out.println("Снятие 500: " + (withdrawResult ? "Успешно" : "Неудача"));
        System.out.println("Баланс account1: " + account1.getBalance());

        boolean transferResult = account1.transfer(account2, 300);
        System.out.println("Перевод 300: " + (transferResult ? "Успешно" : "Неудача"));
        System.out.println("Баланс account1: " + account1.getBalance());
        System.out.println("Баланс account2: " + account2.getBalance());

        account1.setBlocked(true);
        transferResult = account1.transfer(account2, 100);
        System.out.println("Перевод с заблокированного счета: " + (transferResult ? "Успешно" : "Неудача"));
    }
}