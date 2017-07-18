public class StringTokens {

	public static void main(String[] args) {

		String s = "He is a very very good boy, isn't he?";

		String[] parts = s.split("[ !,?._'@]+");
		System.out.println(parts.length);
		for(int i =0; i < parts.length; i++){
			System.out.println(parts[i]);
		}
	}

}
