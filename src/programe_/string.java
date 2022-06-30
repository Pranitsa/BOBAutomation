package programe_;

public class string {
public static void main(String[] args) {
	
	String alphaNumericString = "SELENIUM255651";

    char[] carray = alphaNumericString.toCharArray();

        for (char c : carray) {
            if (Character.isDigit(c))
            {
                    System.out.println(c);


            }
    }

}

}


