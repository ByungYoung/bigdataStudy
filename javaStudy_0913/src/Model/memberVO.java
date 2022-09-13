package Model;

public class memberVO {
	// DB 테이블에 존재하는 각 컬럼들을 기준으로 데디터를 객체화할 클래스.
	// DB 테이블의 컬럼명 : VO 클래스의 멤버 변수
	// 데이터의 저장하는 역할만 하는 클래스
	
	private String id;
	private String pw;
	private String name;
	private String nick;

	public memberVO() {
	}

	public memberVO(String id, String pw, String name, String nick) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.nick = nick;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}
}