package bean;

public class Student implements java.io.Serializable {

	private String school_cd;
	private String cd;
	private String name;

	public String getSchool_Cd() {
		return school_cd;
	}
	public String getCd() {
		return cd;
	}
	public String getName() {
		return name;
	}

	public void setSchool_Cd(String school_cd) {
		this.school_cd=school_cd;
	}
	public void setCd(String cd) {
		this.cd=cd;
	}
	public void setName(String name) {
		this.name=name;
	}
}
