import javax.swing.plaf.synth.SynthOptionPaneUI;

public class CastingBasic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		boolean을 제외한 나머지 7개의 기본형은 서로 형변환이 가능하다
//		기본형과 참조형은 서로 형변환할 수 없다
//		서로 다른 타입의 변수간의 연산은 형변환을 하는 것이 원칙이지만,
//		값의 범위가 작은 타입에서 큰 타입으로 형변환은 생략할 수 있다
		
		
		int firstNum = 0;
		int secondNum = 0;
		
		int totalNum = 0;
		double avg = 0.0;
		
		firstNum = 10;
		secondNum = 7;
//		secondNum = 3;
		totalNum = firstNum + secondNum;
		avg = (double)totalNum / 2;
		
//		System.out.println(totalNum);

//		System.out.println(avg);
//		총점과 평균을 구하시오
		
//		소수점 3번째자리 반올림?
//		avg = (int)((double)totalNum / 3 * 100) / 100.0;
//		System.out.println(avg);
//	    소수점 1자리 올림?
//	    printf("%0.5f", f)
//		총점과 평균을 구하시오
		
//		avg = (int)((double)totalNum / 3 * 100) / 100.0;
//		System.out.println(avg);
		
//		반올림
//		기능 분리
		avg = (double)totalNum / 3;
		System.out.println("1번: " + avg);
		
		avg = avg + 0.005;
		System.out.println("2번: " + avg);
		
		avg = avg * 100;
		System.out.println("3번: " + avg);
		
		avg = (int)avg;
		System.out.println("4번: " + avg);
		
		avg = (int)avg / 100;
		System.out.println("5번: " + avg);


	}

}
