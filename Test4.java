package step01_����;

/* ���� ������ �����Ͽ� ��� �ϼ���
 * --���
 * �̸� : �̼���      <--- println()
 * ���� : 25��       <--- print()
 * �μ� : ���ߺ� 
 * ���� : 87.5��  <--- printf()  �μ� ���� �ѹ��� ���
 * 
 */

public class Test4 {

	public static void main(String[] args) {
		String name="�̼���";
		int age=25;
		String a="���ߺ�";
		float b=87.5f;
		
		System.out.println("�̸� : "+name);
		System.out.print("���� : "+age+"��\n");
		System.out.printf("�μ� : %s\n���� : %.1f��", a, b);
		

	}

}
