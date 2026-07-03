package chapter4;

public class practice2 {

	public static void main(String[] args) {
		int a=2, b=-3, c=5, d=-7, e=11;
		double d1, d2, d3, d4, d5;
		
		d1 = a/b/c;
		/*
		 * d1=int여서 정수부분만저장 ?
		 */
		d2 = 7+c*--d/e;
		/* 
		 * (1) 증감연산자  d=-8 *5 -40 / 11 = 7+(-3) = 4
		 */
		
		d3 = 2*a%-b+c+1;
		/*
		 * 3 (부호) 2*2=4, 4%3 (산술 1)  = 1.0 +5+1(산술 2) = 7.0
		 */
		d4 = 39/-++e-+29%c;
		/*
		 *
		 */
		d5 = a+=b+=c+=1+2;
		/*
		 * 오른쪽에서 계산하면 3+ c=5 ->8-3 5+2 d5 = 7  double 소수점 7.0
		 */
		
		System.out.println("d1 : " + d1);
		System.out.println("d2 : " + d2);
		System.out.println("d3 : " + d3);
		System.out.println("d4 : " + d4);
		System.out.println("d5 : " + d5);
		

	
		

	}

}

     