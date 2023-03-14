public class CreditPaymentService {
    public int calculate(double interestRate, int periodInMonths, int loanAmount) {
        double i = interestRate / 12 / 100;
        double extent = Math.pow((1 + i), periodInMonths);
        double ratio = i * extent / (extent - 1);
        double monthlyInstallment = ratio * loanAmount;
        return (int) monthlyInstallment;


    }

}
