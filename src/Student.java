import java.util.ArrayList;
import java.util.List;

public class Student {


    private String id = "00000";
    private String name;
    private String lastName;
    private String lvl;
    private String stage = "stage";
    private List courses ;
    private float grades = -1;

    //Constructor to ask values without grades


    public Student(String id, String name, String lastName, String lvl, String stage) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.lvl = lvl;
        this.stage = stage;
    }

    //constructor with  course
    public Student(String id, String name, String lastName, String lvl, String stage, List courses, float grades) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.lvl = lvl;
        this.stage = stage;
        this.courses = courses;
        this.grades = grades;
    }

    public Student() {
    }


    //getters and setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLvl() {
        return lvl;
    }

    public void setLvl(String lvl) {
        this.lvl = lvl;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public List getCourses() {
        return courses;
    }

    public void setCourses(List courses) {
        this.courses = courses;
    }

    public float getGrades() {
        return grades;
    }

    public void setGrades(float grades) {
        this.grades = grades;
    }


}
