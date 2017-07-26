import java.util.Collections;
import java.util.LinkedList;

public class LinkedListReverse {

	public static void main(String[] args) {
		String input = "Hello World";
		char[] charArray = input.toCharArray();
		String result = "";
		LinkedList<Character> ll = new LinkedList<Character>();
		
		for(int i = 0; i < charArray.length; i ++){
			ll.add(charArray[i]);
		}
		Collections.reverse(ll);
		for(char l: ll){
			result += l;
		}
		System.out.println(result);
	}
	
}
