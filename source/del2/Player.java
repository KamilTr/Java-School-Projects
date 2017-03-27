package del2;

import java.util.*;
	// kompletera med metoder och variabler som du behöver 
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
        // returnerar en string som inehåller spelare namnet, och lotto raderna som innehåller 7 och 6 rätt
         return "";
      }
     
      public String toString()
      {
       // returnerar en String med inehållet i ett Player-objekt
         return "";
      }
   
     
      public static void main( String [] arg)
      { // Den här klassen skall inte ha en main() men 
        // här har vi exempel som visar hur du lägger en array i en ArrayList
        // Den här main ska kan du ta bort när du vet detta..     
         
    	  
    	 ArrayList<int [] > lista =new ArrayList<int []>();
         int [] a={3,4,5};
         int [] b= {5,6,7};
         lista.add(a);
         lista.add(b);
         System.out.println(Arrays.toString(lista.get(0)));
      }
   
   }