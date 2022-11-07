package org.javapractices.lab7;

public class Word {
    private String word;

    Word() { word = ""; }
    Word(String word) { this.word = word; }

    @Override
    public String toString() { return word; }
}
