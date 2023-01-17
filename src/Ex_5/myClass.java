package Ex_5;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class myClass {
    String name;
    int students;
    String teacher;

    public String getName() {
        return name;
    }

    public int getStudents() {
        return students;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudents(int students) {
        this.students = students;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
}
