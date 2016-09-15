import java.util.Scanner;

public class Main {

    static void eventPlanning11559() {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {

            int numParticipants = sc.nextInt();
            int budget = sc.nextInt();
            int hotels = sc.nextInt();
            int weeks = sc.nextInt();
            int bedsAvailable;
            int hotelCost;
            int minCost = 200000000;

            for (int i = 0; i < hotels; i++) {
                hotelCost = sc.nextInt();

                for (int j = 0; j < weeks; j++) {
                    bedsAvailable = sc.nextInt();

                    if (bedsAvailable >= numParticipants) {

                        if (numParticipants * hotelCost < budget) {
                            minCost = Math.min(minCost, hotelCost * numParticipants);
                        }
                    }
                }
            }
            if (minCost <= budget)
                System.out.println(minCost);
            else
                System.out.println("stay home");
                 }
            }
    public static void main(String[] args) throws IOException {
          eventPlanning11559();
     }
}





