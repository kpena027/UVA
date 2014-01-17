import java.io.*;
import java.util.*;

	// What's Cryptanalysis?
public class Problem10008 {

	
	public static void main(String[] args) throws IOException, NumberFormatException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        HashMap<String, Integer> countMap = new HashMap<>();
        for (int i = 0; i < T; i++) { 	
    	   String s = bf.readLine().toUpperCase();
        for (int j = 0; j < s.length(); j++) {
        	char c = s.charAt(j);
        	if (Character.isLetter(c)) {
        		String st = (s.charAt(j) + "");
        		if (countMap.get(st) != null) 
        			countMap.put(st, countMap.get(st) +1);
        		else 
        			countMap.put(st, 1);
        	}
        }
        }
        Map<String, Integer> ordered = new TreeMap<String, Integer>(countMap);
		Set<String> keys = ordered.keySet();
		TreeSet<Integer> numbers = new TreeSet<Integer>(ordered.values());
		for (Iterator<Integer> it = numbers.descendingIterator(); it.hasNext();) {
		{
			int value = it.next();
			for (String j: keys)
				if (ordered.get(j) == value)
	    	System.out.println(j + " " + ordered.get(j));
		}

		
	        }   
	}
}

