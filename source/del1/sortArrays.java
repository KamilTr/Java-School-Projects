package del1;

import java.util.Arrays;

public class sortArrays {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		int[] test1 = new int[]{1,7,9,10};
		int[] test2 = new int[]{2,4,5,5};
		if(test1.length == 0 || test2.length == 0){
		}
		int[] newArray1 = mergeArrays(test1, test2);
		System.out.println(Arrays.toString(newArray1));
		boolean arrayOrder = orderCheck(newArray1);
		System.out.println(arrayOrder);
		
	}

	public static int[] mergeArrays(int[] a , int[] b){
		int[] newArray = new int[a.length + b.length];		
		int i = 0, j = 0, k = 0;
		
		while(i < a.length && j < b.length){
			newArray[k++] = a[i] < b[j] ? a[i++] :  b[j++];
		}
		while(i < a.length){
			newArray[k++] = a[i++];
		}
		while (j < b.length){
			newArray[k++] = b[j++];
		}

		return newArray;
		
	}
	
	public static boolean orderCheck(int[] old){
		int[] check = new int[old.length];
		boolean answer = false;
		
		for(int i = 0; i < old.length; i++){
			check[i] = old[i];
		}
		for(int j = 0; j < old.length-1; j++){
			if(check[j+1] > check[j]){
				answer = true;
			}
			else{
				answer = false;
			}
		}
		
		return answer;
	}
}
