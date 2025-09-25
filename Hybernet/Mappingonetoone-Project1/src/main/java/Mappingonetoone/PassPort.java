package Mappingonetoone;
import jakarta.persistence.*;
@Entity
public class PassPort {
	@Id
	private int pno;
	private String nationality;
	private String issuedate;
	private String expirydate;
    public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getIssuedate() {
		return issuedate;
	}
	public void setIssuedate(String issuedate) {
		this.issuedate = issuedate;
	}
	public String getExpirydate() {
		return expirydate;
	}
	public void setExpirydate(String expirydate) {
		this.expirydate = expirydate;
	}
	@Override
	public String toString() {
		return "PassPort [pno=" + pno + ", nationality=" + nationality + ", issuedate=" + issuedate + ", expirydate="
				+ expirydate + "]";
	}


}
