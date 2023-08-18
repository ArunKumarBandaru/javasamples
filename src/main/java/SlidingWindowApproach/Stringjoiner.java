package SlidingWindowApproach;

import java.util.ArrayList;
import java.util.List;

public class Stringjoiner {
	public static void main(String args[]) {
		List<String> list  = new ArrayList<String>();
		list.add("Arun");
		list.add("kumar");
		list.add("bandaru");
		
		
		String sample = "This is arun kumar bandaru";
		String[] numOfStrings = sample.split(" ");
		sample = String.join(",", list);
		System.out.println(sample);
	}
}
