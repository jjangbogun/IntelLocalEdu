import java.util.Scanner;
// 소곱창
public class VarStringBasic2 {
	
	public static void main(String[] args) {
//		문자열
		String str = "abc";
//		문자
		char ch = 'a';
		
		byte b = 1;
		
		int num = 100;
//		()함수 - c
//		()메서드 - 자바
		
//		concat - 합성, 더하다
		System.out.println("레전드" + num);
		System.out.println("아\t + 한글이 된다");
		System.out.println(str + "뭐노");
		
//		문자열 + any type -> 문자열 + 문자열 -> 문자열
//		any type + 문자열 -> 문자열 + 문자열 -> 문자열
		
		System.out.println(" " + " " + 7);
	    System.out.println(7 + 7 + "");
	    System.out.println("" + 7 + 7);
	      
	    System.out.printf("c언어 생각나네%d\n", num);
	    System.out.printf("c언어 생각나네%d\n", num);

		System.out.print("아");
		System.out.print("하");
		System.out.print("이게 라인 넘기는것 없이 출력이다\n");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("놀랐지? 아무글이나 작성해봐");
		String input = scan.nextLine();
		System.out.println("니가 작성한 글이야 -> " + input + 10);
		
//		ctrl + shift + c 주석
//		num = scan.nextInt();
//		System.out.println("니가 작성한 글이야 -> " + (num + 10));
		
		
	    
		
	}

}
