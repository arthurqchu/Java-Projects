
// Libraries to use
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

/*** CodeChecker can be used to detect mismatched parentheses (including
* {}, [], and()) in a source file passed in through the command line
* arguments. 
* <br>
* Usage: {@code java CodeChecker /path/to/source.java}
*/
public class CodeChecker {

	public static void main(String[] args) throws IOException {
		FileInputStream stream = new FileInputStream("Circle.java"); //FIXME
		String inputString = "";
		int data = -2;
		while(data != -1) {
			data = stream.read();
			String tmpString = String.valueOf((char)data);
			inputString += tmpString;
		}
		List<String> lines = new ArrayList<String>();
		String[] stringArray = inputString.split("\n");
		for(String str : stringArray) {
			lines.add(str);
		}

		containsMismatchedParentheses(lines);
	}

	/**  
	* Return true if the list of lines contains mismatched parentheses.  
	* This method also prints out error messages to std out if  
	* mismatched parentheses are discovered. Parentheses checked include  
	* {}, [], and ().  
	* @param lines the list of lines  
	* @return true if the lines contain mismatched parentheses, false  
	* otherwise  
	*/  
	public static boolean containsMismatchedParentheses(List<String> lines) {
		Stack<Character> stack = new Stack<>();
		String longString = "";
		boolean errorFound = false;
		for(String current:lines) {
			longString += current;
		}
		for(int i = 0; i < longString.length(); i++) {
			//Opening parentheses
			if(longString.charAt(i) == '{') {
				stack.push(longString.charAt(i));
			}

			if(longString.charAt(i) == '[') {
				stack.push(longString.charAt(i));
			}

			if(longString.charAt(i) == '(') {
				stack.push(longString.charAt(i));
			}
			//CLosing parentheses
			if(longString.charAt(i) == '}') {
				if(stack.empty() != true) {
					if(stack.peek().equals('{')) {
						stack.pop();
					}
					else {
						System.out.printf("Error: Closing } encountered; %s popped off the stack.\n", stack.pop());
						errorFound = true;
					}
				}
			}

			if(longString.charAt(i) == ']') {
				if(stack.empty() != true) {
					if(stack.peek().equals('[')) {
						stack.pop();
					}
					else {
						System.out.printf("Error: Closing ] encountered; %s popped off the stack.\n", stack.pop());
						errorFound = true;
					}
				}
			}

			if(longString.charAt(i) == ')') {
				if(stack.empty() != true) {
					if(stack.peek().equals('(')) {
						stack.pop();
					}
					else {
						System.out.printf("Error: Closing ) encountered; %s popped off the stack.\n", stack.pop());
						errorFound = true;
					}
				}
			}

		}
		//Check if stack is empty to determine is parentheses are balanced
		if(stack.empty() == false ) {
			System.out.println("Stack not empty, not all parentheses closed.");
			return true;
		}
		else if(errorFound == false) {	
			System.out.println("Parentheses are balanced.");
			return false;
		}
		return errorFound;
	}
}


