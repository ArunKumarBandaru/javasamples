package Java8Quns;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapTestSample {
	public static void main(String args[]) {
		
		HashMap<Integer, String> map = new HashMap();
		
		map.put(200, "twoHundered");
		map.put(100, "hundred");
		
		map.put(400, "fourhundered");
		map.put(300, "threeHundered");
		
		map.put(600, "sixhundered");
		map.put(500, "fivehundred");
		
		map.put(800, "eightHundered");
		map.put(700, "sevenhundered");
		
		LinkedHashMap<Integer, String> map1 = map
				.entrySet()
				.stream().sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(Map.Entry::getKey, 
                        Map.Entry::getValue,
                        (v1,v2)->v1,
                        LinkedHashMap::new));
		
		System.out.println(map1);
	}
}


class EmailclassSample {
	String name;
	int age;
	String emailID;
	int salary;
	List<String> listOfBooks;

	EmailclassSample(String name, int age, String emailID, int salary, List<String> listofBooks) {
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
