package Mypac;

//package whatever; // don't place package name!
//Installed Libraries: JSON-Simple, JUNit 4, Apache Commons Lang3

//Bring all the zeroes to the end of the array
//Input = [1, 0, 2, 0, 4, 0, 2, 3]
//Output = [1, 2, 4, 2, 3, 0, 0, 0] 

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.plaf.FontUIResource;
class Interview_qns {
	public static void main (String[] args) {
//		System.out.println("Hello Java");
// 
// Integer[] a= {1,0,2,0,4,0,2,3};
// for(int i=0; i<a.length-1; i++){
//   for(int j=0;j<a.length-1-i; j++){
//   if(a[j]==0){
//     int temp;
//     temp=a[j];
//     a[j]=a[j+1];
//     a[j+1]=temp;
//     
//   }
//   }
// }
// System.out.println(Arrays.toString(a));
// 
// Integer[] b= new Integer[a.length];
// 
//// reverse array a into b 
// for(int i=0; i<a.length;i++) {
//	 b[i]=a[a.length-i-1];
//	 
//	 
// }
// System.out.println(Arrays.toString(b));
//// Collections.reverse(Arrays.asList(a));
// 
 
		

String[] input={"ABC", "DEF","ABC","FGH","DEF","PQR","ABC","XYZ"};

HashMap<String, Integer> hs=new HashMap<String, Integer>();

for (String st : input) {
	
int count=0;
if(hs.containsKey(st)) count=hs.get(st);
hs.put(st,++count);

}

int v=Collections.max(hs.values());



for(Entry<String, Integer> st : hs.entrySet()) {
	
	if(st.getValue().equals(v)) {
		
		System.out.println("Maximum times entered value is "+st.getKey());
		
	}
}
		
		
		
		
		
		
		
		
		
	}
	
}


//o/p: [1, 2, 4, 2, 3, 0, 0, 0]
