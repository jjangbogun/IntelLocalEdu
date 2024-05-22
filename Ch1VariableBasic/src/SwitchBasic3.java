import java.util.Scanner;

public class SwitchBasic3 {
	public static void main(String[] args) {


	int month = 13;
	String season = "";
	
	switch (month ) {
		
	    case 3,4,5 :
	    	season = "봄";
		    break;
		case 6,7,8 :
			season = "여름";
			break;
		case 9,10,11 :
			season = "가을";
			break;
			
		default :
			season = "겨울";
	}
	System.out.println("계절: " + season);
	
	}

	
}
