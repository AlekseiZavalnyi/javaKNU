
package org.javapractices.lab7;


public class Task5_1 {
        public static void main (String[] args) {
            
        String[] txt = {"On a hill overlooking the kingsroad, a long trestle table of rough-hewn pine had been \n"
                + "erected beneath an elm tree and covered with a golden cloth. There, beside his pavilion, \n"
                + "Lord Tywin took his evening meal with his chief knights andlords bannermen, his great \n"
                + "crimson-and-gold standard waving overhead from a lofty pike. \n"};
        Text text = new Text(txt);
        text.setHeader(new Sentence("TYRION"));
        text.printHeader();
        System.out.print(text);
        
        String[] new_str = {"Tyrion arrived late, saddlesore, and sour, all too vividly aware of how amusing \n"
                + "he must look as he waddled up the slope to his father..."};
        
        System.out.print("\n\nАfter adding to the text\n\n");
        text.printHeader();
        text.completeText(txt, new_str);
        System.out.println(text);
    }
}
