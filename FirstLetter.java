package PreWorkPractice;
import java.util.*;
public class FirstLetter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        System.out.println(firstLetterPrinter(input));
    }

    static String firstLetterPrinter(String str) {
        String Res = new String();
        for(int i = 0 ; i<str.length();i++){
            if(str.charAt(i)== ' '){
                Res = Res + str.charAt(i+1);
            }
        }

        Res = str.charAt(0)+ Res;

    return(Res);



    }
}
