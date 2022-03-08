package questiontester;

import java.util.Scanner;

public class NumericQuestion extends Question {
    
    public NumericQuestion(String text) {
        super(text);  
    }
    
    public boolean checkAnswer(String response) {
        return Math.abs(Double.parseDouble(response) - Double.parseDouble(getAnswer()))<=0.01;
    }
}