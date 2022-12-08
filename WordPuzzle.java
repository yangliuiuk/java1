import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.io.File;

public class WordPuzzle {

    public static void main(String[] args) throws Exception {
        final String FILE_PATH = "wordlist.10000.txt";
        final int NUM_OF_PUZZLES = 10;

        System.out.println("Welcome to WordPuzzle!");
        System.out.print("Enter game level (1, 2, 3 for easy, medium, and hard): ");
        Scanner input = new Scanner(System.in);
        int numOfMasks = input.nextInt();
        input.nextLine(); // clean the string buffer

        ArrayList<String> dictionary = loadDictionary(FILE_PATH);
        Collections.shuffle(dictionary); // shuffle the dictionary
        
        System.out.println("Type to complete words:");

        long startTime = System.currentTimeMillis(); 

        int currentNumOfPuzzles = 0;
        int score = 0;
        for (String word : dictionary) {
            if (isMaskable(word, numOfMasks)) {
                String wordWithMasks = maskWord(word, numOfMasks);
                if (hasUniqueSolution(wordWithMasks, dictionary)) {
                    System.out.print(wordWithMasks + ": ");
                    String answer = input.nextLine();
                    if (answer.equals(word)) {
                        System.out.println("Correct!");
                        score++;
                    }
                    else {
                        System.out.println("Wrong, the correct answer is: " + word);
                    }

                    currentNumOfPuzzles++;
                    if (currentNumOfPuzzles >= NUM_OF_PUZZLES) {
                        break;
                    }
                }
            }
        }

        long endTime = System.currentTimeMillis(); 

        long timeSpent = (endTime - startTime) / 1000;

        System.out.printf("Your score is: %d/%d\n", score, NUM_OF_PUZZLES);
        System.out.printf("Time spent: %d seconds\n", timeSpent);

    }

    /** 
     * Load the words from the dictionary file into an ArrayList
     * @param filePath the path of the dictionary file
     * @return an ArrayList holding all the words from the dictionary
     * */
    
    public static ArrayList<String> loadDictionary (String filePath) throws Exception {
        ArrayList<String> dictionary = new ArrayList<String>();
        Scanner input = new Scanner(new File(filePath));
        while(input.hasNext()) {
            String word = input.nextLine();
            dictionary.add(word);
        }
        return dictionary;

    }

    /** 
     * Check whether a word is applicable to be masked
     * */

    public static boolean isMaskable (String word, int numOfMasks) {
        if (word.length() >= numOfMasks + 2) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Randomly mask a certain number of letters in a word
     * The first and the last letter should not be masked
     * @param word the word to be masked
     * @param numOfMasks the number of letters to be masked
     * @param maskSymbol the mask symbol
     * @return the masked word, i.e., the puzzle
     * */

    public static String maskWord (String word, int numOfMasks) {
        char maskSymbol = '_';
        ArrayList<Integer> charPositions = new ArrayList<Integer>();
        for (int i = 1; i < word.length() - 1; i++) {
            charPositions.add(i);
        }
        Collections.shuffle(charPositions);
        //System.out.println(charPositions);
        StringBuilder wordWithMasks = new StringBuilder(word);
        for (int i = 0; i < numOfMasks; i++) {
            wordWithMasks.setCharAt(charPositions.get(i), maskSymbol);
        }
        return wordWithMasks.toString();
    }

    /** 
     * Check if a word puzzle has unique solution in the dictionary
     * @param wordWithMasks the word puzzle
     * @param dictionary the word dictionary
     * @return if a word puzzle has unique solution in the dictionary
     * */

    public static boolean hasUniqueSolution (String wordWithMasks, ArrayList<String> dictionary) {
        int numSolutions = 0;
        for (String word : dictionary) {
            if (matches(word, wordWithMasks)) {
                numSolutions++;
                if (numSolutions > 1) {
                    return false;
                }
            }
        }
        if (numSolutions == 1) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Check if a word is a solution to a puzzle 
     * @param word a word in the dictionary
     * @param wordWithMasks a word puzzle
     * @return whether they match
     * */

    public static boolean matches (String word, String wordWithMasks) {
        if (word.length() != wordWithMasks.length()) {
            return false;
        }
        for (int i = 0; i < word.length(); i++) {
            if (wordWithMasks.charAt(i) != '_' && word.charAt(i) != wordWithMasks.charAt(i)) {
                return false;
            }
        }
        return true;
    }

}

