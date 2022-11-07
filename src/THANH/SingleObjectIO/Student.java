package THANH.SingleObjectIO;

import java.io.Serializable;

public class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String ID;
	private String Name;
	private int StudentYear;

	public Student() {

	}

	public Student(String ID, String Name, int StudentYear) {
		this.ID = ID;
		this.Name = Name;
		this.StudentYear = StudentYear;
	}

	public String getID() {
		return this.ID;
	}

	public void setID(String ID) {
		this.ID = ID;
	}

	public String getName() {
		return this.Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public int getStudentYear() {
		return this.StudentYear;
	}

	public void setStudentYear(int StudentYear) {
		this.StudentYear = StudentYear;
	}

	@Override
	public String toString() {
		return "Student [ID= " + ID + ", Name= " + Name + ", StudentYear= " + StudentYear + "]";
	}

}
