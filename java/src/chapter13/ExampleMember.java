package chapter13;


public class ExampleMember {
	
	public String name;
	public int age;
	
	public ExampleMember(String name, int age) {
		
		this.name=name;
		this.age=age;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		/*강제 형변환은 해당 객체와 같은 객체이거나 해당 객체를 상속받고 있어야 가능하다.
		 *파라미터로 받은 obj가 member 객체와 같은 클래스 
		 */
		
		if (obj instanceof ExampleMember) {
			//member로 만들어진 객체나 상속받은 것이라면 강제 형변환 시킨다
			ExampleMember exampleMember = (ExampleMember) obj;
			
			return exampleMember.name.equals(this.name) && (exampleMember.age == this.age);
		} else {
			return false;
		}
	}
	@Override
	public int hashCode() {

		
		return name.hashCode() + this.age;
	}

}
