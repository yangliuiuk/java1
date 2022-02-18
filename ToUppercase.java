import java.util.Scanner;
public class ToUpperCase{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        String s1 = "";
        for (int i = 0; i < s.length(); i ++){
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                s1 += (char)(s.charAt(i) - 'a' + 'A');
            }
            else 
                s1 += s.charAt(i);
        }
        System.out.print("New string is: " + s1);
    }
}
