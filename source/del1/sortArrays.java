//Del 1 Uppgift 6			(Uppgift 7 finns i del2 då den användes där)
package del1;

import java.util.Arrays;

public class sortArrays {

	public static void main(String[] args){
		int[] arrayOne = new int[]{1,7,9,10};
		int[] arrayTwo = new int[]{2,5,5};
		int[] arrayThree = new int[]{23,14,25,32,3};
		int[] arrayFour;
		arrayFour = null;
		int[] arrayFive = null;
		int[] arraySix= null;

		int[] theArray = mergeArrays(arrayOne, arrayTwo);	//tests while on is shorter and has doublets 
		System.out.println(Arrays.toString(theArray));
		boolean arrayOrder = check(theArray);
		System.out.println(arrayOrder);
		
		int[] theArrayTwo = mergeArrays(arrayThree, arrayFour);			//tests while one is null
		System.out.println(Arrays.toString(theArrayTwo));
		boolean arrayOrderTwo = check(theArrayTwo);
		System.out.println(arrayOrderTwo);
		
		int[] theArrayThree = mergeArrays(arrayFive, arraySix);			//test while both arrays are null
		System.out.println(Arrays.toString(theArrayThree));
		boolean arrayOrderThree = check(theArrayThree);
		System.out.println(arrayOrderThree);
		
	}

	public static int[] mergeArrays(int[] a , int[] b){
		int[] newArray;		//creates the new array

		if(a == null || b == null){newArray = null;}
		else{
			newArray = new int[a.length + b.length];
			int i = 0, j = 0, k = 0;
			while(i < a.length && j < b.length){newArray[k++] = a[i] < b[j] ? a[i++] :  b[j++];}		//tried a new way for "if", a[i] < b[j] is a bool statement, if its true (newArray[k] = a[i]) will be executed. If not newArray[k] = b[i] every variable that has "++" behind will be added +1 after
			while(i < a.length){newArray[k++] = a[i++];}
			while (j < b.length){newArray[k++] = b[j++];}
		}
			
		return newArray;

	}
	
	public static boolean check(int[] old){
		boolean answer = false;
		if(old != null){
			int[] check = new int[old.length];
			answer = false;
			
			for(int i = 0; i < old.length; i++){check[i] = old[i];}
			for(int j = 0; j < old.length-1; j++){if(check[j+1] > check[j]){answer = true;}
				else{answer = false;}
			}
		}
		return answer;
	}
}
