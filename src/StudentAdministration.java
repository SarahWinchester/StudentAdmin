import java.util.ArrayList;
import java.util.List;



public class StudentAdministration {

    //variable de instancia

    private static List<Student> studentList = new ArrayList();
    private static List<Course> courselist = new ArrayList<>();



    //*****************getters y setters


    public static List<Course> getCourselist() {
        return courselist;
    }

    public static void setCourselist(List<Course> courselist) {
        StudentAdministration.courselist = courselist;
    }

    public static List<Student> getStudentList() {
        return studentList;
    }

    public static void setStudentList(List<Student> studentList) {
        studentList = studentList;
    }


    //**************metodo alta estudiante
    public void registerStudent( String id, String name , String lastName, String lvl, String stage){

        if(Validation.validationId(id) && Validation.validationStageLvl(stage, lvl)&& Validation.validationStage(stage)){

            Student stu1 = new Student(id, name, lastName,lvl, stage);
            studentList.add(stu1);
            System.out.println("Data added correctly");

        }else{
            System.out.println("data is incorrect, Try again");
        }
    }

    //*********+**metodo sobrecargado de alta estudiante

    public  void registerStudent(String id, String name , String lastName, String lvl, String stage, List <Course> courseName){

        if(Validation.validationId(id) && Validation.validationStageLvl(stage, lvl)&& Validation.validationStage(stage)){

            Student overStud = new Student(id, name, lastName,lvl, stage, courseName);

            studentList.add(overStud);

            System.out.println("Data added correctly");

        }else{
            System.out.println("data is incorrect, Try again");
        }

    }

    public void printStudent(){
        //****************PRINTED STUDENTS

        System.out.println("Students in database: " + studentList.size());


        for (int i = 0; i < studentList.size(); i++){
            System.out.println("\n********************************************");
            System.out.println("\nSTUDENT DATA");


            System.out.println("\nID: " + studentList.get(i).getId());
            System.out.println("NAME: " + studentList.get(i).getName());
            System.out.println("LASTNAME: " + studentList.get(i).getLastName());
            System.out.println("LVL: " + studentList.get(i).getLvl());









        }
    }
    public void printStudentWCourse( ){
        // PRINT STUDENT WITH COURSE

        for (int j = 0 ; j < courses.size(); j++){
            System.out.println( "odcn" + studentL.get(j) + courses.get(j));
        }
    }



    public static void main(String[] args) {

        //***********HARDCODED STUDENTS

        StudentAdministration test1 = new StudentAdministration();

        test1.registerStudent("50003", "luis", "cosos","3ro","Kinder");
        test1.registerStudent("50004","Sarah","Winchester","4to","Elementary");
        test1.registerStudent("50005","Indira","Ruiz","3ro","JrHighschool");
        test1.registerStudent("50002","Ahri","Foxtail","2do","Kinder");
        test1.registerStudent("50001","Sona","Pentakill","6to","Elementary");
        test1.registerStudent("50006","Caithleen","Mayfair","1ro","Elementary");
        test1.registerStudent("50007","Jhin","Opera","2do","Elementary");
        test1.registerStudent("50008","Yasuo","Winter","2do","JrHighschool");
        test1.registerStudent("50009","Camille","Strinds","1ro","JrHighschool");

        //TO PRINT

        StudentAdministration printed = new StudentAdministration();
        printed.printStudent();



        //HARDCODED COURSES
        Course course1 = new Course("Math",0);
        Course course2 = new Course("Spanish",1);
        Course course3 = new Course("Programming",2);

        List<Course> courses = new ArrayList<Course>();

        courses.add(course1);
        courses.add(course2);
        courses.add(course3);

        test1.registerStudent("50010","Ivan","Zornoza","3ro","Kinder",courses);

        printed.printStudentWCourse(List <Student> test1, courses);





    }

}



