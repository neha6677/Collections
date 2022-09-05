package com.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;



class Student1 {

	int rollno;
	String sname, classname;
	int totalmarks; // marks out of 500, total five subjects each subject marks 100.
	public Student1(int rollno, String sname, String classname, int totalmarks) {
		super();
		this.rollno = rollno;
		this.sname = sname;
		this.classname = classname;
		this.totalmarks = totalmarks;
	}
	
	
	public int getRollno() {
		return rollno;
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}


	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public String getClassname() {
		return classname;
	}


	public void setClassname(String classname) {
		this.classname = classname;
	}


	public int getTotalmarks() {
		return totalmarks;
	}


	public void setTotalmarks(int totalmarks) {
		this.totalmarks = totalmarks;
	}


	@Override
	public String toString() {
		return "Student1 [rollno=" + rollno + ", sname=" + sname + ", classname=" + classname + ", totalmarks="
				+ totalmarks + "]";
	}
	
	
	
}



	public class PrintingStudentsScore {
		public static void main(String[] args) {
  
			List<Student1> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("number of students");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.println("enter Roll num");
			int rollno=sc.nextInt();
			
			System.out.println("Enter student name");
			String sname=sc.next();
			
			System.out.println("Enter class name");
			String classname=sc.next();
			
			System.out.println("Enter total marks out of 500");
			int totalmarks=sc.nextInt();
			int percentage=totalmarks/5;
			list.add(new Student1(rollno, sname, classname, percentage));
			
		}
		System.out.println(list);
		
		Comparator<Student1> comparator1 = Comparator.comparing( Student1::getTotalmarks).reversed();
		//Comparator<Student1> comparator2 = Comparator.comparing( Student1::(int)getTotalmarks());
		//Student1 highestmarks = list.stream().max(comparator1).get();
		//System.out.println(highestmarks);
		System.out.println("................");
		List<String> sorted = list.stream().sorted(comparator1).map(x->x.getSname()).collect(Collectors.toList());
		System.out.println("first, second and third position student names are  " +sorted);
		
		List<String> names = 
				list.stream().filter(y->y.getTotalmarks()>50).map(x->x.getSname()).collect(Collectors.toList());
		System.out.println(names);
		
		List<String> below35 = 
				list.stream().filter(y->y.getTotalmarks()<35).map(x->x.getSname()).collect(Collectors.toList());
		System.out.println("Fail Students "+below35);
		
		List<String> averageScore = 
				list.stream().filter(y->y.getTotalmarks()>35).map(x->x.getSname()).collect(Collectors.toList());
		System.out.println(" Students above average score "+averageScore);
		
		
		List<String> list2= list.stream().map(z->z.getSname()).collect(Collectors.toList());
		System.out.println(list2);
		
		
		Comparator<Student1> comparator2 = Comparator.comparing( Student1::getSname);
		
		List<Student1> detailbyname = list.stream().sorted(comparator1).collect(Collectors.toList());
		System.out.println(" Student Details   " +detailbyname);
		
		
		
	}

		
}