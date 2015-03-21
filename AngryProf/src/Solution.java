import java.util.Scanner;


public class Solution {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine() );
		for(int i=0;i<t;i++){
			String[] constraints, students;
			constraints = sc.nextLine().split(" ");
			students  = sc.nextLine().split(" ");
			decideClass(constraints,students);
		}
		sc.close();
	}

	private static void decideClass(String[] constraints, String[] students) {
		// TODO Auto-generated method stub
		int max = Integer.parseInt(constraints[0]),required = Integer.parseInt(constraints[1]) , notComing=0;
		for(int i=0;i<max;i++){
			int stuVal = Integer.parseInt(students[i]);
			if(stuVal>0) notComing++;
		}
		if( (max-notComing) < required){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}
