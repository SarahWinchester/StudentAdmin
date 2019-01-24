public class Course {

    private String courseName;
    private float grade= -1;
    //constructores

    public Course(String courseName, float grade) {
        this.courseName = courseName;
        this.grade = grade;
    }


    public Course() {
    }

    //Getters and setters

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
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
