package tw.com.lccnet.web.entity;

public class Student {
	private int stu_id;
	private String stu_name;
	private String stu_age;
	private String stu_pass;
	private String stu_email;
	
	public Student() {
		super();
	}
	public Student(int stu_id, String stu_name, String stu_age, String stu_pass, String stu_email) {
		super();
		this.stu_id = stu_id;
		this.stu_name = stu_name;
		this.stu_age = stu_age;
		this.stu_pass = stu_pass;
		this.stu_email = stu_email;
	}
	public int getStu_id() {
		return stu_id;
	}
	public void setStu_id(int stu_id) {
		this.stu_id = stu_id;
	}
	public String getStu_name() {
		return stu_name;
	}
	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}
	public String getStu_age() {
		return stu_age;
	}
	public void setStu_age(String stu_age) {
		this.stu_age = stu_age;
	}
	public String getStu_pass() {
		return stu_pass;
	}
	public void setStu_pass(String stu_pass) {
		this.stu_pass = stu_pass;
	}
	public String getStu_email() {
		return stu_email;
	}
	public void setStu_email(String stu_email) {
		this.stu_email = stu_email;
	}
}
