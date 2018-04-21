package practice03;

public class Student extends Person{
    private String name;
    private int age;
    private int klass;

    public Student(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        return "I am a Student. I am at Class 2.";
    }
}
