package bean;

public class Student implements java.io.Serializable {

	private String no;
	private String name;
	private int ent_year;
	private String classnum;
	private Boolean isattend;
	private String school;

	public String getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	public int getEnt_year() {
		return ent_year;
	}
	public String getClassnum() {
		return classnum;
	}
	public Boolean getIsattend() {
		return isattend;
	}
	public String getSchool() {
		return school;
	}

	public void setNo(String no) {
		this.no=no;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setEnt_year(int ent_year) {
		this.ent_year=ent_year;
	}
	public void setClassnum(String classnum) {
		this.classnum=classnum;
	}
	public void setIsattend(Boolean isattend) {
		this.isattend=isattend;
	}
	public void setSchool(String school) {
		this.school=school;
	}
}
