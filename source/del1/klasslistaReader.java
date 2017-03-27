//Del 1 Uppgift 8
package del1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class klasslistaReader {

	private static ArrayList<String> testList = new ArrayList<String>();	//Creates a ArrayList for testing the method
	public static void main(String[] args) {

		File file = new File("klasslista.txt");
		Scanner SC;
		ArrayList<String> klass = new ArrayList<String>();
		try {
			SC = new Scanner(file);
			while(SC.hasNextLine()) {klass.add(SC.nextLine());}		//Reads an list with names and adds them to an arraylist
			
		} catch (FileNotFoundException e) {			//will throw an exception message if the file is not found
			e.printStackTrace();
		}
		testList.add("Alma");
		testList.add("Börn");
		testList.add("Casper");
		testList.add("Kalle");
		testList.add("Per");
		testList.add("Sten");
		testList.add("Zalander");
		boolean tested = addToList(testList, "Kamil");
		System.out.println(tested);
		System.out.println("The new list:\n" + testList);

					
	}

	 static boolean addToList (ArrayList<String> list, String name){
		 boolean anwser = false;
		 if(!(list.contains(name))){
			 anwser =  true;
			 for(int i = 0; i<list.size(); i++){
				 String test = list.get(i);
				 int check = 0;
				 char a = (char)test.charAt(check);
				 char b = (char)name.charAt(check);
				 while(a==b){						//this loop looks for a difference in letters if two names either have the same first name or are similar 
					 check++;
					 a = test.charAt(check);
					 b = name.charAt(check);
				 }
				 if(b<a){
					list.add(i, name);
					break;
				 }
			 }
		 }
		 return anwser;
	 }
} 
