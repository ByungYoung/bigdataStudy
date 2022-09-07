package Music;

import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class mp3Main {
	static void play(ArrayList<mp3> music, MP3Player mp, int index) {
		System.out.printf("\n%d 번째 곡을 재생합니다.\n", index + 1);
		System.out.printf("재생중인 곡 > %s : %s(%d)\n", music.get(index).getSinger(),
													  music.get(index).getTitle(),
													  music.get(index).getPlayTime() );
		System.out.printf("=========================================================\n");
		mp.play(music.get(index).getPath());
	}
	
	/*
	 * static void previous(ArrayList<mp3> music, MP3Player mp, int index) {
	 * mp.stop(); index++; if(index >= 0) { play(music, mp, index); } else {
	 * System.out.println("이전곡은 존재하지 않습니다."); System.out.printf(
	 * "=========================================================\n"); } }
	 * 
	 * static void next(ArrayList<mp3> music, MP3Player mp, int index) { mp.stop();
	 * index++; if(index < music.size()) { play(music, mp, index); } else {
	 * System.out.println("다음곡은 존재하지 않습니다."); System.out.printf(
	 * "=========================================================\n"); } }
	 */
	
	public static void main(String[] args) {
		int index = 0;
		MP3Player mp = new MP3Player();
		ArrayList<mp3> music = new ArrayList<mp3>();
		music.add(new mp3("태연", "사계", 100, ".\\music\\사계 - 태연.mp3"));
		music.add(new mp3("Rain", "깡", 200, ".\\music\\깡 - Rain.mp3"));
		music.add(new mp3("IVE", "LOVE DIVE", 300, ".\\music\\lovedive.mp3"));
		
		int menu = 0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("[1] 재생 [2] 정지 [3] 이전곡 [4] 다음곡 [5] 종료 >> ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				play(music, mp, index);
				break;
			case 2:
				System.out.println("음악 재생을 종료합니다.");
				System.out.printf("=========================================================\n");
				mp.stop();
				break;
			case 3:
				//previous(music, mp, index);
				mp.stop();
				index--;
				if(index >= 0) {
					if(index >= music.size())
						index = music.size() - 1;
					play(music, mp, index);
				}
				else {
					System.out.println("이전곡은 존재하지 않습니다.");
					System.out.printf("=========================================================\n");
				}
				break;
			case 4:
				//next(music, mp, index);
				mp.stop();
				index++;
				if(index < music.size()) {
					if(index <= 0)
						index = 0;
					play(music, mp, index);
				}
				else {
					System.out.println("다음곡은 존재하지 않습니다.");
					System.out.printf("=========================================================\n");
				}
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("숫자를 잘 못 입력하셨습니다.");
				break;
			}
		}
	}
}