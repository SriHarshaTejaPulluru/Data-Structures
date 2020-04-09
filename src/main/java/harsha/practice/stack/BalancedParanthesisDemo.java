package harsha.practice.stack;

import java.util.HashMap;
import java.util.HashSet;

import harsha.practice.commons.StackUnderflowError;

/**
 * @author Harsha.Pulluru
 * 
 * Famous Paranthesis problem to check if the parantheis are balanced or not
 */
public class BalancedParanthesisDemo {
	private static HashMap<Character, Character> bracketsMap = new HashMap<>();
	private static HashSet<Character> openingBracketSet = new HashSet<>();

	static {
		bracketsMap.put('}', '{');
		bracketsMap.put(']', '[');
		bracketsMap.put('>', '<');
		bracketsMap.put('}', '{');
		openingBracketSet.addAll(bracketsMap.values());
	}

	public static void main(String[] args) {
		String paranthesisString = "[()]()";
		if (areParanthesisBalanced(paranthesisString)) {
			System.out.println(" The paranthesis are balanced");
		} else {
			System.out.println("The paranthesis are not balanced");
		}
	}

	private static boolean areParanthesisBalanced(String paranthesisString) {
		try {
			StackLogic<Character> stack = new StackLogic<>();
			Character paranthesis;
			for (int i = 0; i < paranthesisString.length(); i++) {
				paranthesis = paranthesisString.charAt(i);
				if (openingBracketSet.contains(paranthesis)) {
					stack.push(paranthesis);
				}
				if (bracketsMap.containsKey(paranthesis)) {
					Character latestTop = stack.pop();
					if (latestTop != bracketsMap.get(paranthesis)) {
						return false;
					}
				}
			}
			return stack.isEmpty();
		} catch (StackOverflowError e) {
			System.out.println("The stack is full");
		} catch (StackUnderflowError e) {
			System.out.println("The stack is empty");
		}
		return false;
	}

}
