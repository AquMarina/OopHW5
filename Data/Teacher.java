package Data;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends User {
    private List<String> disciples;

    public Teacher(String name, int age, List<String> disciples) {
        this.name = name;
        this.age = age;
        this.disciples = disciples;
    }

    public List<String> getDisciplins() {
        return disciples;
    }

    public void setDisciplins(List<String> disciplins) {
        disciples = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Teacher [name = " + name + ", age = " + age + ", disciples=" + disciples + "]";
    }

}
