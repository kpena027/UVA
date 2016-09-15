import java.util.Scanner;

class Main {

    public static void main (String args[]) {

        int recordsToFollow;
        int monthNumber;
        int loanDuration;
        double dwnPayment;
        double loanAmount;
        double depPercent;
        double monthlyPayment;
        double[] depreciationArry = new double[101];
        Scanner sc = new Scanner(System.in);

        while ((loanDuration = sc.nextInt()) >= 0) {
            dwnPayment = sc.nextDouble();
            loanAmount = sc.nextDouble();
            recordsToFollow = sc.nextInt();
            monthlyPayment = loanAmount / loanDuration;
            double price = dwnPayment + loanAmount;
            double owe = loanAmount;
            double interestAmnt;

            for (int k = 0; k < depreciationArry.length; k++)
                depreciationArry[k] = 0;

            for (int i = 0; i < recordsToFollow; i++) {

                monthNumber = sc.nextInt();
                depPercent = sc.nextDouble();

                depreciationArry[monthNumber] = depPercent;

                if (i == recordsToFollow - 1) {
                    for (int j = 0; j < 101; j++) {
                        if (j > 0) {
                            owe -= monthlyPayment;
                        }
                        if (depreciationArry[j] == 0) {
                            depreciationArry[j] = depreciationArry[j - 1];
                        }
                        interestAmnt = price * depreciationArry[j];
                        price -= interestAmnt;
                        if (price > owe) {
                            if (j == 1) {
                                System.out.println(j + " month");
                                break;
                            }
                            else {
                                System.out.println(j + " months");
                                break;
                            }
                        }
                    }
                }
            }
        }
    }
}