package Serilizable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable{
	
	int rollno;
	String name;
	int age;
	
	public Student(int rollno, String name, int age) 
	{
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		File f=new File("Student.txt");
		
		//write object in file k/as serialization
		
		FileOutputStream fo=new FileOutputStream(f);
		
		@SuppressWarnings("resource")
		ObjectOutputStream out=new ObjectOutputStream(fo);
		
		out.writeObject(new Student(101, "abc", 23));
		
		out.flush();
		System.out.println("Done");
	
	
	//read object from file=deserialization
	FileInputStream fi=new FileInputStream(f);
	
	@SuppressWarnings("resource")
	ObjectInputStream oi=new ObjectInputStream(fi);
	
	Student stu=(Student)oi.readObject();
	
	System.out.println(stu.rollno);
	System.out.println(stu.name);
	System.out.println(stu.age);
	
	
	
	
	
	}
}
