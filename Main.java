public class Main {
    static SimpleAccount debit = new SimpleAccount();
    static CreditAccount credit = new CreditAccount(-50_000);

    public static void main(String[] args) {
        Menu.mainMenu();

    }
}
