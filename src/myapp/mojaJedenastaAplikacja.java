package myapp;
import java.util.*;

public class mojaJedenastaAplikacja {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("12345", "Jan", "Kowalski", Arrays.asList(4, 5, 3, 5)),
                new Student("67890", "Anna", "Nowak", Arrays.asList(5, 5, 4, 4)),
                new Student("54321", "Paweł", "Wiśniewski", Arrays.asList(2, 3, 2, 4)),
                new Student("09876", "Katarzyna", "Kowalczyk", Arrays.asList(5, 4, 4, 5))
        );

        Student najlepszyStudent = null;
        double najwyzszaSrednia = 0.0;
        double sumaOcen = 0.0;

        for (Student s : students) {
            double srednia = s.obliczSrednia();
            sumaOcen += srednia;
            if (najlepszyStudent == null || srednia > najwyzszaSrednia) {
                najlepszyStudent = s;
                najwyzszaSrednia = srednia;
            }
        }

        System.out.printf(
                "Student z najwyższą średnią: %s %s (%s) - Average: %.2f%n",
                najlepszyStudent.getImie(),
                najlepszyStudent.getNazwisko(),
                najlepszyStudent.getNumerIndeksu(),
                najlepszyStudent.obliczSrednia()
        );

        System.out.println("Studenci posortowani według nazwisk:");
        students.sort(Comparator.comparing(Student::getNazwisko));

        for (Student s : students) {
            System.out.printf(
                    "%s %s (%s) - Average: %.2f%n",
                    s.getImie(),
                    s.getNazwisko(),
                    s.getNumerIndeksu(),
                    s.obliczSrednia()
            );
        }

        double sredniaWszystkich = sumaOcen / students.size();
        System.out.printf("Średnia ocen wszystkich studentów: %.2f%n", sredniaWszystkich);
    }
}