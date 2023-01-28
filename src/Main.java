public class Main {
    public static void main(String[] args) {

        int account = 500;

        int deposit = 2000;

        int bonus;

        if (deposit > 1000) {
            bonus = deposit / 100;

        } else {
            bonus = 0;
        }


        int totalAmount = account + deposit + bonus;

        System.out.println("Сумма Вашего счета: " + totalAmount + " рублей" + " (в том числе начислено бонусов: " + bonus + " рублей)");


    }
}