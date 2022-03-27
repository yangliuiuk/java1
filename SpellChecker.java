/* Implement a Spell Checker
Write a program that prompts the user to enter a word and then 
displays whether the word is a correct English word. If not, the
program should also suggest the closest word as a correction. 
A word is a correct English word if it can be found in an English 
dictionary. You can use the file "20k.txt" that contains the most 
frequently used 20k English words to build a dictionary. To measure 
how close two words are to each other, you can simply count how many 
characters are different in the two words. For example, the distance 
between "hello" and "hallo" is 1; the distance between "hello" and 
"he" is 3. Below are sample runs:

Enter a word: hello
correct word

Enter a word: hallo
incorrect word
Do you mean 'hall' ?

*/

import java.util.Scanner;
public class SpellCheck {
    public static void main(String[] args) throws Exception{

        String[] dict = new String[20000];
        java.io.File file = new java.io.File("20k.txt");
        Scanner input = new Scanner(file);
        int index = 0;
        while (input.hasNext()){
            dict[index] = input.next();
            index ++;
        }
        input.close();

        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = input2.next();

        int dist_min = 1000;
        String correct_word = "";
        boolean isValidWord = false;
        for (int i = 0; i < dict.length; i ++) {
            int distance = wordDistance(word, dict[i]);
            if (distance < dist_min){
                dist_min = distance;
                correct_word = dict[i];
            }
            if (distance == 0){
                isValidWord = true;
                break;
            }
        }

        if (isValidWord){
            System.out.println("correct word");
        }
        else {
            System.out.println("incorrect word");
            System.out.println("Do you mean '" + correct_word + "' ?");
        }

    }

    public static int wordDistance(String word1, String word2){
        int dist = 0;
        for (int i = 0; i < word1.length() && i < word2.length() ; i ++) {
            if (word1.charAt(i) != word2.charAt(i))
                dist ++;
        }
        dist += Math.abs(word1.length() - word2.length());
        return dist;
    }

}
