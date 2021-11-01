/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:16
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/
public class Homework16problem2 {
public static boolean numericalPalindrome(int x)  {
	
			if (x < 0)
				return false;
	 
			
			int b = 1;
			while (x / b >= 10) {
				b *= 10;
			}
	 
			while (x != 0) {
				int left = x / b;
				int right = x % 10;
	 
				if (left != right)
					return false;
	 
				x = (x % b) / 10;
				b /= 100;
			}
	 
			return true;
	    }
	

}

