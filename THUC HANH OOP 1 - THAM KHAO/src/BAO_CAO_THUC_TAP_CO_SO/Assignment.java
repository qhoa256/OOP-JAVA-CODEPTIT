package BAO_CAO_THUC_TAP_CO_SO;

public class Assignment implements Comparable<Assignment>{
    public String studentID, subjectID, councilID;
    public Student student;
    public Subject subject;

    public Assignment(String msv, String subjectID, String councilID) {
        this.studentID = msv;
        this.subjectID = subjectID;
        this.councilID = councilID;
    }

    @Override
    public int compareTo(Assignment other) {
        return this.student.ID.compareTo(other.student.ID);
    }

    @Override
    public String toString() {
        return student.ID + " " + student.name + " " + subject.subjectName + " " + subject.lecturerName;
    }
}
