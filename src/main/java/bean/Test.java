package bean;

public class Test implements java.io.Serializable {

	private String student_no;
	private String subject_cd;
	private String school_cd;
	private String no;
	private String point;
	private String class_num;


	public String getStudent_no() {
		return student_no;
	}
	public String getSubject_cd() {
		return subject_cd;
	}
	public String getSchool_cd() {
		return school_cd;
	}
	public String getNo() {
		return no;
	}
	public String getPoint() {
		return point;
	}
	public String getClass_num() {
		return class_num;
	}

	public void setStudent_no(String student_no) {
		this.student_no=student_no;
	}
	public void setSubject_cd(String subject_cd) {
		this.subject_cd=subject_cd;
	}
	public void setSchool_cd(String school_cd) {
		this.school_cd=school_cd;
	}
	public void setNo(String no) {
		this.no=no;
	}
	public void setPoint(String point) {
		this.point=point;
	}
	public void setClass_num(String class_num) {
		this.class_num=class_num;
	}
}
