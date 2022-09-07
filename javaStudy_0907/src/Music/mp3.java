package Music;

public class mp3 {
	private String singer;	// 가수
	private String title;	// 제목
	private int playTime;	// 재생시간
	private String path;	// 경로
	
	mp3() {	}
	mp3(String singer, String title, int playTime, String path) {
		this.singer = singer;
		this.title = title;
		this.playTime = playTime;
		this.path = path;
	}
	
	public String getSinger() {
		return singer;
	} public void setSinger(String singer) {
		this.singer = singer;
	}
	
	public String getTitle() {
		return title;
	} public void setTitle(String title) {
		this.title = title;
	}
	
	public int getPlayTime() {
		return playTime;
	} public void setPlayTime(int playTime) {
		this.playTime = playTime;
	}
	
	public String getPath() {
		return path;
	}
}