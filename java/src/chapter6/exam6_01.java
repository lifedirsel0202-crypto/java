package chapter6;

class Student{
	String name;
	String tel;
	
	int korea;
	int english;
	int math;
	
	Student(String inputName){
		this.name = inputName;   //생성자-클래스를 인스턴스화 시키려 할때 초기세팅해주는 역활
		//위에 int 변수중 찾겠다는 뜻.
	}        //Student std1 = new Student("홍길동"); 이걸위한 틀.
	
	double average() {//평균구하는 기능상자
		double average = ((double)this.korea+(double)this.math+(double)this.english)/3;
		return average;   //everage 값 구하고 나서 return시켜주는 기능
		
		
		
	}
}
public class exam6_01 {
	
	exam6_01(){}  //생성자 만들수 있음 class 이므로,, 눈에 안보이지만 하나는 있고 여러개 지정가능
	exam6_01(String name){}

       //클래스  //
	public static void main(String[] args) {
		              //딱한개만 존재할수있음. , 파일 실행하는 ,,,메소드 실행하기위해 필요.
		// 객체지향, 클래스
//		Student std = new Student();   //ctrl + Student 하면 클래스 넘어감 (*인스턴스화 시킨것.)
//		System.out.println(std.kor);
//		 
//		String [] name = new String[5];   //한꺼번에 뭉텅이로 저장하는게 아니고 의미 있는 클래스 끼리 묶어보자의미.
//		//name[0]...[4]
		
		Student std1 = new Student("홍길동");   //홍길동 글씨가 inputName 타고 name에 저장,
		Student std2 = new Student("김영희");   
		System.out.println(std1.name);
		System.out.println(std2.name);
		
		std1.korea =90;
		std1.math=85;
		std1.english=95;
		
		std2.english=80;
		std2.korea=95;
		std2.math=30;
		
		System.out.println(std1.average());  //기능상자에서 계산한 걸 불러는 역
		System.out.println(std2.average());
		
		
	}

}

