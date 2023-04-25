package loopsAssignments;

public class StringSwap {
	
	static void stringswap(String first,String second) {
		//String i=first;
		//first=second;
		//second=i;
		first=first+second;
		second=first.substring(0, first.length()-second.length());
		first=first.substring(second.length());
		
	System.out.println(first+" "+second);
	
	
	
}
}
