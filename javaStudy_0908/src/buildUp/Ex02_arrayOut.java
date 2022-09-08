package buildUp;

public class Ex02_arrayOut {
	public static void main(String[] args) {
		int arr[] = new int[2];
		
		try {
			System.out.println(arr[2]);
			System.out.println(100/0);
		} catch(Exception e) {
			// printstackTrace 에러를 콘솔창에 출력
			e.printStackTrace();
			System.out.println("범위를 벗어난 변수입니다.");
		} finally {
			// try -> catch -> finally
			// 1회는 무조건 실행
			System.out.println("!!");
		}
	}
}