package del2;

import java.util.*;
	// kompletera med metoder och variabler som du beh�ver 
   public class Player
   {
   
      private String name;
      private ArrayList <int []> lottoraws;
	  private int nrOfRaws;
  
	        
      public Player(String thename)
      {
                  
         name=thename;			
         lottoraws=new ArrayList<int []>();
         int lenghtCounter = 0;
    	 while((thename.charAt(lenghtCounter) >= 65 && thename.charAt(lenghtCounter) <=91) || (thename.charAt(lenghtCounter) >= 97 && thename.charAt(lenghtCounter) <=122) || (thename.charAt(lenghtCounter) == 32)){
    		 lenghtCounter++;
    		 System.out.println(lenghtCounter);
    	 }
    	 int[] inputName = new int[lenghtCounter];
    	 for(int i = 0; i < lenghtCounter; i++){
    		 inputName[i] = thename.charAt(i);           		 
    	 }
    	 System.out.print(Arrays.toString(inputName));
    	 int nrOfRows = Integer.parseInt(thename.replaceAll("[\\D]", ""));
    	 System.out.println(nrOfRows);
    	 addPlayer(inputName);
    	 addLottoraws(nrOfRows);
    	 
      }
      public void addPlayer(int[] playerName){
    	  
    	  lottoraws.add(0, playerName);

      }  
      public void addLottoraws( int nr)
      {
         nrOfRaws=nr;
         for( int i=0;i<nrOfRaws;i++){
        	 lottoraws.add((generateArray.GenerateArray(7, 1, 35)));
         }
            ;
        //lottorows.add(Game.generateLottorow(7)); // metoden generateLottoRaw() skall finas Game klassen
      }  
         	
      public String getResult()
      {
        // returnerar en string som ineh�ller spelare namnet, och lotto raderna som inneh�ller 7 och 6 r�tt
         return "";
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