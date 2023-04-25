package loopsAssignments;

public class ReverseString {
	
	static void StringReverse(String str) {
		
		 char[] ch=str.toCharArray();
		 
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(ch[i]);
			
		}
		
	}

}
