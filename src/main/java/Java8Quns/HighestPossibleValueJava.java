package Java8Quns;

import java.io.IOException;
import java.util.List;

public class HighestPossibleValueJava {
	public static void main(String args[]) {
		String s1="abc";
		String s2="abc";//intern()
		//closable()
		//cache//
		System.out.println("s1 == s2 " + s1 == s2);//false
		//s1==s2abc == abc false
		System.out.println('b' + 'y' + 't' + 'e'); //integer 
	}
}





//diamond problem

//10 //8 -- 10 .. 20


class Emailclass {
	String name;
	int age;
	String emailID;
	int salary;
	List<String> listOfBooks;
	
	Emailclass(String name, int age, String emailID, int salary, List<String> listofBooks) {
		this.name = name;
		this.age = age;
		this.emailID = emailID;
		this.salary = salary;
		this.listOfBooks = listofBooks;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public List getListOfBooks() {
		return listOfBooks;
	}

	public void setListOfBooks(List listOfBooks) {
		this.listOfBooks = listOfBooks;
	}

	public String toString() {
		return name + " " + age + " " + emailID + " " + salary;
	}
}