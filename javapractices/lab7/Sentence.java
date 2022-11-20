package org.javapractices.lab7;

public class Sentence {
    private Word[] sentence;

    Sentence(String str) {
        String[] str_arr = str.split("[ ]+");
        sentence = new Word[str_arr.length];

        for (int i = 0; i < str_arr.length; i++) {
            sentence[i] = new Word(str_arr[i]);
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();

        for (Word word : sentence)
            str.append(word.toString()).append(' ');

        return str.toString();
    }
}
