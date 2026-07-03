package chapter4;

public class exam04 {

	public static void main(String[] args) {
		//중첩for문
		for(int i =2; i<=9; i++) { 
			//i는 단수
		   for(int j= 1; j<=9; j++) {
			   //j는 i단에 곱해지는 수 (1~9)
			  // System.out.println(i+ "x" + j + "="+(i*j));
			   System.out.printf("%d x %d = %d\n",i,j,i*j);
			   
			   System.out.println("i: "+i+"/j:" +j);
			   
		   }
		   
		}
		for (int n =3; n<=10; n++) {
			for(int m=10; m<=10; m++) {
				
				System.out.printf("%d x %d = %d\n ", n,m,n*m);
			}
		}
	}

}
