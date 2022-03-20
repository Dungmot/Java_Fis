package fis.topic01.practice01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class StudentList extends Student{

	private ArrayList<Student> students;
	private int count;
	private ISortStrategy sortStrategy;
	
	//StudentList rỗng
	public StudentList() {
		this.students = new ArrayList<Student>();
	}
	
	//contructor có data
	public StudentList(ArrayList<Student> students) {
		this.students = students;
	}
	
	//addStudent vào cuối ds
	public void addStudent(Student student) {
		this.students.add(student);
		
	}
	
	public boolean removeStudent(Student student) {
		return this.students.remove(student);
		
	}
	
	public boolean kiemTraTonTai(Student student) {
		return this.students.contains(student);
	}
	
	public void display() {
		for (Student student : students) {
			System.out.println(student);
		}
	}
	
	public void sort() {
		Collections.sort(this.students, new Comparator<Student>() {
			
			@Override
			public int compare(Student o1, Student o2) {
				if(o1.getCode()>o2.getCode()) {
					return 1;
				}
					return -1;
			}
		});
	}
	

	public ISortStrategy getSortStrategy() {
		return sortStrategy;
	}

	public void setSortStrategy(ISortStrategy sortStrategy) {
		this.sortStrategy = sortStrategy;
	}
	
	public void sortCount(int[] count){
		sortStrategy.sort(count);
	}
	

}
