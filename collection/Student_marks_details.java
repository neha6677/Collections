package com.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {

	int rollno;
	String name;
	String classname;

	int hin;
	int eng;
	int math;
	int sci;
	int comp;
	

	public Student(int rollno, String name, String classname, int hin, int eng, int math, int sci, int comp) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.classname = classname;
		this.hin = hin;
		this.eng = eng;
		this.math = math;
		this.sci = sci;
		this.comp = comp;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public int getHin() {
		return hin;
	}

	public void setHin(int hin) {
		this.hin = hin;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSci() {
		return sci;
	}

	public void setSci(int sci) {
		this.sci = sci;
	}

	public int getComp() {
		return comp;
	}

	public void setComp(int comp) {
		this.comp = comp;
	}
	
	public double getPercent(int hin, int eng, int math, int sci, int comp) {
		int total=getHin()+getEng()+getMath()+getSci()+getComp();
		double percent=total/5;
		return percent;
		
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", classname=" + classname + ", hin=" + hin + ", eng="
				+ eng + ", math=" + math + ", sci=" + sci + ", comp=" + comp + "]";
	}

}

public class Student_marks_details {

	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<>();

		// TotalMarks m = new TotalMarks();

		Student s1 = new Student(1, "Megha", "Class 9", 30, 30, 30, 30, 30);
		Student s2 = new Student(2, "neha", "Class 9", 85, 90, 60, 90, 90);
		Student s3 = new Student(4, "vedha", "Class 9", 70, 70, 50, 40, 50);
		Student s4 = new Student(5, "Shirin", "Class 9", 55, 78, 65, 58, 45);
		Student s5 = new Student(6, "Arun", "Class 9", 77, 80, 74, 98, 82);
		// Student s4 = new Student(46, "Shiri", "Class 10th", );
		// s1.totalmarks.eng=20;

		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		// int max = list.stream().map(x->x.g).max(Integer::compare).get();

		double percent1 = s1.getPercent(30, 30, 30, 30, 30);
		System.out.println(percent1);
		
		double percent2 = s2.getPercent(85, 90, 60, 90, 90);
		System.out.println(percent2);
		
		double percent3 = s3.getPercent(70, 70, 50, 40, 50);
		System.out.println(percent3);
		
		double percent4 = s4.getPercent(55, 78, 65, 58, 45);
		System.out.println(percent4);
	
		double percent5 = s5.getPercent(77, 80, 74, 98, 82);
		System.out.println(percent5);
		
		double a[]= {percent1,percent2, percent3,percent4, percent5 };
			double temp=0;
			int len=a.length;
			for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
			
			if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
			
		}
			System.out.println("Third Position Secured by "+a[len-3]);
			System.out.println("second-max number is "+a[len-2]);
			System.out.println("First number is "+a[len-1]);
			double first=a[len-1];
			double second=a[len-2];
			double third=a[len-3];
			
			if(first==percent1 || second==percent1  ) {
				System.out.println(s1.getName());
			}
			else if (first==percent2 && second==percent2) {
				System.out.println(s2.getName());
			}
			else if (first==percent3 || second==percent3) {
				System.out.println(s3.getName());
			}
			else if (first==percent4 || second==percent4) {
				System.out.println(s4.getName());
			}
			else if (first==percent5 && second==percent5) {
				System.out.println(s5.getName());
			}
			
			
			
		
		
	}

}
