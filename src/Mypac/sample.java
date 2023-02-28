package Mypac;
import java.awt.Image;
import java.awt.Insets;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import javax.imageio.ImageIO;

//import com.asprise.util.ocr.OCR;

public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		H h= new H(new K());
		h.m();
		System.out.println(h.reverse("java"));
		
		
//System.out.println("hello");
//		A a1= new B();
//
//		a1.m1();
//		a1.m1_a();
		
//		System.out.println(a1.i);
//		System.out.println(a1.i);
//		B bb=(B)a1;
//		bb.m1();
//		bb.m1_a();
//		bb.m2();
//		System.out.println(bb.i);
	
//		System.out.println(a1.i);
//		a1.m1();
//		a1.m1_a();
//		
//		System.out.println("---------------");
//		System.out.println(b.i);
//		b.m1();
//		b.m1_a();
//		b.m2();
		String[] fruits = {"mango","apple","banana","banana","mango","apple","banana","apple","banana","orange","kiwi"};
		getocc(fruits);
//		getocc_char("kkrrttcc".toCharArray());
		int[] a= {2,4,5,6,4,6,4,3};
		int[] b= {2,4,5,6,4,6,4,3,9};
		get_not_macthing_value_in_arrays(a,b);
//		System.out.println(Arrays.equals(a, b));
		ArrayList<Integer> l=new ArrayList<Integer>();
	
		for (Integer i : a) {
			l.add(i);
		}
		
//		int ll=a.length;
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
		Collections.reverse(l);
		System.out.println(l);
	
//		Iterator i1= l.iterator();
//		
//		while (i1.hasNext()) {
//			System.out.println(" iterator :"+i1.next());
//			
//		}
		
//		sort(a);
//		sort(b);
//		int fff=4;
//		int bff=1;
//		System.out.println(fff==bff);
//		Collections.sort(a);
		
		
		String s="hello";
		String s1="";
//		for (int i = 0; i < s.length(); i++) {
//			
//			s1=s.charAt(i)+s1;
//		}
		
	for (char c: s.toCharArray()) {
			
			s1=c+s1;
		}
		
		System.out.println(s1);
		
	SortedSet<Integer> set=new TreeSet<>();
	SortedSet<String> set1=new TreeSet<>();
		Set<Integer> in=new HashSet<Integer>();
		for (int i : a) set.add(i);
		
		for (String i : fruits) set1.add(i);
		
		Set<String> sv=convertarraytoSet(fruits);
	
		System.out.println(set);
		System.out.println(set1);
		System.out.println(sv);
	}
	
	
	
	public static <T> Set<T> convertarraytoSet(T a[]) {
//		Set<T> s=new TreeSet<>();
//		Collections.addAll(s, a);
		
		Set<T> s=new HashSet<>(Arrays.asList(a));
		
		return s;
		
	}
	
	
	public static void getocc(String[] a) {
//		int count=0;
		 HashMap<String, Integer> map = new HashMap<>();
		
			
//			for(int j=0; j<a.length-1;j++) {
//
//				Integer h=0;
//				if(map.get(a[j]) != null){
//					 h=map.get(a[j]);
//				}
//				map.put(a[j],++h);
//		}
//		for (String sss : a) {
//			
//			Integer h=0;
//			if(map.get(sss) != null){
//				 h=map.get(sss);
//			}
//			map.put(sss,++h);
//		}
		
		for (String sss : a) {
			
			Integer h=0;
			if(map.containsKey(sss)) {
				
				h=map.get(sss);
				
			}
			map.put(sss,++h);
			
		}
		
//			
		System.out.println(map);
	
	
		
		
	}
	
	interface i{
		
		public void m1();
	}
interface j extends i{
		
		public void m2();
	}
	
	
	public static void getocc_char(char[] a) {
//		int count=0;
		 HashMap<Character, Integer> map = new HashMap<>();
		
			
//			for(int j=0; j<a.length-1;j++) {
//
//				Integer h=0;
//				if(map.get(a[j]) != null){
//					 h=map.get(a[j]);
//				}
//				map.put(a[j],++h);
//		}
		 
		
		
		for (Character sss : a) {
			
			Integer h=0;
			if(map.get(sss) != null){
				 h=map.get(sss);
				 
			}
			
//			if(map.containsKey(sss)){
//				 h=map.get(sss);
//			}
			
			map.put(sss,++h);
		}
//			
		System.out.println(map);
		
	}
	
	public static void get_not_macthing_value_in_arrays(int[] a, int[] b) {
		
		if(Arrays.equals(a, b)) {
			System.out.println("array: "+Arrays.toString(a)+" and array:  "+Arrays.toString(b)+" both are same");
		}else {
			compare_two_arrays(a,b);
			compare_two_arrays(b, a);
		}
		
	}
	public static void compare_two_arrays(int[] a, int[] b) {
		
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=0;j< b.length;j++) 
			{
				
				if(a[i]==b[j])
				{
//					System.out.println(a[i]+" value is present in b array");
					++count;
					break;
				}
				
			}
			if(count==0) {
				System.out.println(a[i]+" value of array: "+Arrays.toString(a)+" is not present in array:  "+Arrays.toString(b));
			}
			
		}
		
		

//		System.out.println("end");
//		System.out.println(b[7]);
		
//		compare_two_arrays(b,a);
		
		
	}
	
	public static void print_array(int[] a) {
		for (int i : a) {
			System.out.print(i);
		}
		
		
	}
	
	
	
	public static void sort(int[] a) {
		
		for(int i=0; i<a.length-1;i++) {
			for(int j=0; j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
				
				
			}
		}
		
		
				System.out.print("sorted: [");
		for (int i : a) {
			
			System.out.print(i);
			
			
		}
		
		System.out.print(" ]");
		
	}
	
	public void start() throws IOException{
		 
		 //I have used the direct url of image in the code.
//		 URL url = new URL("http://3.bp.blogspot.com/-CLWqgZAVgKw/Uk7JmLR8PZI/AAAAAAAADRw/e0laSNvhYDI/s1600/fun.jpg");
//		 Image image = ImageIO.read(url);
//		 String imageText = new OCR().recognizeCharacters((RenderedImage) image);
//		 System.out.println("Text Image : \n"+ imageText);
//		 System.out.println("Lengthotal text : \n"+ imageText.length());
//		 driver.quit();
			  
		/* Use below code If you want to read image location from your hard disk 
		 * 
		  BufferedImage image = ImageIO.read(new File("Image location")); 
		  String imageText = new OCR().recognizeCharacters((RenderedImage) image);
		  System.out.println("Text Image : \n"+ imageText);
		  System.out.println("Lengthotal text : \n"+ imageText.length()); 
		  
		  */
	 }

}

class A {
	int i=0;
	
	void m1() {
		System.out.println("A of m1");
	}
	
	void m1_a() {
		System.out.println("A of m1_a");
	}
	
}

class B extends A {
	int i=1;
	void m1() {
		System.out.println("B of m1");
	}
	void m2() {
		System.out.println("B of m2");
	}
}

class C extends B {
	int i=2;
	void m1_C() {
		System.out.println("C of m1_C");
	}
	void m2_C() {
		System.out.println("C of m2_C");
	}
}

class K {
	int i=2,j=3;
	
}

class H{
	K k1;
	H(K k)
	{k1=k;}
	
	void m() {
		System.out.println("i= "+k1.i +" j= "+k1.j);
	}
	
	String reverse(String s) {
		
		String s1="";
		for (char c : s.toCharArray()) {
			
			s1=c+s1;
			
		}
		return s1;
	}

}
