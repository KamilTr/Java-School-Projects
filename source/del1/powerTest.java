package del1;

//D1U3 Testar 1000 lösenord, ifall dem klarar kriteriet samt om dem upprepas.
public class powerTest {

	public static void main(String[] args) {
		
		int[] tested = new int[2];
		String generated = "";
		int passed = 0;
		int repeted = 0;
		String notOk = "";
		int a = 0;
		for(int i = 0; i < 1001; i++){
			
			char[] passwordA = generatePassword.randomPassword();
			String passwordB = new String(passwordA);
			boolean check = passwordCheck.passwordChecks(passwordB);
			
			if(check==true){passed++;}else{notOk = notOk + " "+ passwordB;}
			if(generated.contains(passwordB) == true){repeted++;}
			generated = generated+ "\n" + passwordB; 
			a++;
	
		}
		tested[0] = passed;
		tested[1] = repeted;
		
		System.out.println(generated);
		System.out.println();
		System.out.println("Passed: " + tested [0] + " of " + a + " \n" + "Reapeted: " + tested[1] );
		System.out.println();
		System.out.println("Didn't pass; " + notOk);
	}

}
