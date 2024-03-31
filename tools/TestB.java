package tools;

  
class Human {

	private String name = "OLANREWAJU"; 
	private int age;


	public Human(){
		System.out.println("In the constructor");
	}

	public Human(String name, int age){
		System.out.println("In the constructor");
		this.name =name;
		this.age=age;
	}

	public int getAge(){
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName(){
		return name;
	}
	
}


/**
 * TestA
 */
class TestA {

	public TestA(){
		System.out.println("IN THE TEST A CLASS");
	}

	public void sayclassName(){
		System.out.println("This is a method in the TestA class");
	}
}

/**
 * TestB
 */
public class TestB  extends TestA{

	public void sayclassName(){
		System.out.println("This is a method in the TestB class");
	}
	
}

// public class Hello {
// 	// public static void main(String[] args){
// 	// 	// System.out.println("Hello world");

// 	// 	TestB testA = new TestB();

// 	// 	testA.sayclassName();
// 	// }
// }