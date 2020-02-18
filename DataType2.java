package step01_기초;
// System.out.printf("메세지 or 제어문자\n", 변수1, 변수2, 변수3...;


/* 제어문자
 * %s : String 문자열, char
 * %c : char 문자 1개
 * %f : float, double 실수
 * %d : int byte 정수
 */



public class DataType2 {

	public static void main(String[] args) {
		String name="홍길동";
		char gender='남';
		double score=85.3;
		int age=25;
		double tall=183.4;
		
		
		System.out.printf("이름 : %s\n", name);
		System.out.printf("성별 : %c\n", gender);
		System.out.printf("점수 : %-10.1f\n", score);  //정렬, 소수점
		System.out.printf("나이 : %10d\n", age);       //오른쪽 정렬
		System.out.printf("신장 : %.1f\n", tall);      //소수점 첫째자리
		
		

	}

}
