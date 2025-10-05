package mappingOneToOneBi;
import jakarta.persistence.*;
@Entity
public class AdharCard {
@Id
private long ano;
private String fathername;
private String address;
private String dob;

@OneToOne(mappedBy="adharcard")
private Person person;
public long getAno() {
	return ano;
}
public void setAno(long ano) {
	this.ano = ano;
}
public String getFathername() {
	return fathername;
}
public void setFathername(String fathername) {
	this.fathername = fathername;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public Person getPerson() {
	return person;
}
public void setPerson(Person person) {
	this.person = person;
}
@Override
public String toString() {
	return "AdharCard [ano=" + ano + ", fathername=" + fathername + ", address=" + address + ", dob=" + dob + "]";
}


}
