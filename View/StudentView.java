package View;
/*
 * Создать класс StudentView, содержащий в себе метод вывода в консоль данных студента поданных на вход — 
 * Всё вышеуказанное создать согласно принципам ООП, пройдённым на семинаре.
 */

import java.util.ArrayList;

import Data.Student;

public class StudentView {
    public void enterStudent(int id, ArrayList<Student> students) {
        for (Student student : students) {
            if (id == student.getId()) {
                System.out.println(student);
            }
        }
    }

}
