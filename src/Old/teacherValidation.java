package Old;

import Old.Stages;
import Old.Student;

public class teacherValidation {


    public static boolean validationPersonalId(String id){

        if (!(id == null || id.isEmpty()) && ( "1".equalsIgnoreCase(id.substring(0,1))&&  id.length() == 5 )){

            for (Student student : StudentAdministration.getStudentList()) {

                if(student.getId().equals(id)){

                    System.out.println("The Id" + id +" already exist, please, check again,. The students was not added into the list" );

                    return false;
                };

            }
            return true;
        }
        return false;
    }

    public static boolean validationPersonalStageLvl(String stage , String lvl){

        switch (Stages.valueOf(stage.toUpperCase())) {
            case KINDER:
                if(lvl == "1ro" || lvl == "2do" || lvl == "3ro"){
                    return true;
                }else{
                    System.out.println("select a valid lvl to kinder");
                }
                return false;

                case ELEMENTARY:
                    if(lvl=="1ro" ||lvl == "2do" || lvl == "3ro" || lvl == "4to" || lvl =="5to" || lvl == "6to"){
                        return true;
                    }else{
                        System.out.println("Select a valid level to elementary");
                    }
                    return  false;

                case JRHIGHSCHOOL:

                    if(lvl == "1ro"|| lvl == "2do" || lvl == "3ro"){
                        return true;
                    }else {
                        System.out.println("Select a valid level to Jr Highschool");
                    }
                    return false;



                default:

                    return false;

            }


        }

        public static boolean validationPersonalStage(String stage){

            if(stage == null || stage.isEmpty()){
                return false;
            }
            switch (Stages.valueOf(stage.toUpperCase())) {
                case KINDER:



                case ELEMENTARY:


                case JRHIGHSCHOOL:
                    return true;


                default:

                    return false;

            }

        }




}
