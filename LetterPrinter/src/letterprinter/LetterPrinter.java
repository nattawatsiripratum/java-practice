package letterprinter;

public class LetterPrinter {

    public static void main(String[] args) {
        Letter letter=new Letter("Clarissa","Jade");
        Letter letter2=new Letter("Mickey","Bow");
        letter.addLine("We must find Simon quickly.");
        letter2.addLine("Test test test");
        letter.addLine("He might be in danger.");
        System.out.println(letter.getText());
    }
}
