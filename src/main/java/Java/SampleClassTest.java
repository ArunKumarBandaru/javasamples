package Java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SampleClassTest {
	
	public static void main(String args[]) {
		List<String> list = new ArrayList();
		list.add("Arun");
		list.add("Arun");
		list.add("Arun");
		list.add("Arun");
		list.add("Arun");
		
		list.add("kumar");
		list.add("Bandaru");
		
		Employee employee  = new Employee();
		employee.setSampleStrings(list);
		
		employee.setSampleStrings(employee.getSampleStrings().stream().filter(s -> "Arun".equals(s)).collect(Collectors.toList()));
		
		System.out.println(employee.getSampleStrings());
	}

}


class Employee {
	List<String> sampleStrings;

	public List<String> getSampleStrings() {
		return sampleStrings;
	}

	public void setSampleStrings(List<String> sampleStrings) {
		this.sampleStrings = sampleStrings;
	}
}