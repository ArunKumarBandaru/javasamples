package Java;

import java.util.ArrayList;
import java.util.List;

public class NonRepeatingCharacter {
	
	public static void main(String args[]) {
		int arr[] = {1,2,3,1,2,5};
		
		List<Pair> list = new ArrayList<Pair>();
		for(int i = 0;i<arr.length;i++) {
			for(int j=0;j<list.size();j++) {
				
			}
		}
	}
}

class Pair {
	int value;
	int repetion;
	
	Pair(int value, int repetion) {
		this.value = value;
		this.repetion = repetion;
	}
}
