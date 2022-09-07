package Address;

public class address {
	private String name;
	private int mail;
	private String tel;
	
	address(){}
	
	address(String name, int mail, String tel){
		this.name = name;
		this.mail = mail;
		this.tel = tel;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getMail() {
		return mail;
	}
	
	public void setMail(int mail) {
		this.mail = mail;
	}
	
	public String getTel() {
		return tel;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
}