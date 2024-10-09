import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {
    
    public static boolean Anagram (String a, String b) {
        a = a.toLowerCase().replaceAll("\\s","");
        b = b.toLowerCase().replaceAll("\\s","");


        if (a.length()!= b.length()){
            return false;
        }       
        
        char[] charArrayA = a.toCharArray();
        char[] charArrayB = b.toCharArray();

        Arrays.sort(charArrayA);
        Arrays.sort(charArrayB);

        return Arrays.equals(charArrayA,charArrayB );

    }
        public static void main (String[] args){
            String stringA ="CAT";
            String stringB = "tac";

            boolean hasil = Anagram(stringA, stringB);
            System.out.println("APAKAH (\"" + stringA + "\" dan \"" + stringB + "\" adalah anagram ? " + hasil );

        } 




    }
