package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex03_musicplayList {
	static void show() {
		System.out.print("[1] �뷡 �߰� [2] �뷡 ��ȸ [3] �뷡 ���� [4] ���� >> ");
	}
	
	static void showMusicAdd() {
		System.out.print("[1] ���ϴ� ��ġ�� �߰� [2] �������� �߰� >> ");
	}
	
	static void showMusicList() {
		System.out.println("==========���� ��� ���==========");
	}
	
	static void showMusicDelete() {
		System.out.print("[1] ���� ���� [2] ��ü ���� >> ");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0, index = 0;
		String music = "";
		ArrayList<String> musicList = new ArrayList<String>();
		System.out.println("====Music Play List====\n");
		
		while(true) {
			show();
			num = sc.nextInt();
			System.out.println("==============================\n");
			switch(num) {
			case 1:
				showMusicAdd();
				index = sc.nextInt();
				if(index == 1) {
					System.out.print("���ϴ� ��ġ�� ����ΰ��� >> ");
					int musicIndex = sc.nextInt();
					System.out.print("�߰� �� �뷡 �Է� >> ");
					music = sc.next();
					musicList.add(musicIndex, music);
					System.out.println("�߰��� �Ϸ�Ǿ����ϴ�.");
				}
				else if(index == 2) {
					System.out.print("�߰� �� �뷡 �Է� >> ");
					music = sc.next();
					musicList.add(music);
					System.out.println("�߰��� �Ϸ�Ǿ����ϴ�.");
				}
				else
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				break;
			case 2:
				showMusicList();
				if(musicList.size() == 0) System.out.println("��� ����� �����ϴ�!");
				else {
					for(int i = 0; i < musicList.size(); i++) {
						System.out.println(i + 1 + ". " + musicList.get(i));
					}
				}
				break;
			case 3:
				showMusicDelete();
				index = sc.nextInt();
				if(index == 1) {
					System.out.print("������ �뷡�� �����ϼ��� >> ");
					int musicIndex = sc.nextInt();
					musicList.remove(musicIndex - 1);
					System.out.println("�뷡�� �����Ǿ����ϴ�.");
				}
				else if(index == 2) {
					musicList.clear();
					System.out.println("��ü����Ʈ�� �����Ǿ����ϴ�.");
				}
				else
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				break;
			case 4:
				System.out.println("\'���� �÷��� ����Ʈ�� �����մϴ�.\'");
				return;
			default:
				System.out.println("�ٽ� �Է��� �ּ���");
				break;
			}
		}
	}
}