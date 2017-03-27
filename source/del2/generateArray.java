package del2;
import java.util.ArrayList;
import java.util.Arrays;

public class generateArray {

	public static void main(String[] args) { //Main is only for testing 
		int size = 7;
		int min = 7;
		int max = 77;
		int[] uniqueArray = GenerateArray(size, min, max);
		System.out.println(Arrays.toString(uniqueArray));
	}

	public static int[] GenerateArray(int size, int min, int max){
		int[] sizeArray = new int[size];
		if(size <= (max-min)){
		ArrayList<Integer> list = new ArrayList<Integer>();		//Creates a ArrayList that is easily controlled for content. So every value is unlike
		
		while(list.size() < size){
			int element = (int)(Math.random()*(max - min) + min);	
			if(!(list.contains(element))){list.add(element);}		//if the element does not exist, add it
		}
		for(int i = 0; i<size; i++){sizeArray[i] = list.get(i);}		//transfers the values of Arraylist to a regular int array
		}
		else{sizeArray = null;}
		return sizeArray;
		
	}
}