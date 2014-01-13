import java.io.*;


public class Collatz {

	public static int findCycleLength(int x) {
		int counter = 1;
		while (x != 1) {
			counter++;
			if (x % 2 == 0) {
				x = x / 2;
			}
			else {
				x = 3 * x + 1;
			}
		}
		return counter;
	}

	static int solve(int i, int j) throws IOException 
	{
		int maxLength = 0;
		final int from, to;
		if (i < j) {
			from = i;
			to = j;
		}
			else {
			from = j;
			to = i;
			}
		for (int k = from; k <= to; k++) {
			int curLength = findCycleLength(k);
			if (curLength > maxLength) 
				maxLength = curLength;
		}
		return maxLength;
	}

	public static void main(String args[]) throws IOException 
	{
	      final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	      String line;
	      while((line = in.readLine()) != null)
	      {
	         String REGEX_WHITESPACE = "\\s+";
	         String cleanLine = line.trim().replaceAll(REGEX_WHITESPACE, " ");
	         String[] tokens = cleanLine.split(REGEX_WHITESPACE);
	        
	         if (tokens.length == 2) {
	           int i = Integer.parseInt(tokens[0]);
	           int j = Integer.parseInt(tokens[1]);
	           System.out.println(cleanLine + " " + solve(i, j));
	         }
	      }
	   }
}
