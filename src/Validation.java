public class Validation {


    public static boolean validationId(String id){


        if (!(id == null || id.isEmpty()) && ( id.substring(0,1)== "5" &&  id.length() == 5)){
            return true;
        }

        return false;
    }

    public static boolean validationStageLvl(String lvl, String stage){

        switch (Stages.valueOf(stage.toUpperCase())) {
            case KINDER:
                if(lvl == )


            case ELEMENTARY:


            case JRHIGHSCHOOL:
                return true;


            default:

                return false;

        }

        return false;
    }
    public static boolean validationStage(String stage){

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
