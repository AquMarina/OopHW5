import java.util.List;

import Data.Student;
import Data.Teacher;
import Service.DataService;

public class Main {
    public static void main(String[] args) {
        DataService data = new DataService();

        data.create(new Student("A", 16));
        data.create(new Student("B", 17));
        data.create(new Student("C", 16));
        data.create(new Teacher("AA", 45, List.of("Math", "Phisics")));
        data.create(new Teacher("BB", 35, List.of("Phisics")));
        data.create(new Teacher("CC", 47, List.of("Phisics", "Litres")));

        // data.read(true);
        // System.out.println();
        // data.read(false);
        System.out.println("Вошедшие студенты: ");
        data.findId(1);
        data.findId(2);
        data.findId(3);

    }

}
