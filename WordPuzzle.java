import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class WordPuzzle {

    public static void main(String[] args) {

        System.out.println("Welcome to WordPuzzleX!");

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter game level (1, 2, 3) for easy, medium, and hard): ");
        int numMasks = userInput.nextInt();
        userInput.nextLine();

        int MAX_NUM_PUZZLES = 10;
        String WORDS_FILE = "wordlist.10000.txt";

        ArrayList<String> words = loadWords(WORDS_FILE);
        Collections.shuffle(words);

        System.out.println("Type to complete the following words (press enter to skip): ");

        long startTime = System.currentTimeMillis();

        int numPuzzles = 0;
        int wordIndex = 0;
        int score = 0;
        while (numPuzzles < MAX_NUM_PUZZLES && wordIndex < words.size()) {

            String word = words.get(wordIndex);
            if (word.length() >= numMasks + 2) {
                String wordWithMasks = addMask(word, numMasks);
                if (hasUniqueSolution(wordWithMasks, words)) {
                    //System.out.println(wordWithMasks + " " + word);
                    System.out.print(wordWithMasks + ": ");
                    String guess = userInput.nextLine();
                    if (guess.equals(word)) {
                        System.out.println("Correct!");
                        score++;
                    }
                    else{
                        System.out.println("Wrong, the correct answer is: " + word);
                    }

                    numPuzzles++;
                }
            }

            wordIndex++;
        }
        long endTime = System.currentTimeMillis();
        long timeSpent = (endTime - startTime) / 1000;

        System.out.printf("Your score is: %d/%d\n", score, MAX_NUM_PUZZLES);
        System.out.printf("Total time spent: %d seconds\n", timeSpent);
    }

    /**
     * Read words from a dictionary file.
     * */
    public static ArrayList<String> loadWords(String filePath) {
        ArrayList<String> words = new ArrayList<String>();
        try {
            Scanner input = new Scanner(new File(filePath));
            while (input.hasNext()) {
                String word = input.next();
                words.add(word);
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
        
        return words;
    }

    /** Randomly add some masks onto a word */
    public static String addMask(String word, int numMasks) {
        ArrayList<Integer> positions = new ArrayList<Integer>();
        for (int i = 1; i < word.length() - 1; i++) {
            positions.add(i);
        }
        Collections.shuffle(positions);
        StringBuilder word2 = new StringBuilder(word);
        for (int i = 0; i < numMasks; i++) {
            word2.setCharAt(positions.get(i), '_');
        }
        return word2.toString();
    }

    /** Check if a word is a solution/match to a word with masks */
    public static boolean matches(String wordWithMasks, String word) {
        if (wordWithMasks.length() != word.length()) {
            return false;
        }
        for (int i = 0; i < wordWithMasks.length(); i++) {
            if (wordWithMasks.charAt(i) != '_' && wordWithMasks.charAt(i) != word.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    /** Check whether a puzzle has an unique solution in a dictionary*/
    public static boolean hasUniqueSolution(String wordWithMasks, ArrayList<String> words) {
        int numSolutions = 0;
        for (String word : words) {
            if (matches(wordWithMasks, word)) {
                numSolutions++;
            }
            if (numSolutions > 1) {
                return false;
            }
        }
        if (numSolutions == 1) {
            return true;
        }
        else {
            return false;
        }
    }
}