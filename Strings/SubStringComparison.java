import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubStringComparison {

	public static void main(String[] args) {
		
		String s = "welcometojava";
		int k = 3;
		
		System.out.println(getSmallestAndLargest(s, k));
		
	}
	
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        List<String> sub = new ArrayList<String>();  
        for(int i=0; i<=(s.length()-k); i++ ){
            sub.add(s.substring(i, k+i));
        }

        Collections.sort(sub);
        
        smallest = sub.get(0);
        largest = sub.get(sub.size()-1);
        return smallest + "\n" + largest;
    }

    

}
