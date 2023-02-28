package Mypac;
import java.util.*;
public class Sample_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		System.out.println("Common elements in both arrays "+common_elements(new Integer[] { 1, 3, 2, 4, 8, 9, 0 },  new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5 }));
//		
//
//		System.out.println("Uncommon elements in both arrays "+uncommon_elements(new Integer[] { 1, 3, 2, 4, 8, 9, 0 },  new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5 }));
//		
//		String[] fruits = {"mango","apple","banana","banana","mango","apple","banana","apple","banana","orange","kiwi"};
//		
//		for (String p : fruits) {
//			System.out.print(p+" ");
//			
//		}
//		System.err.println();
//		for (int i=0; i<fruits.length; i++ ) {
//			
//			fruits[i]=reverse_string(fruits[i]);
//			
//		}
//		System.out.println();
//		for (String p : fruits) {
//			System.out.print(p+" ");
//			
//		}
//		System.err.println();
		
		
//	String s=String.join(", ", fruits);
//	System.out.println(s);


		
//		int c=0,a,temp;  
//		   int n=153;//It is the number to check Armstrong  
//		   temp=n;  
//		   while(n>0)  
//		   {  
//		   a=n%10;  
//		   n=n/10;  
//		    c=c+(a*a*a);  
//		    }  
//		    if(temp==c)  
//		    System.out.println("armstrong number");   
//		    else 
//		        System.out.println("Not armstrong number");  
//		
		
//		// second largest number
//		int arr[] = { 100,14, 46, 47, 94, 94, 52, 86, 36, 300, 89 };
//        int largest = 0;
//        int secondLargest = 0;
//        System.out.println("The given array is:");
//        for (int i = 0; i < arr.length; i++)
//        {
//            System.out.print(arr[i] + "\t");
//        }
//        for (int i = 0; i < arr.length; i++)
//        {
//            if (arr[i] > largest)
//            {
//                secondLargest = largest;
//                largest = arr[i];
//            }
//            else if (arr[i] > secondLargest)
//            {
//                secondLargest = arr[i];
//            }
//        }
//        System.out.println("\nSecond largest number is:" + secondLargest);
//        System.out.println("Largest Number is: "  +largest);
//    
		
//		//Remove white spaces
//		String str1 = "Saket Saurav        is an Autom ation Engi ne      er";
//		  
//        StringBuffer sb = new StringBuffer();
//  
//        for (int i = 0; i <str1.length(); i++)
//        {
//            if( (str1.charAt(i) != '\s') && (str1.charAt(i) != '\t') )
//            {
//                sb.append(str1.charAt(i));
//            }
//        } 
//        System.out.println(sb);  
//		
		
		
//		
//		String strr = new String("samplee");
//
//        char[] chars = strr.toCharArray();
//        System.out.println("Duplicate characters are:");
//        for (int i=0; i<strr.length();i++) {
//                    for(int j=i+1; j<strr.length();j++) {
//                               if (strr.charAt(i) == strr.charAt(j)) {
//                                          System.out.println(strr.charAt(j));
//                                         
//                                          break;
//                                }
//                     }}
		
//		Map<Character, Integer> mapp= new HashMap<>();
//		for (char cc1 : strr.toCharArray()) {
//			int count=0;
//		if(mapp.containsKey(cc1)) count =mapp.get(cc1);
//		mapp.put(cc1, ++count);
			
//		}
//		System.out.println(mapp);
		
		
		
//		String str= "HellolleH" ;
//		String reverse="";
//		for (char c : str.toCharArray()) {
//			reverse=c+reverse;
//		}
//		System.out.println(reverse);
//		System.out.println(str.equalsIgnoreCase(reverse));
//		if(str.equalsIgnoreCase(reverse)) System.out.println("Palindrome ");
//		else System.out.println("Not Palindrome ");
		
		
		// Creating an object of Set class 
        // Declaring object of Integer type 
		
//        Set<Integer> a = new HashSet<Integer>();
//        
//        // Adding all elements to List 
//        a.addAll(Arrays.asList(
//            new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));
//        
//      // Again declaring object of Set class
//      // with reference to HashSet
//        Set<Integer> b = new HashSet<Integer>();
//          
//      b.addAll(Arrays.asList(
//            new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5 }));
//  
		
//          
//        // To find union
//        Set<Integer> union = new HashSet<Integer>(a);
//        union.addAll(b);
//        System.out.print("Union of the two Set");
//        System.out.println(union);
//  
//        // To find intersection
//        Set<Integer> intersection = new HashSet<Integer>(a);
//        intersection.retainAll(b);
//        System.out.print("Intersection of the two Set");
//        System.out.println(intersection);
//  
//        // To find the symmetric difference
//        Set<Integer> difference = new HashSet<Integer>(a);
//        difference.removeAll(b);
//        System.out.print("Difference of the two Set");
//        System.out.println(difference);
//        
//        Set<Integer> difference1 = new HashSet<Integer>(b);
//        difference1.removeAll(a);
//        System.out.print("Difference of the two Set");
//        System.out.println(difference1);
//        
//        Set<Integer> final_diff = new HashSet<Integer>();
//        final_diff.addAll(difference);
//        final_diff.addAll(difference1);
//        System.out.println(final_diff);
		
		TreeSet<String> ts = new TreeSet<String>();
		
		  
        // Adding elements into the TreeSet
        // using add()
        ts.add("India");
        ts.add("Australia");
        ts.add("South Africa");
  
        // Adding the duplicate
        // element
        ts.add("India");
        
        System.out.println(ts);
        TreeSet<String> tss = new TreeSet<String>(ts);
        Iterator<String> i =  tss.descendingIterator();
	        while (i.hasNext()) 
				System.out.println( i.next());
				
	        Map<String, Integer> hm
            = new HashMap<String, Integer>();
  
        // Inserting pairs in above Map
        // using put() method
        hm.put("a", 100);
        hm.put("b",200);
        hm.put("c", 300);
        hm.put("d", 400);
  
        // Traversing through Map using for-each loop
        for (Map.Entry<String, Integer> me :
             hm.entrySet()) {
  
            // Printing keys
            System.out.print(me.getKey() + ":");
            
            System.out.println(me.getValue());
    
        }
        
      
        
        Map<String, Integer> map = new TreeMap<>();
        
        // Inserting custom elements in the Map
        // using put() method
        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);
  
        // Iterating over Map using for each loop
        for (Map.Entry<String, Integer> e : map.entrySet())
        	
            // Printing key-value pairs
            System.out.println(e.getKey() + " "
                               + e.getValue());
       
        
        System.out.println(map);
	}

	
	public static <T> Set<T> common_elements(T a[], T b[]) {
		
		Set<T> intersection = new HashSet<T>(Arrays.asList(a));
        intersection.retainAll(Arrays.asList(b));
//        System.out.print("Intersection of the two Set");
//        System.out.println(intersection);
		
		return intersection;
		
	}

	public static String reverse_string(String a) {
		
		String s1="";
		for (char c  : a.toCharArray()) s1=c+s1;
		return s1;
	}
	
	

public static <T> Set<T> uncommon_elements(T a[], T b[]) {
	
	Set<T> uncommon1 = new HashSet<T>(Arrays.asList(a));
	uncommon1.removeAll(Arrays.asList(b));

	Set<T> uncommon2 = new HashSet<T>(Arrays.asList(b));
	uncommon2.removeAll(Arrays.asList(a));
	
	Set<T> uncommon = new HashSet<T>(uncommon1);
	uncommon.addAll(uncommon2);
	
	return uncommon;
	
}


}
