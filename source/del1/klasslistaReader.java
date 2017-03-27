package del1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class klasslistaReader {

	public static void main(String[] args) {

		File file = new File("C:\\Users\\troja\\workspace\\Inlämning_1\\src\\klasslista.txt");
		Scanner SC;
		ArrayList<String> klass = new ArrayList<String>();
		try {
			SC = new Scanner(file);

			while(SC.hasNextLine()) {klass.add(SC.nextLine());}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		ArrayList<String> testList = new ArrayList<String>();
		testList.add("Alma");
		testList.add("Börn");
		testList.add("Casper");
		testList.add("Kalle");
		testList.add("Per");
		testList.add("Sten");
		testList.add("Zalander");
		boolean tested = addToList(testList, "Kamil");
		System.out.println(tested);
					
	}

	 static boolean addToList (ArrayList<String> list, String name){
		 boolean anwser = false;
		 int place = 0;
		 if(!(list.contains(name))){
			 anwser =  true;
			 for(int i = 0; i<list.size(); i++){
				 String test = list.get(i);
				 int check = 0;
				 char a = (char)test.charAt(check);
				 char b = (char)name.charAt(check);
				 while(a==b){
					 check++;
					 a = test.charAt(check);
					 b = name.charAt(check);
				 }
				 if(b<a){
					list.add(i, name);
					place = i+1;
					break;
				 }
			 }
			 System.out.println("The name is #"+place+" on the list, and the list now contains " + list.size() + " names.");
		 }
		 return anwser;
	 }
} 
