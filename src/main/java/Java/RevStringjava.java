package Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RevStringjava {
	
	String[]  strings;
	
	public String[] getStrings() {
		return strings;
	}

	public void setStrings(String[] strings) {
		this.strings = strings;
	}

	public static void main(String args[]) {
		Integer value = 100;
		System.out.println(Optional.ofNullable(value).orElse(0));
	}
	
	public void minHeapConstruction(List<Integer> list) {
		int lastIndex = list.size()-1;
		int lastIndexvalue = list.get(lastIndex);
		
		int parentIndex = 0;
		
		while(lastIndex > 0) {
			parentIndex =  (lastIndex-1)/2;
			int parentIndexValue = list.get(parentIndex);
			
			if(parentIndexValue > lastIndexvalue) {
				int temp = list.get(lastIndex);
				list.set(parentIndex, temp);
				list.set(lastIndex, parentIndexValue);
			}
			lastIndex = parentIndex;
		}
		
		System.out.println(list.get(0));
	}
}
