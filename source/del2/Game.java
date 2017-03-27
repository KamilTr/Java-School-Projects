package del2;
//Ett Spel är en ArrayList av Spelare. Varje spelare har en ArrayList som håller flera lottorader 
//samt annat namn, insats, mm . Följande skall programmet göra.
//Skapa Spelare men namn, antal önskade lottorader 
//Lägg spelaren i palyerList
//Kör lottodragning 
//Hitta de som har 7 och 6 rätt. Kriv ut namn på dessa spelare. 
 
import java.util.*;
public class Game
 {
	static Scanner scan = new Scanner(System.in);  
 
    static ArrayList<Player> playerList;       
    static int [] gameNumbers; 
    public static void main( String [] arg)
    {
    	System.out.println("\n  Välkomna till lotteriet");
       printMenu();
       int choice = scan.nextInt();
       scan.nextLine(); 
    
       while (choice != 0)
       {
          dispatch(choice);
          printMenu();
          choice = scan.nextInt();
          scan.nextLine();  
       }
    
    }// slut main
   
   
   
    public static void dispatch(int choice)
    {
     switch(choice)
       {
          case 0:
             { 
                System.out.println("Spelet avslutat");
                System.exit(0);
                break;
             }
          case 1:
             {
                playerList=new ArrayList<Player>();
                gameNumbers=new int [10];
                System.out.println("\nNytt spel har skapats, du kan börja lägga till spelare");

             
             	// startar ny lotteriet och lottodragning
                               	               			
                break;
             }
          case 2:
             {
            	 System.out.print("\nAnge: Namn och antal önskade lottorader  : ");
            	 String inputCreate = scan.nextLine();
            	 playerList.add(new Player(inputCreate));
                // Så länge användaren vill läggs till nya spelare till lotteriet
             	// Spelarna skall välja antal rader de spelar
             	// lottonummer annars skall genereras automatisk 
       						
                break;
             }	 
          case 3:
             {
                gameNumbers= generateArray.GenerateArray(10, 1, 35);
                break;
             }
          	
          case 4:
             {
            	 System.out.println("The winning numbers are:" + Arrays.toString(gameNumbers) + "\n");
                 for(int i = 0; i < playerList.size(); i++)System.out.println((playerList.get(i)).getResult(gameNumbers));
             	 break;
             }
                      
          default:
             System.out.println("Sorry, fel val");
       }
    }
 
 
   
   
    public static void printMenu()
    {
       System.out.println("   ====");
       System.out.println("0: Avsluta spel");
       System.out.println("1: Skapa nytt Spel");
       System.out.println("2: Skapa ny Spelare");
       System.out.println("3: Kör lottodragnig");
       System.out.println("4: Visa resultat" );
             
       System.out.print("\nVälj operation: ");
    }
 	
 
 
 // metoder som kan behövas i denna klass
 // skapa och returnera en lotorad:  generateLottoRaw()
 // hitta alla spelare med 7 och 6 rätt
    
 }