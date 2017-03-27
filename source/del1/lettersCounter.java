package del1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class lettersCounter {

	public static void main(String[] args) throws IOException{
		
		char[] table = new char[127];
		int counter = 0;
		for(int i = 0; i < table.length; i++){
			table[i] = (char)counter;
			counter++;
		}
		int[] big = new int[26];
		int[] small = new int[26];
		double[] amount = new double[26];
		double fullAmount = 0.0;
		
		String[] alphabetCaps = new String[]
				{"A","B","C","D","E","F","G","H","I","J","K","L","M",
				"N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		
		
		
		File file = new File("C:\\Users\\troja\\workspace\\Inlämning_1\\src\\test.txt");
		Scanner SC = new Scanner(file);
		while(SC.hasNextLine()) {
			
			String line = SC.nextLine();
			for(int i = 0; i < line.length(); i++){
				for(int j = 65; j < 91; j++){
					if( line.charAt(i) == table[j] ) {
				        big[j-65]++;
				    } 
					
				}
				for(int j = 97; j < 123; j++){
					if( line.charAt(i) == table[j]) {
						small[j-97]++;
				    } 	
				}
			}	
		}
		SC.close();
	
		for(int i = 0; i < 26; i++){
			amount[i] = big[i] + small[i];
			fullAmount = fullAmount + amount[i];
		}
		System.out.println("Bokstav \tantal\tFrekv");
		for(int i = 0; i < 26; i++){
			if(amount[i] != 0){
				double freq = (double)(amount[i]/fullAmount);
				freq = Math.round(freq*1000);
				freq = freq/10;
				System.out.println(alphabetCaps[i] + "\t" +"\t"+ (int)amount[i] +"\t" + freq + "%");			
			}
		}
	}
}

