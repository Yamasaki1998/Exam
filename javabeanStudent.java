package bean;

public class Student implements java.io.Serializable {

	private String no;
	private String name;
	private int ent_year;

	public String getN() {
		return no;
	}
	public String getName() {
		return name;
	}
	public int getEnt_year() {
		return ent_year;
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
}
