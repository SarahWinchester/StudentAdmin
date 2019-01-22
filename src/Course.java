import java.util.ArrayList;
import java.util.List;

public class Course {

    private String course;
    private float grade= -1;

    public Course(String course, float grade) {
        this.course = course;
        this.grade = grade;
    }

    public Course() {
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    /*
    //GETTERS SETTER

    public static List<String> getAddcourse() {
        return addcourse;
    }



    //adding
    public void newCourse(){
        Course.addcourse.add(0,"math");
        Course.addcourse.add(1,"spanish");
        Course.addcourse.add(2,"Programing");
        Course.addcourse.add(3,"Physics");
        Course.addcourse.add(4,"Geography");
        Course.addcourse.add(5, "French");
        Course.addcourse.add(6,"Art");
        Course.addcourse.add(7,"History");



        System.out.println("\n********************************************");
        System.out.println("\nCOURSE DATA");

        for (int i =0 ; i < Course.getAddcourse().size(); i++){

            System.out.println("\nCourse Avaible "+ (i)+ " " + Course.getAddcourse().get(i));



        }
    }*/



}
