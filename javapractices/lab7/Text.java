package org.javapractices.lab7;


public class Text {
    private Sentence[] text;
    private Sentence header;

    Text(String[] str) {
        text = new Sentence[str.length];

        for (int i = 0; i < str.length; i++){
            text[i] = new Sentence(str[i]);
        }
    }

    public void completeText(String[] txt, String[] str) {
        int len = txt.length + str.length;
        text = new Sentence[len];
        text[0] = new Sentence(txt[0]);
        for (int j = 1; j < len; j++) {
            text[j] = new Sentence(str[j-1]);}
    }

    public void setHeader(Sentence s) {
        header = s;
    }

    public void printHeader() {
        System.out.println(header);
    }


    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();

        for (Sentence sentence : this.text)
            str.append(sentence.toString());

        return str.toString();
    }


}
