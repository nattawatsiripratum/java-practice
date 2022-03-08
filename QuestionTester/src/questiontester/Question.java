package questiontester;

public class Question {
    private String text;
    private String answer;
    
    public Question() {}
    
    public Question(String text) {
        this.text = text;
    }
    
    public void setText(String text) {
        this.text = text;
    }
    
    public void setAnswer(String answer) {
        this.answer = answer;
    }
    
    public String getText() {
        return text;
    }
    
    public String getAnswer() {
        return answer;
    }
    
    public boolean checkAnswer(String response) {
        return response.equals(answer);
    }
    
    public void display() {
        System.out.println(text);
    }
}