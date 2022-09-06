package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex03_musicplayList {
	static void show() {
		System.out.print("[1] 노래 추가 [2] 노래 조회 [3] 노래 삭제 [4] 종료 >> ");
	}
	
	static void showMusicAdd() {
		System.out.print("[1] 원하는 위치에 추가 [2] 마지막에 추가 >> ");
	}
	
	static void showMusicList() {
		System.out.println("==========현재 재생 목록==========");
	}
	
	static void showMusicDelete() {
		System.out.print("[1] 선택 삭제 [2] 전체 삭제 >> ");
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
					System.out.print("원하는 위치는 어디인가요 >> ");
					int musicIndex = sc.nextInt();
					System.out.print("추가 할 노래 입력 >> ");
					music = sc.next();
					musicList.add(musicIndex, music);
					System.out.println("추가가 완료되었습니다.");
				}
				else if(index == 2) {
					System.out.print("추가 할 노래 입력 >> ");
					music = sc.next();
					musicList.add(music);
					System.out.println("추가가 완료되었습니다.");
				}
				else
					System.out.println("잘못 입력하셨습니다.");
				break;
			case 2:
				showMusicList();
				if(musicList.size() == 0) System.out.println("재생 목록이 없습니다!");
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
					System.out.print("삭제할 노래를 선택하세요 >> ");
					int musicIndex = sc.nextInt();
					musicList.remove(musicIndex - 1);
					System.out.println("노래가 삭제되었습니다.");
				}
				else if(index == 2) {
					musicList.clear();
					System.out.println("전체리스트가 삭제되었습니다.");
				}
				else
					System.out.println("잘못 입력하셨습니다.");
				break;
			case 4:
				System.out.println("\'뮤직 플레이 리스트를 종료합니다.\'");
				return;
			default:
				System.out.println("다시 입력해 주세요");
				break;
			}
		}
	}
}