package Model;

public class memberVO {
	// DB ���̺� �����ϴ� �� �÷����� �������� �����͸� ��üȭ�� Ŭ����.
	// DB ���̺��� �÷��� : VO Ŭ������ ��� ����
	// �������� �����ϴ� ���Ҹ� �ϴ� Ŭ����
	
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