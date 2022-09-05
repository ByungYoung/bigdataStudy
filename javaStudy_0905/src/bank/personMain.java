package bank;

public class personMain {
	public static void main(String[] args) {
		person p1 = new person("¹Úº´¿µ", 23, "Man", 178);
		person p2 = new person("Hello", 22, "Woman", 160);
		
		p1.showPerson();
		p2.showPerson();
		
		p1.eat();
		p2.sleep();
		p2.walk();
		p1.talk();
	}
}