import java.util.ArrayList;
import java.util.List;



public class SchoolPersonalAdministration {

    //variable de instancia

    private List<SchoolPersonal> teacherList = new ArrayList();



    //*****************getters y setters


    public List<SchoolPersonal> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<SchoolPersonal> teacherList) {
        this.teacherList = teacherList;
    }



    //**************metodo alta Maestro

    public void registerSchoolPersonal( String id, String name , String lastName, String lvl, String stage){

        if(teacherValidation.validationPersonalId(id) && teacherValidation.validationPersonalStageLvl(stage, lvl) && teacherValidation.validationPersonalStage(stage)){

            SchoolPersonal teacher = new SchoolPersonal (id, name, lastName,lvl, stage);

            teacherList.add(teacher);

            System.out.println(teacherList.size());
            System.out.println("Data added correctly");

        }else{
            System.out.println("data is incorrect, Try again");
        }
    }

    //*********+**metodo sobrecargado


    public void printTeacher(){
        //****************PRINTED TEACHERS

        System.out.println("Personal  in database: " + teacherList.size());


        for (int i = 0; i < teacherList.size(); i++){
            System.out.println("\n********************************************");
            System.out.println("\nPERSONAL DATA");


            System.out.println("\nID: " + teacherList.get(i).getId());
            System.out.println("NAME: " + teacherList.get(i).getName());
            System.out.println("LASTNAME: " + teacherList.get(i).getLastName());
            System.out.println("GROUP: " + teacherList.get(i).getLvl() + " " + teacherList.get(i).getStage());









        }
    }





    public static void main(String[] args) {

        //***********HARDCODED STUDENTS

        SchoolPersonalAdministration teacher = new SchoolPersonalAdministration();


        teacher.registerSchoolPersonal("10002","Sivia","Kumar","6to","Elementary");
        teacher.registerSchoolPersonal("10002","Omar","Dj","3ro","JRHIGHSCHOOL");
        teacher.registerSchoolPersonal("10009","Camille","Strinds","1ro","JRHIGHSCHOOL");
        teacher.registerSchoolPersonal("10001","Anna ","Asberg","3ro","kinder");




        //TO PRINT

        teacher.printTeacher();








    }

}