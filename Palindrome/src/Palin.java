import java.util.Scanner;


public class Palin {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = Integer.parseInt(sc.nextLine());
	        
	        for(int i=0;i<n;i++){
	        	String item = sc.nextLine();
	        	System.out.println(palCheck(item));
	        }
	        sc.close();
	    }
	 
	 public static String palCheck(String item){
		 char[] itemArray = item.toCharArray();
		 int length = itemArray.length;
		 int right,left,leftChar,rightChar,numberOfChanges;
		 numberOfChanges = left = 0;
		 right = length-1;
		 while(left<=right){
			 leftChar = (int)itemArray[left];
			 rightChar = (int)itemArray[right];
			 //Make it equal
			 if(leftChar<rightChar){
				 numberOfChanges+= makeitEqual(leftChar,rightChar);
			 }else if(leftChar>rightChar){
				 
				 numberOfChanges+=makeitEqual(rightChar,leftChar);
			 }else{
				 
			 }
			 left++;
			 right--;
		 }
		 return numberOfChanges+"";
	 }

	private static int makeitEqual(int matchChar, int decChar) {
		// TODO Auto-generated method stub
		int steps = 0;
		while(matchChar!=decChar){
			decChar--;
			steps++;
		}
		return steps;
	}
}
