import java.util.Scanner;

public class Menu {
    public static void mainMenu() {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.printf("Выберите действие:\n" +
                    "1. Посмотреть баланс\n" +
                    "2. Пополнить счет\n" +
                    "3. Оплатить\n" +
                    "4. Выполнить перевод\n" +
                    "5. Выход\n");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Баланс дебитового счета - " + Main.debit.getBalance());
                    System.out.println("Баланс дебитового счета - " + Main.credit.getBalance());
                    break;
                case 2 :
                    System.out.printf("Выберите счет для пополнения:\n" +
                            "1. Дебитовый счет\n" +
                            "2. Кредитный счет\n");
                    switch (sc.nextInt()){
                        case 1 :
                            System.out.print("Введите сумму пополнения: ");
                            System.out.println(Main.debit.add(sc.nextInt()) ?
                                    "ОПЕРАЦИЯ ВЫПОЛНЕНА!" : "Отмена операции");
                            break;
                        case 2:
                            System.out.print("Введите сумму пополнения: ");
                            System.out.printf(Main.credit.add(sc.nextInt()) ?
                                    "ОПЕРАЦИЯ ВЫПОЛНЕНА!" : "ОТМЕНА, ЗАДОЛЖНОСТЬ - %d\n", Main.credit.getBalance());
                            break;
                        default :
                            System.out.println("Возврат в меню");
                    }
                    break;
                case 3 :
                    System.out.printf("Выберите счет для оплаты:\n" +
                            "1. Дебитовый счет\n" +
                            "2. Кредитный счет\n");
                    switch (sc.nextInt()){
                        case 1 :
                            System.out.print("Введите сумму списания: ");
                            System.out.println(Main.debit.pay(sc.nextInt()) ?
                                    "ОПЕРАЦИЯ ВЫПОЛНЕНА!" : "НЕДОСТАТОЧНО СРЕДСТВ!");
                            break;
                        case 2:
                            System.out.print("Введите сумму списания: ");
                            System.out.println(Main.credit.pay(sc.nextInt()) ?
                                    "ОПЕРАЦИЯ ВЫПОЛНЕНА!" : "НЕДОСТАТОЧНО СРЕДСТВ!");
                            break;
                        default :
                            System.out.println("Возврат в меню");
                    }
                    break;
                case 4 :
                    System.out.printf("Перевод может быть выполнен только с дебитового счета\n" +
                            "Введите сумму перевода: ");
                    System.out.printf(
                    Main.debit.transfer(Main.credit, sc.nextInt()) ?
                            "ОПЕРАЦИЯ ВЫПОЛНЕНА!" : "ОТМЕНА, ЗАДОЛЖНОСТЬ - %d\n", Main.credit.getBalance());
                    break;
                default :
                    System.out.println();
                    break;
            }

        } while (choice != 5);
    }
}
