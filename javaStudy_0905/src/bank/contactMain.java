package bank;

public class contactMain {
	public static void main(String[] args) {
		contact c1 = new contact("¹Úº´¿µ", 23, "01024293662");
		contact c2 = new contact("A", 23, "01011112222");
		contact c3 = new contact("B", 23, "01033334444");
		contact c4 = new contact("C", 23, "01055556666");
		
		contact[] contact = {c1, c2, c3, c4};
		
		/*
		 * for(int i = 0; i < contact.length; i++) { String name = contact[i].getName();
		 * int age = contact[i].getAge(); String phoneNum = contact[i].getPhoneNum();
		 * 
		 * contact[i].show(); }
		 */
	}
}