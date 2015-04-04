import java.util.Scanner;


public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine() );
		for(int i=0;i<t;i++){
			char[] chars = sc.nextLine().toCharArray(); 
			int deletions = 0;
			char curr = chars[0];
			for(int j=1;j<chars.length;j++){
				if(curr == chars[j]){
					deletions++;
				}else{
					curr = chars[j];
				}
				
			}
			System.out.println(deletions+"");
		}
		sc.close();
		
	}

}
