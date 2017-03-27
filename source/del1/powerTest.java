//Del 1 Uppgift 3
package del1;

public class powerTest {

	public static void main(String[] args) {
		
		int[] tested = new int[2];
		String generated = ""; 								//This string will save all passwords
		int passed = 0;										//keeps count 
		int repeted = 0;
		String notOk = "";									//Saves every password that does not pass the test
		int a = 0;
		for(int i = 0; i < 1001; i++){
			
			char[] passwordA = generatePassword.randomPassword();//generates a password 
			String passwordB = new String(passwordA);//converts the password to a string
			boolean check = passwordCheck.passwordChecks(passwordB);//checks the password
			if(check==true){passed++;}else{notOk = notOk + " "+ passwordB;}
			if(generated.contains(passwordB) == true){repeted++;}
			generated = generated+ "\n" + passwordB; //saves all passwords to checks if 
			a++;
		}
		tested[0] = passed;
		tested[1] = repeted;
		
		/*System.out.println(generated);				this line can print every password that was created and tested*/						
		System.out.println();
		System.out.println("Passed: " + tested [0] + " of " + a + " \n" + "Reapeted: " + tested[1] );
		System.out.println();
		System.out.println("Didn't pass; " + notOk);
	}

}
