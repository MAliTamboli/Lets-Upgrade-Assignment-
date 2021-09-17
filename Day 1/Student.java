package Day_1;

import java.util.Scanner;

public class Student {
	int rollno;
	String name;
	float marks;
	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.print( "Enter Rollno");
		rollno=sc.nextInt();
		System.out.print( "Enter Name");
		name=sc.next();
		System.out.print( "Enter Marks");
		marks=sc.nextFloat();
		
	}
	void display() {
		System.out.println("Rollno="+rollno);
		System.out.println("Name="+name);
		System.out.println("Marks="+marks);
	}

	public static void main(String[] args) {
		 Student stud=new Student();
		 stud.input();
		 stud.display();
	}
	

}
