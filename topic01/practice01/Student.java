package fis.topic01.practice01;

import java.util.Date;
import java.util.Objects;

public class Student implements Comparable<Student>{
	private int code;
	private String name;
	private Date birthDate;
	
	//constructors
	public Student(int code, String name, Date birthDate) {
		super();
		this.code = code;
		this.name = name;
		this.birthDate = birthDate;
	}
	
	
	public Student(int code) {
		super();
		this.code = code;
	}

	public Student() {
		super();
	}

	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	@Override
	public String toString() {
		return "Sinh viên: "+name+"\t[Mã sinh viên: " + code + ", Tên sinh viên: " + name + ", Ngày sinh: " + birthDate + "]";
	}

	@Override
	public int compareTo(Student student) {
		// Kiểm tra SV có tồn tại trong ds
		return 0;
	}


	@Override
	public int hashCode() {
		return Objects.hash(birthDate, code, name);
	}

	//Kiểm tra sinh viên có tồn tại không
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return  code == other.code ;
	}
	
	

	
	
}
