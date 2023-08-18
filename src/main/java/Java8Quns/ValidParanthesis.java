package Java8Quns;

import java.util.Stack;

public class ValidParanthesis {
	
	public static void main(String args[]) {
		Stack<Character> stack = new Stack<Character>();
		String s = "}";
		
		char[] chars = s.toCharArray();
		
		for(int i=0;i < chars.length;i++) {
			if(stack.empty()) stack.push(chars[i]);
			else {
				char ch = chars[i];
				char stacktop = stack.peek();
				switch(ch) {
					case ')':
						if(stacktop == '{' || stacktop == '[') {
							System.out.println("unmatched element in the console topElement is :: "+ stacktop);
						} else {
							stack.pop();
						}
						break;
					case ']':	
						if(stacktop == '{' || stacktop == '(') {
							System.out.println("unmatched element in the console topElement is :: "+ stacktop);
						} else {
							stack.pop();
						}
						break;
					case '}':
						if(stacktop == '[' || stacktop == '(') {
							System.out.println("unmatched element in the console topElement is :: "+ stacktop);
						} else {
							stack.pop();
						}
						break;
					default :
						stack.push(ch);
						break;
				
				} 
			}
		}
		
		if(!stack.empty()) {
			System.out.println("printing  matching elements in the console");
			System.out.println(stack);
		}
	}
}
