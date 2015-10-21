package FindAndReplace;

import java.io.*;
import java.util.*;

/**
 * Created by Jonathan Dedering on 8/31/15.
 */

public class FindAndReplace {

    private static HashMap<String, String> replacements = new HashMap<>();
    private static int ref = 0;
    private static String prevWord = "";
    private static String replacementFile = "/Users/Private/IdeaProjects/Dedering-Find_and_Replace/findandreplace.txt";
    private static String replacementInput = "/Users/Private/IdeaProjects/Dedering-Find_and_Replace/findandreplace-input.txt";
    private static String outputFile = "/Users/Private/IdeaProjects/Dedering-Find_and_Replace/findandreplace-output.txt";
    private static BufferedReader Reader = null;
    private static BufferedReader VarReader;
    private static String imported = "";
    private static String file;
    private static String replacedDoc = "";


    /*
    *
    * Main Method
    *
    */

    public static void main(String[] args) {

        // Import Replace Files
        imported = importFiles(replacementFile);
        replacedDoc = importReplacementFiles(replacementInput);

        // Remove Commas and Semicolons from Replacement File
        imported = removePunc(imported);

        // Create key value list of replacements
        learnReplacements();

        // Replace Values
        replace();

    }


    /*
    *
    * Create Print File
    *
    */


    public static PrintWriter startPrint() {
        try {
            PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter(outputFile)));
            return output;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    /*
    *
    * Remove unnecessary punctuation
    *
    */

    public static String removePunc(String replacer) {

        return replacer.replace(",", "").replace(":", "");

    }

    /*
    *
    * Replace Values
    *
    */

    public static void replace() {

        // Iterate Through Main Document
        // If a word is wrapped in << >> find replacement,
        PrintWriter output = startPrint();

        for (String word : replacedDoc.split("<<|>>")) {
            if (replacements.get(word) != null) {
                output.print(replacements.get(word));
            } else {
                output.print(word);
            }
            output.flush();
        }
    }

    /*
    *
    * Remove unnecessary punctuation
    *
    */

    public static void learnReplacements() {

        // Create HashMap of Replacements
        for (String impValueOne: imported.split("<<", 0)){
            for (String impValueTwo: impValueOne.split(">>", 0)) {
                if (impValueTwo != null) {
                    if (ref > 0) {
                        prevWord = impValueTwo;
                        ref = 0;
                    } else {
                        replacements.put(prevWord, impValueTwo);
                        ref++;
                    }
                }
            }
        }
    }


    /*
    *
    * Replace Values
    *
    */

    public static String importFiles(String importReplacementFile) {
        try {

            // Import Files
            Reader = new BufferedReader(new FileReader(importReplacementFile));

            // Iterate Through Lines of Replacement File
            while ((file = Reader.readLine()) != null) {
                imported += file;
            }



        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (Reader != null) {
                    Reader.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return imported;
    }
    /*
    *
    * Replace Values
    *
    */

    public static String importReplacementFiles(String importReplacementInput) {
        try {

            // Import Files
            VarReader = new BufferedReader(new FileReader(importReplacementInput));


            // Iterate Through Lines of Main Document
            while ((file = VarReader.readLine()) != null) {
                replacedDoc += file + "\n";
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (Reader != null) {
                    Reader.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return replacedDoc;
    }
}
