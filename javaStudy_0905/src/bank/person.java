package bank;

public class person {
	//내가 원하는 사람
	private int age;
	String gender;		//남자 0 여자 1
	private String name;
	int height;

	public int getAge() {
		return age;
	}public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}public void setName(String name) {
		this.name = name;
	}
	// 생성자
	// 우클릭 -> source -> Generator Constructor using Fields
	// 생성자 오버로딩 (재정의) 
	person(String name, int age, String gender, int height) {
		this.setName(name);
		this.setAge(age);
		this.gender = gender;
		this.height = height;
	}
	person(){
	}
	
	void talk() {
		System.out.println("안녕하세요!!");
	}void eat() {
		System.out.println("냠냠 ");
	}void walk() {
		System.out.println("동네 산책하기");
	}void sleep() {
		System.out.println("낮잠자기");
	}void showPerson() {
		System.out.println("이름 >> " + getName());
		System.out.println("나이 >> " + getAge());
		System.out.println("성별 >> " + gender);
		System.out.println("키 >> " + height);
		System.out.println("==============================");
	}
}