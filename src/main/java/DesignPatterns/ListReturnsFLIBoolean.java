package DesignPatterns;

import java.util.ArrayList;
import java.util.List;

public class ListReturnsFLIBoolean {
	
	public static void main(String args[]) {
		List<String> list = new ArrayList();
		
		list.add("100");
		list.add("200");
		list.add("300");
		
		System.out.println(list.stream().anyMatch(x -> ("100".equals(x) || "200".equals(x))));
		
	}

}
