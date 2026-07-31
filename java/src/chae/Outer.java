package chae;

public class Outer {
	int num = 10;
	
	class Inner{
		void print() {
			System.out.println(num);
		}
	}
}
	class Main{
		public static void main(String[] args) {
			
			Outer outer = new Outer();
			Outer.Inner inner = outer.new Inner();
			
			inner.print();
			
		}
		
	}

	
