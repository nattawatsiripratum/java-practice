package test;

class a {
    private String name;
    private int age;
    
    public a setName(String name) {
        this.name = name;
        return this;
    }
    
    public a setAge(int age) {
        this. age = age;
        return this;
    }
    
    public void print() {
        System.out.println("Name: "+name+"\nAge: "+age);
    }
}
