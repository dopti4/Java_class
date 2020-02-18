package step01_기초;

/* 변수 4개(이름, 국어, 영어, 수학)를 만들고
 * 대입후 결과와 같이 완성하세요
 * --결과
 * 이름 : 강호동
 * 국어 : 85
 * 영어 : 73
 * 수학 : 68
 * 총점 : 226점
 *
 */
public class Test2 {

	public static void main(String[] args) {
		String name="강호동";
		int score1=85;
		int score2=73;
		int score3=68;
		int score4=226;
		
		
		System.out.printf("이름 : %s\n", name);
		System.out.printf("국어 : %d\n", score1);
		System.out.printf("영어 : %d\n", score2);
		System.out.printf("수학 : %d\n", score3);
		System.out.printf("총점 : %d점\n", score4);
		
		
		
		int kor=85;
		int eng=73;
		int mat=68;
		
		System.out.println("이름 : "+name);
		System.out.println("국어 : "+kor);
		System.out.println("영어 : "+eng);
		System.out.println("수학 : "+mat);
		System.out.println("총점 : "+(kor+eng+mat));
		
		

	}

}
