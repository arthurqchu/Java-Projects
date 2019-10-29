
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
		FileInputStream stream = new FileInputStream(args[0]);
		String inputString = "";
		int data;
		while(data != -1) {
			data = stream.read();
			inputString += data;
		}
		List<String> lines = inputString.split("\n");
	}

	/**  
	* Return true if the list of lines contains mismatched parentheses.  
	* This method also prints out error messages to std out if  
	* mismatched parentheses are discovered. Parentheses checked include  
	* {}, [], and ().  
	* @param lines the list of lines  
	* @return true if thae lines contain mismatched parentheses, false  
	* otherwise  
	*/  
	public static boolean containsMismatchedParentheses(List<String> lines) {
		Stack stack = new Stack();
		for(String current:lines) {
			for(int i = 0; i < current.length(); i++) {
				//Opening parentheses
				if(lines.get(i).equals('{')) {
					stack.push(lines.get(i));
				}

				if(lines.get(i).equals('[')) {
					stack.push(lines.get(i));
				}

				if(lines.get(i).equals('(')) {
					stack.push(lines.get(i));
				}
				//CLosing parentheses
				if(lines.get(i).equals('}')) {
					if(stack.peek().equals('{')) {
						stack.pop();
					}
					else {
						System.out.printf("Error: Closing } encountered; %s popped off the stack.\n", stack.pop());
					}
				}

				if(lines.get(i).equals(']')) {
					if(stack.peek().equals('[')) {
						stack.pop();
					}
					else {
						System.out.printf("Error: Closing ] encountered; %s popped off the stack.\n", stack.pop());
					}
				}

				if(lines.get(i).equals(')')) {
					if(stack.peek().equals('(')) {
						stack.pop();
					}
					else {
						System.out.printf("Error: Closing ) encountered; %s popped off the stack.\n", stack.pop());
					}
				}

			}
		}
		//Check if stack is empty to determine is parentheses are balanced
		if(stack.empty() == false ) {
			System.out.println("Stack not empty, not all parentheses closed.");
			return true;
		}
		else {	
			System.out.println("Parentheses are balanced.");
			return false;
		}
	}
}


