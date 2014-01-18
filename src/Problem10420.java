import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class Problem10420 {

	// List of conquests

	public static void main(String args[]) throws IOException, NumberFormatException {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		Map<String, Integer> countCountry = new TreeMap<String, Integer>();
		List<String> countries = new ArrayList<String>();
		
		for (int i = 0; i < T; i++) {
			String[] line = sc.next().split(" ");
			String firstWord = line[0];
			Integer freq = countCountry.get(firstWord);
			if (freq != null) {
				countCountry.put(firstWord, countCountry.get(firstWord) + 1);
			} else {
				countCountry.put(firstWord, 1);

			}
		}
        Iterator<Entry<String, Integer>> logIter = countCountry.entrySet().iterator();
        
        while (logIter.hasNext()) {
                Entry<String, Integer> ent = logIter.next();
                System.out.println(ent.getKey() + " " + ent.getValue());
        }

}
}