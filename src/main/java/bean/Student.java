package bean;

public class Student implements java.io.Serializable {

	private String no;
	private String name;
	private String ent_year;
	private String class_num;
	private Boolean is_attend;
	private String school_cd;

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
	public Boolean getIs_attend() {
		return is_attend;
	}
	public String getSchool_cd() {
		return school_cd;
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
	public void setIsattend(Boolean is_attend) {
		this.is_attend=is_attend;
	}
	public void setSchool_cd(String school_cd) {
		this.school_cd=school_cd;
	}
}
