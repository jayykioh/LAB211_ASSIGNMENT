/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1.excersise1;

import java.util.HashMap;

/**
 *
 * @author FPT
 */
public class LetterandCharacterCount {

    private String input;

    public LetterandCharacterCount(String input) {
        this.input = input;
    }

    public HashMap<String, Integer> countwords() {
        HashMap<String, Integer> wordcount = new HashMap<>();

        if (input.isEmpty()) {
            return wordcount;
        }
        String[] arr = input.split("\\s+");
        for (String word : arr) {
            if (!word.isEmpty()) {
                if (wordcount.containsKey(word)) {
                    wordcount.put(word, wordcount.get(word) + 1);
                } else {
                    wordcount.put(word, 1);
                }
            }
        }
        return wordcount;
    }

    public HashMap<Character, Integer> countletter() {
        HashMap<Character, Integer> lettercount = new HashMap<>();
        if (input.isEmpty()) {
            return lettercount;
        }
        char[] arr = input.toCharArray();
        for (char c : arr) {
            if (Character.isLetter(c)) {
                if (lettercount.containsKey(c)) {
                    lettercount.put(c, lettercount.get(c) + 1);
                } else {
                    lettercount.put(c, 1);
                }
            }
        }
        return lettercount;
    }

}
