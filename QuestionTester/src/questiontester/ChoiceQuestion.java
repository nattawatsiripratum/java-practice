package questiontester;

import java.util.ArrayList;

public class ChoiceQuestion extends Question {
    private ArrayList<String> choices = new ArrayList<>();
    private int index=1;
    
    public ChoiceQuestion(String text) {
        super(text);
    }
    
    public void addChoice(String choice, boolean correct) {
        choices.add(choice);
        if (correct) setAnswer(String.valueOf(index));
        index++;
    }
    
    @Override
    public void display() {
        super.display();
        for (int i=0; i<choices.size(); i++) {
            System.out.println(i+1+": "+choices.get(i));
        }
    }
    
    @Override
    public boolean checkAnswer(String response) {
        return response.equals(getAnswer());
    }
}