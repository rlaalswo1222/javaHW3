class Person0 {
}

class Student0 extends Person0 {
}

class Researcher extends Person0 {
}

class Professor extends Researcher {
}

public class InstanceOfEx {
	static void print(Person0 p) {
		if (p instanceof Person0)
			System.out.print("Person ");
		if (p instanceof Student0)
			System.out.print("Student ");
		if (p instanceof Researcher)
			System.out.print("Researcher ");
		if (p instanceof Professor)
			System.out.print("Professor ");
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.print("new Student() ->\t");
		print(new Student0());
		System.out.print("new Researcher() ->\t");
		print(new Researcher());
		System.out.print("new Professor() ->\t");
		print(new Professor());
	}
}