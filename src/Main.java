public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println();
        System.out.println("9.99 / 12 / 1_000_000");
        System.out.println(service.calculate(9.99, 12, 1_000_000));

        System.out.println();
        System.out.println("9.99 / 24 / 1_000_000");
        System.out.println(service.calculate(9.99, 24, 1_000_000));

        System.out.println();
        System.out.println("9.99 / 36 / 1_000_000");
        System.out.println(service.calculate(9.99, 36, 1_000_000));


    }
}