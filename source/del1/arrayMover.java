package del1;

import java.util.Arrays;

public class arrayMover {

	public static void main(String[] cmdLn){
		int[] test = new int[]{1,2,3,4,5,6,7,8,9};
		int[] test1 = arrayInsert(test, 7, 2);
		System.out.println(Arrays.toString(test1));	
	}
	
	public static int[] arrayInsert(int[] orgArray, int numb, int index){
		int[] newArray = new int[orgArray.length];
		
		for(int i = 0;i<index;i++){newArray[i]=orgArray[i];}
		
		for(int i = index; i < orgArray.length -1; i++)
		{
			newArray[i+1] = orgArray[i];
		}
		newArray[index] = numb;
		return newArray;
	}
}
