package del1;


public class passwordCheck {

	public static boolean passwordChecks(String password){
	
		String[] alphabet = new String[] 
				{"a","b","c","d","e","f","g","h","i","j","k","l","m",
				"n","o","p","q","r","s","t","u","v","w","x","y","z"};  
		String[] alphabetCaps = new String[]
				{"A","B","C","D","E","F","G","H","I","J","K","L","M",
				"N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		String[] number = new String[]
				{"0","1","2","3","4","5","6","7","8","9"};
		
		boolean foundA = false;
		boolean foundB = false;
		boolean foundC = false;
		
		for(int i = 0; i < alphabet.length; i++){
			
			if(password.contains(alphabet[i]))
				{foundA = true;}
			
			if(password.contains(alphabetCaps[i]))
				{foundB = true;}	
		}
		
		for(int j = 0; j < number.length; j++){
			
			if(password.contains(number[j]))
				{foundC = true;}
		}
	
		if(foundA == true && foundB == true && foundC == true){
			return true;}
		else{
			return false;
		}
	}
	
}
