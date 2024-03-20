package Data;

public class Student extends User {
    private int id;

    public Student(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student [ name = " + name + ", age = " + age + ", id=" + id + "]";
    }

}
