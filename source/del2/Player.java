//Del 2	(Jag �r inte n�jd den delen, men v�ljer att skicka in den f�r att n� deadline. Lotteriet �r spelbart.)
package del2;

import java.util.*;
   public class Player
   {
   
      private String name;
      private ArrayList <int []> lottoraws;
	  private int nrOfRaws;
  
	        
      public Player(String thename)
      {
                  			
         lottoraws=new ArrayList<int []>();
         int lenghtCounter = 0;
    	 while((thename.charAt(lenghtCounter) >= 65 && thename.charAt(lenghtCounter) <=91) || (thename.charAt(lenghtCounter) >= 97 && thename.charAt(lenghtCounter) <=122) || (thename.charAt(lenghtCounter) == 32)){
    		 lenghtCounter++;
    	 }
    	 int[] inputName = new int[lenghtCounter];
    	 for(int i = 0; i < lenghtCounter; i++){
    		 inputName[i] = thename.charAt(i);           		 
    	 }
    	 int nrOfRows = Integer.parseInt(thename.replaceAll("[\\D]", ""));
    	 addPlayer(inputName);
    	 addLottoraws(nrOfRows);
    	 
      }
      public void addPlayer(int[] playerName){
    	  
    	  lottoraws.add(0, playerName);
    	  for(int i = 0; i < playerName.length; i++) name = name + String.valueOf(((char)playerName[i]));
      }  
      public void addLottoraws( int nr)
      {
         nrOfRaws=nr;
         for( int i=0;i<nrOfRaws;i++){
        	 lottoraws.add((generateArray.GenerateArray(7, 1, 35)));
         }
      }  
         	
      public String getResult(int[] winningRow)
      {
    	  ArrayList<int[]> sixCorrect = new ArrayList<int[]>();
    	  ArrayList<int[]> sevenCorrect = new ArrayList<int[]>();
    	  for(int i = 0; i < lottoraws.size(); i++){
    		  int[] testArray = lottoraws.get(i);
    		  int rightCounter = 0;
    		  for(int j = 0; j < winningRow.length; j++){
    			  for(int k = 0; k < testArray.length;k++){
    				  if(testArray[k] == winningRow[j]) rightCounter++;    			  
    				  }
    		  }
    		  if(rightCounter==6) sixCorrect.add(testArray);
    		  if(rightCounter==7) sevenCorrect.add(testArray);
    	  }
    	  String six = "";
    	  String seven = "";
    	  if(sixCorrect.size() != 0){
    		  for(int i = 0; i<sixCorrect.size(); i++){
    		  six = six + Arrays.toString((sixCorrect.get(i)))+ "\n";
    		  }
    	  }
    	  if(sevenCorrect.size() != 0){
    		  for(int i = 0; i<sevenCorrect.size(); i++){
    		  seven = seven + Arrays.toString((sevenCorrect.get(i)))+ "\n";
    		  }
    	  }
    	  String anwser = name + " hade inga vinnande lotter.";
    	  if(sixCorrect.size() > 0 && sevenCorrect.size() < 1)anwser = name + "hade 6 r�tt i lott:\n" + six;
    	  if(sixCorrect.size() < 1 && sevenCorrect.size() > 0)anwser = name + "hade 7 r�tt i lott:\n" + seven;
    	  if(sixCorrect.size() > 0 && sevenCorrect.size() > 0)anwser = name + "hade 6 r�tt i lott:\n" + six + "\n Hade 7 r�tt i lott:\n" + seven;
        // returnerar en string som ineh�ller spelare namnet, och lotto raderna som inneh�ller 7 och 6 r�tt
         return anwser;
      }
     
      public String toString()
      {
       // returnerar en String med ineh�llet i ett Player-objekt
         return "";
      }
   
     
      public static void main( String [] arg)
      { // Den h�r klassen skall inte ha en main() men 
        // h�r har vi exempel som visar hur du l�gger en array i en ArrayList
        // Den h�r main ska kan du ta bort n�r du vet detta..     
         
    	  
    	 ArrayList<int [] > lista =new ArrayList<int []>();
         int [] a={3,4,5};
         int [] b= {5,6,7};
         lista.add(a);
         lista.add(b);
         System.out.println(Arrays.toString(lista.get(0)));
      }
   
   }