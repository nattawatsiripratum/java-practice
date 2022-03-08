package march3example;

public class March3example {

    public static void main(String[] args) {
        
        Student s = new Student("Tom",6334567823L);
        s.enroll(2301170,2562,1);
        s.enroll(2301172,2562,1);
        s.enroll(2301260,2562,2);
        s.enroll(2301263,2563,1);
        System.out.println(s.toString());
    }   
}
