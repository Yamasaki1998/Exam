package bean;

public class Product implements java.io.Serializable {

	private String NO;
	private String NAME;
	private int ENT_YEAR;

	public String getNO() {
		return NO;
	}
	public String getNAME() {
		return NAME;
	}
	public int getENT_YEAR() {
		return ENT_YEAR;
	}

	public void setNO(int NO) {
		this.NO=NO;
	}
	public void setNAME(String NAME) {
		this.NAME=NAME;
	}
	public void setENT_YEAR(int ENT_YEAR) {
		this.ENT_YEAR=ENT_YEAR;
	}
}

