package HelloWorld;

public class Strange {

	public static int strange(int x) {
		int y = 2;
		switch(x) {
			case 0:
			case 1:
				y = x; break;
			case 2:
				y++;
			case 3:
				y = y + x * x; break;
			case 4:
				y = 0; break;
			default:
				y = -x;
		}
		
	return y;

	}
	
	public static int superStrange(int x) {
		int y = 2;
		if(x == 0 || x == 1){
			y = x;
		}else if(x == 2 || x == 3){
			y++;
			y = y + x * x;
		}else if(x == 4){
			y = 0;
		}else{
			y = -x;
		}
		return y;
	}
	
	
}
