package project_dto;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity(name="Markscard")
public class Markdto{
	@Id
	private int Register_number;
	private String Student_name;
	private String Date_of_birth;
	private String Father_name;
	private String Mother_name;
	private int Tamil;
	private int English;
	private int Maths;
	private int Science;
	private int Social_science;
	private int Total_marks;
	private double Percentage;
	public int getRegister_number() {
		return Register_number;
	}
	public void setRegister_number(int register_number) {
		Register_number = register_number;
	}
	public String getStudent_name() {
		return Student_name;
	}
	public void setStudent_name(String student_name) {
		Student_name = student_name;
	}
	public String getDate_of_birth() {
		return Date_of_birth;
	}
	public void setDate_of_birth(String date) {
		Date_of_birth = date;
	}
	@Override
	public String toString() {
		return "Markdto [Register_number=" + Register_number + ", Student_name=" + Student_name + ", Date_of_birth="
				+ Date_of_birth + ", Father_name=" + Father_name + ", Mother_name=" + Mother_name + ", Tamil=" + Tamil
				+ ", English=" + English + ", Maths=" + Maths + ", Science=" + Science + ", Social_science="
				+ Social_science + ", Total_marks=" + Total_marks + ", Percentage=" + Percentage + "]";
	}
	public String getFather_name() {
		return Father_name;
	}
	public void setFather_name(String father_name) {
		Father_name = father_name;
	}
	public String getMother_name() {
		return Mother_name;
	}
	public void setMother_name(String mother_name) {
		Mother_name = mother_name;
	}
	public int getTamil() {
		return Tamil;
	}
	public void setTamil(int tamil) {
		Tamil = tamil;
	}
	public int getEnglish() {
		return English;
	}
	public void setEnglish(int english) {
		English = english;
	}
	public int getMaths() {
		return Maths;
	}
	public void setMaths(int maths) {
		Maths = maths;
	}
	public int getScience() {
		return Science;
	}
	public void setScience(int science) {
		Science = science;
	}
	public int getSocial_science() {
		return Social_science;
	}
	public void setSocial_science(int social_science) {
		Social_science = social_science;
	}
	public int getTotal_marks() {
		return Total_marks;
	}
	public void setTotal_marks(int total_marks) {
		Total_marks = total_marks;
	}
	public double getPercentage() {
		return Percentage;
	}
	public void setPercentage(double percentage) {
		Percentage = percentage;
	}
	
	
	}
	


