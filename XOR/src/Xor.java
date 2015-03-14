import java.util.Scanner;


public class Xor {

	static int maxXor(int l, int r) {
		int max=0,curr=0;
		for(int i=l;i<=r;i++){
			for(int j=l+1;j<=r;j++){
				curr = i ^ j;
				if(curr>max) max = curr;
			}
		}
		return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        int _l;
        _l = Integer.parseInt(in.nextLine());
        
        int _r;
        _r = Integer.parseInt(in.nextLine());
        
        res = maxXor(_l, _r);
        System.out.println(res);
        
    }

}
