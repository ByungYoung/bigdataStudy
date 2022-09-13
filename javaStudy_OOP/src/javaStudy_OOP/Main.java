package javaStudy_OOP;

public class Main {
	public static void main(String[] args) {
		// 1. ���ҽ�(Resource) : Model
		// 2. �˰���(Algorithm) : Controller
		// 3. ���(View) : View
		
		/*
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		int life = 3, max = 89;

		String[] failMsg  = new String[3];
		failMsg[0] = "�� �� ����ϼ���";
		failMsg[1] = "�й��ϼ���... ��ȸ�� 1�� ���Ҿ��";
		failMsg[2] = "������ ����Ǿ����.";
		
		for(int i = 0; i < life; ) {
			int num1 = rand.nextInt(max) + 10;
			int num2 = rand.nextInt(max) + 10;
			
			System.out.printf("%d + %d = ", num1, num2);
			int answer = scan.nextInt();
			if(answer == num1 + num2) System.out.println("Success!");
			else System.out.println(failMsg[i++]);
		}
		*/
		MinusCD cd1 = new MinusCD(3, 99, new String[] {"Cheer up", "Sorry", "End"});
		PlusCD cd2 = new PlusCD(3, 99, new String[] {"Cheer up", "Sorry", "End"});
		MulCD cd3 = new MulCD(3, 99, new String[] {"Cheer up", "Sorry", "End"});
		DivCD cd4 = new DivCD(3, 99, new String[] {"Cheer up", "Sorry", "End"});
		
		Controller game = new Controller(cd1);
		Controller game2 = new Controller(cd2);
		Controller game3 = new Controller(cd3);
		Controller game4 = new Controller(cd4);
		game4.play();
	}
}