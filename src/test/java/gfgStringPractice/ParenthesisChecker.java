package gfgStringPractice;

import java.util.Stack;

public class ParenthesisChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Character> stack= new Stack<>();
		String str="{([])}";
		
		for(int i=0;i<str.length();i++) {
			char ch= str.charAt(i);
			if(stack.isEmpty() && (ch=='}' || ch==']' || ch==')')) {
				System.out.println("Invalid Paranthesis");
				return;
			}
			
			if(ch=='{' || ch=='[' || ch=='(') {
				stack.push(ch);
			}
			else {
				
				switch(ch) {
				case ')': if(stack.peek()!='(') {
							System.out.println("Invalid paranthesis");
							return;
						}
						break;
				case '}': if(stack.peek()!='{') {
					System.out.println("Invalid paranthesis");
					return;
				}
				break;
				case ']': if(stack.peek()!='[') {
					System.out.println("Invalid paranthesis");
					return;
				}
				break;
				default: break;
				}
				stack.pop();
			}
			
		}
		
		if(stack.isEmpty()) {
			System.out.println("Valid paranthesis");
		}
		else {
			System.out.println("Invalid paranthesis");
		}
	
	}

}
