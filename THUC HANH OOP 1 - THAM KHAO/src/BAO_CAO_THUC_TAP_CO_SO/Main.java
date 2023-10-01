package BAO_CAO_THUC_TAP_CO_SO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            students.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        sc.close();

        ArrayList<Subject> subjects = new ArrayList<>();
        sc = new Scanner(new File("DETAI.in"));
        n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            subjects.add(new Subject(sc.nextLine(), sc.nextLine()));
        }
        sc.close();

        ArrayList<ArrayList<Assignment>> councils = new ArrayList<>(9);
        for (int i = 0; i < 9; i++) {
            councils.add(new ArrayList<>());
        }
        sc = new Scanner(new File("HOIDONG.in"));
        n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String studentID = sc.next();
            String subjectID = sc.next();
            String councilID = sc.next();
            int num = councilID.charAt(2) - '0';
            Assignment assignment = new Assignment(studentID, subjectID, councilID);

            for (Student student : students) {
                if (student.ID.equals(studentID)) {
                    assignment.student = student;
                }
            }
            for (Subject subject : subjects) {
                if (subject.ID.equals(subjectID)) {
                    assignment.subject = subject;
                }
            }

            councils.get(num).add(assignment);
        }
        sc.close();

        for (int i = 0; i < 9; i++) {
            if (!councils.get(i).isEmpty()) {
                Collections.sort(councils.get(i));
                System.out.printf("DANH SACH HOI DONG %d:\n", i);
                for (Assignment assignment : councils.get(i)) {
                    System.out.println(assignment);
                }
            }
        }
    }
}
