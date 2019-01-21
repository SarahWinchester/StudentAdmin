import java.util.ArrayList;
import java.util.List;



public class StudentAdministration {

    public static void main(String[] args) {

        Student test = new Student();
        StudentAdministration test1 = new StudentAdministration();
        test1.registerStudent("50003", "luis", "cosos","3ro","Kinder");
        test1.registerStudent("50004","Sarah","Winchester","4to","Elementary");
        System.out.println(test1.getAddStudent().size());
        System.out.println(test1.getAddStudent().get(0).getId());
        System.out.println(test1.getAddStudent().get(0).getName());
        System.out.println(test1.getAddStudent().get(1).getId());
        System.out.println(test1.getAddStudent().get(1).getName());



    }

    //variable de instancia

    private List<Student> addStudent= new ArrayList();



    //*****************getters y setters

    public List<Student> getAddStudent() {
        return addStudent;
    }

    public void setAddStudent(List<Student> addStudent) {
        this.addStudent = addStudent;
    }


    //**************metodos
    public void registerStudent( String id, String name , String lastName, String lvl, String stage){

        if(Validation.validationId(id) && Validation.validationStageLvl(stage, lvl)&& Validation.validationStage(stage)){
            Student stu1 = new Student(id, name, lastName,lvl, stage);
            addStudent.add(stu1);

        }else{
            System.out.println("data is incorrect");
        }





    }





}



