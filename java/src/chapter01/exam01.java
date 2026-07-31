package chapter01;

import java.util.Random;
import java.util.Scanner;

public class exam01 {// Ŭ����
	// �޼ҵ� (�ּ�) �ý��ۿ���x
	/*��δ� �ּ�
	 */
	public static void main(String[] args) {
//		System.out.println("�ȳ��ϼ���.");
//		
//		1. ���ھ߱�
//		 - ����/�븻/�ϵ� ���
//		 - ������� 20ȸ/�븻��� 10ȸ/�ϵ��� 5ȸ �̳��� �����߸� �����С� ���� ���
//		 - ���� 4�� ���(�ߺ�x / 0����)
//		 - ���ڴ� �ش������ ��ġ�� �����ʴ´ٸ�  ������
//		 - ������ ��ġ�� �Ǵٸ� ����Ʈ����ũ��
//		 - ������ ���� ��Ʈ����ũ�� ���ڷ� �˷��ش�.
//		 - ���ڰ� ��, ��Ʈ����ũ ��� ���� �� ���ƿ���
		
	//	Random r = new Rand/om(); // ���� ���� �̱� ���� ����
		
		// �߱����� ���� 4�� (���� �ߺ����� ����)
	
		Scanner scanner = new Scanner(System.in);
//		int count = scanner.nextInt();
//		if (count<=0) {System.out.println("0���� ū �� �Է����ּ���.");
//		
//		scanner.close();
//		return;}
//		
//		int first = 1, second = 1;
//		
//		{System.out.println("�Ǻ���ġ����");}
//		for(int i=1; i<=count; i++) { System.out.print(first+",");
//		int next = first+second;
//		first = second;
//		second = next;}
//		
		
//		System.out.print("present YYYY");
//		int Py = scanner.nextInt();
//		System.out.print("MM");
//		int Pm= scanner.nextInt();
//		System.out.print("DD");
//		int Pd= scanner.nextInt();
//		System.out.print("birst YYYY");
//		int By= scanner.nextInt();
//		System.out.print("MM");
//		int Bm= scanner.nextInt();
//		System.out.print("DD");
//		int Bd= scanner.nextInt();
//		
//		int yy = Py- By-1, yy1= Py-By;
		
//		if (Pm<Bm) {System.out.print("����� �����̴�"+yy1+"�� �Դϴ�.");
//		} else if (Pm>Bm) {System.out.print("����� �����̴�"+yy+"�� �Դϴ�.");}
//		
		for (int i=1; i<=5; i++) {
		 for (int j=1; j<=i; j++) {System.out.print("*");}
		 System.out.println();}
		
		for (int i=1; i<=4; i++) {
			for (int j=4; j>=i; j--) {System.out.print("*");}
			System.out.println();}
		
		System.out.println("------------------------------------");
	
		for (int i=1; i<=5; i++) {
		for (int j=5; j>=5-i; j--) {System.out.print(" ");
		 } for (int j=0;j<=(5-i)*2; j++) {System.out.print("*");}
			System.out.println();}
		
		for (int i=1; i<=4; i++) {
			for (int j=1;j<=(6-i)*1;j++) {System.out.print(" ");
			}for (int j=1; j<=(i*2)+1; j++) {System.out.print("*");}
			System.out.println();}
		
		System.out.println("------------------------------------");
		
		
		for (int i=0; i<=4; i++) {
			for (int j=1; j<=(5-i)*1; j++) {System.out.print(" ");
			}for (int j=1; j<=(i*2)+1; j++) {System.out.print("*");}
			System.out.println();}
		for (int i=1; i<=5; i++) {
			for (int j =0;j<=(5+i)*1; j++) {System.out.print(" ");
			}for (int j=10; j<=(10-i)*2; j++) {System.out.print("*");}
			System.out.println();}
		}
		}
			
		
		
	
	
	
			
		
			
		

	
		
		
		
		
