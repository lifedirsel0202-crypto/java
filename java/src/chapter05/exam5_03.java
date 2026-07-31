package chapter05;

public class exam5_03 {

	public static void main(String[] args) {
//		int []a= {0,1,2};
//		int [] b= a;
//		b[1]=4;   //b수정 (주소값 복사되므로 b수정시 a까지 같이 바뀜)
//		for (int i=0; i<a.length;i++) {
//			System.out.print(a[i]+" ");			
//		}
//		System.out.println();}  //원본유지 안됨.
//	
	
	int []a= {0,1,2};
	int [] b= new int[3];
	
		for (int i=0; i<b.length;i++) {
			b[i]=a[i];
		}
	
	b[1]=4;   //b수정 (주소값 복사되므로 b수정시 a까지 같이 바뀜)
	
	
	for (int i=0; i<a.length;i++) {
		System.out.print(a[i]+" ");			
	}
	System.out.println();  //원본유지 안됨.
	
	for (int i=0; i<b.length; i++) {System.out.print(b[i]+" ");
	}
	String [] array = {"Hello","World","JAVA"};
	for (String str : array) { System.out.print(str + " ");} //향상된 for문.
	
	
}
}