public class ReverseString {

	public static void main(String[] args) {
		
		String s = "The Sky is Blue A B C";
		
		System.out.println(reverse(s));
	}
	
	public static String reverse(String str){
		String[] oldString = str.split(" ");
		String newString ="";
		
		for(int i = oldString.length - 1; i >= 0; --i){
			newString += " "+oldString[i];
		}
		return newString.substring(1);
	}
	
}
