package HelloWorld;

public class Euclides {

	public static int mdc(int a, int b) {
//		int x = 0;
//		while (b != 0){
//		       x = a % b;
//		       a = b;
//		       b = x;
//		   }
//		 return a;


		  if (b == 0){
		      return a;
		  }else{
		      return mdc(b, a % b);
		  }
	}
}
