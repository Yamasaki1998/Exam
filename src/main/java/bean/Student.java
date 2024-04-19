package bean;

public class Student implements java.io.Serializable {

	private String no;
	private String name;
	private String ent_year;
	private String class_num;
	private Boolean isattend;
	private String school;

	public String getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	public String getEnt_year() {
		return ent_year;
	}
	public String getClass_num() {
		return class_num;
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
	public void setEnt_year(String ent_year) {
		this.ent_year=ent_year;
	}
	public void setClass_num(String class_num) {
		this.class_num=class_num;
	}
	public void setIsattend(Boolean isattend) {
		this.isattend=isattend;
	}
	public void setSchool(String school) {
		this.school=school;
	}
}
