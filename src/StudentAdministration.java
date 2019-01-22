import java.util.ArrayList;
import java.util.List;



public class StudentAdministration {

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

        /*StudentAdministration printed = new StudentAdministration();
        printed.printStudent();*/




    }

    //variable de instancia

    private static List<Student> addStudent= new ArrayList();



    //*****************getters y setters

    public static List<Student> getAddStudent() {
        return addStudent;
    }

    public static void setAddStudent(List<Student> addStudent) {
        addStudent = addStudent;
    }


    //**************metodos
    public void registerStudent( String id, String name , String lastName, String lvl, String stage){

        if(Validation.validationId(id) && Validation.validationStageLvl(stage, lvl)&& Validation.validationStage(stage)){
            Student stu1 = new Student(id, name, lastName,lvl, stage);
            addStudent.add(stu1);
            System.out.println("Data added correctly");

        }else{
            System.out.println("data is incorrect, Try again");
        }



    }

    public void printStudent(){
        //****************PRINTED STUDENTS
        StudentAdministration printStud = new StudentAdministration();

        System.out.println("Students in database: " + printStud.getAddStudent().size());


        for (int i =0 ; i < printStud.getAddStudent().size(); i++){
            System.out.println("\n********************************************");
            System.out.println("\nSTUDENT DATA");


            System.out.println("\nID: " + printStud.getAddStudent().get(i).getId());
            System.out.println("NAME: " + printStud.getAddStudent().get(i).getName());
            System.out.println("LASTNAME: " + printStud.getAddStudent().get(i).getLastName());
            System.out.println("LVL: " + printStud.getAddStudent().get(i).getLvl());
            System.out.println("STAGE: " + printStud.getAddStudent().get(i).getStage());


        }
    }





}



