import java.util.Arrays;
import java.util.Scanner;


public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner in = new Scanner(System.in);
		  
	        int _l;
	        _l = Integer.parseInt(in.nextLine());
	        
	        String[] _r= new String[_l-1];
	        _r = in.nextLine().split(" ");
	        int current[] = new int[_r.length];
			for (int i = 0; i < _r.length; i++)
				current[i] = Integer.parseInt(_r[i]);
			
			for (int i = 1; i < _r.length; i++)
				printShifts(current,i);
	}

	private static void printShifts(int[] current, int index) {
		// TODO Auto-generated method stub
		int V = current[index];
		int i;
		for(i=index- 1;i>=0;i--){
			if(current[i]>=V){
				current[i+1] = current[i];
			}else{
				current[i+1] = V;
				System.out.println(Arrays.toString(current).replace("[", "").replace("]", "").replaceAll(",", ""));
				break;
			}
		}
		if(i==-1){
			current[i+1] = V;
			System.out.println(Arrays.toString(current).replace("[", "").replace("]", "").replaceAll(",", ""));
		}
		
	}

}
