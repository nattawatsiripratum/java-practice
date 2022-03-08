package studenttester;

public class StudentTester {

    public static void main(String[] args) {
        Student me=new Student("Siri Mala",6334567823L,120);
        System.out.println(me.getName()+" "+me.getID()+" "+me.getScore()+" "+me.getGrade());
        
        Student me2=new Student("Siri Mala",6334567823L);
        System.out.println(me2.getName()+" "+me2.getID()+" "+me2.getScore()+" "+me2.getGrade());
    }    
}
