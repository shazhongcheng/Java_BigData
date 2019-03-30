package base02;

public class ClassDemo {

	public static void main(String[] args) {
		Person p = new Person();
		p.run();
	}
	
}

class Person{
	int height=135;
	int weight=46;
	
	public void run() {
		System.out.println("running¡­¡­");
	}
	
}