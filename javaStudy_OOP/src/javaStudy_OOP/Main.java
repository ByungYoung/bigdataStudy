package javaStudy_OOP;

public class Main {
	public static void main(String[] args) {
		// 1. 리소스(Resource) : Model
		// 2. 알고리즈(Algorithm) : Controller
		// 3. 출력(View) : View
		
		/*
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		int life = 3, max = 89;

		String[] failMsg  = new String[3];
		failMsg[0] = "좀 더 노력하세요";
		failMsg[1] = "분발하세요... 기회가 1번 남았어요";
		failMsg[2] = "게임이 종료되었어요.";
		
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