
public class Solution {

	public static void main(String[] args) {//q231
		// TODO Auto-generated method stub
		System.out.println(isPowerOfTwo(16));
	}
    public static boolean isPowerOfTwo(int n) {
    	return n<1?false:(n & (n - 1)) == 0?true:false;
    }
}
