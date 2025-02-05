public class Main {
    public static void main(String[] args) {
        System.out.println("БОНУС ОТ ОПЕРАТОРА");
        int balance = 300;
        int amount = 1_500;
        int bonus = 0;
        if (amount > 1000) {
            bonus = amount / 100;
        }
        int result = balance + amount + bonus;
        System.out.println("Ваш баланс: " + result);
    }
}