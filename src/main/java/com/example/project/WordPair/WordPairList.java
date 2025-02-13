package com.example.project.WordPair;

import java.util.ArrayList;

public class WordPairList {
    private ArrayList<WordPair> allPairs;

    public WordPairList(String[] words) {
        allPairs = new ArrayList<WordPair>();
        for(int i = 0; i < words.length; i ++) {
          for(int j = i + 1; j < words.length; j++) {
            WordPair toAdd = new WordPair(words[i], words[j]);
            allPairs.add(toAdd);
          }
        }
    }
      

    // The method below was added for testing;
    // it was not part of the original FRQ
    public ArrayList<WordPair> getAllPairs() {
        return allPairs;
    }

    public int numMatches() {
        int match = 0;
        for(int i = 0; i < allPairs.size(); i++) {
          WordPair thisPair = allPairs.get(i);
          if(thisPair.getFirst().equals(thisPair.getSecond())) {
            match ++;
          }
        }
        return match;
      }
      

    // The method below was added for testing;
    // it was not part of the original FRQ
    public String toString() {
        return allPairs.toString();
    }
}
