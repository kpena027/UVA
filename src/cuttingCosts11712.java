import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

// @JUDGE_ID:  11727  Java "Cutting Costs"
public class Main {

    static void cuttingCosts11712() throws IOException {

        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        int[] array = new int[3];

        for (int J = 1; J <= testCases; J++) {
            array[0] = sc.nextInt();
            array[1] = sc.nextInt();
            array[2] = sc.nextInt();
            Arrays.sort(array);

            System.out.println("Case " + J + 1 + ": " + array[1]);
        }
    }
     public static void main(String[] args) throws IOException{
          cuttingCosts11712();
     }
}
