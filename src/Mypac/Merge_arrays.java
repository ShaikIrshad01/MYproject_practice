package Mypac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class Merge_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Input: list1 = [1,2,4], list2 = [1,3,4]
//				Output: [1,1,2,3,4,4]
		Integer[] l1= {1,2,4};
		Integer[] l2= {1,3,4};
		
		int length=l1.length+l2.length;
		Integer[] l3= new Integer[length];
		
//		Arrays.copyOf(l1,0, l3,0,l1.length );
//		
//		ArrayList<Integer> t= new ArrayList<Integer>(Arrays.asList(l1));
//		t.addAll(Arrays.asList(l2));
//		System.arraycopy(l1, 0, l3, 0, l1.length);
//		System.arraycopy(l2, 0, l3, l1.length, l3.length);
		
//		Arrays.sort(l3);
		
		
		for(int i=0; i<l1.length;i++) {
			
			l3[i]=l1[i];
			
		}
	
		for (int i =l1.length ; i <length; i++) {
			l3[i]=l2[i-l1.length];
		}
		
//		System.out.println(l3);
	
//		Integer[] k= Arrays.copyOf(l1, length);
		
		Arrays.sort(l3);
//		for (int i = 0; i < l3.length-1; i++) {
//			
//			for (int j = 0; j < l3.length-1-i; j++) {
//				
//				if(l3[j]>l3[j+1]) {
//					int temp=l3[j];
//					l3[j]=l3[j+1];
//					l3[j+1]=temp;
//				}
//				
//			}
//		}
		
		
		for (Integer i : l3) {
			System.out.print(i);
			
		}
		
	}

}
