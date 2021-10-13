//replace first half with secod half of string
import java.util.*;
public class Replace {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
		String s=sc.next();
        StringBuilder temp = new StringBuilder("");		
		for (int i = s.length()/2; i < s.length(); i++) {
			temp.append(s.charAt(i));
		}

        StringBuilder temp2 = new StringBuilder("");		
		for (int i = 0; i < s.length() / 2; i++) {
			temp2.append(s.charAt(i));
		}

        StringBuilder rep = new StringBuilder("");
		rep.append(temp).append(temp2);
		System.out.println(rep);
    }
}
