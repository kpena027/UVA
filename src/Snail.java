package USACO2;

import java.util.Scanner;

public class Snail {

    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        int wellHeight;
        double distanceClimbed;
        int distanceLost;
        double fatiguePcnt;
        double amountLost;
        double currentHeight = 0;


        while ((wellHeight = sc.nextInt()) > 0) {
            distanceClimbed = sc.nextInt();
            distanceLost = sc.nextInt();
            fatiguePcnt = sc.nextInt();
            amountLost = distanceClimbed * fatiguePcnt / 100;
            int days = 0;

            while (currentHeight <= wellHeight && currentHeight >= 0) {
                days++;
                if (distanceClimbed > wellHeight) {
                    System.out.println("success on day " + days);
                    currentHeight = 0;
                    break;
                } else if (currentHeight < 0) {
                    System.out.println("failure on day " + days);
                    currentHeight = 0;
                    break;
                }
                currentHeight += distanceClimbed;

                if (currentHeight > wellHeight) {
                    System.out.println("success on day " + days);
                    currentHeight = 0;
                    break;
                }
                distanceClimbed -= amountLost;
                currentHeight -= distanceLost;
                if (distanceClimbed < 0)
                    distanceClimbed = 0;

                if (currentHeight < 0) {
                    System.out.println("failure on day " + days);
                    currentHeight = 0;
                    break;
                }
            }
        }
    }
}