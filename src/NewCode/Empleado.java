package NewCode;

public class Empleado {
    private String nombre;
    private int id;
    private String puesto = "puesto";
    private String grupo ;


    public Empleado(String nombre, int id, String puesto, String grupo) {
        this.nombre = nombre;
        this.id = id;
        this.puesto = puesto;
        this.grupo = grupo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id < 10000 || id > 19999){
            this.id = id;
        }else {
            this.id = 0;
        }

    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        switch (puesto.toLowerCase()){
            case "Maestro":

            case "Director":

            case "Administrativo":
                this.puesto = puesto.toLowerCase();
                break;
            default:
                this.puesto = "puesto";
                break;

        }
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        switch ( grupo.toLowerCase()){
            case "1rokinder":
            case "2dokinder":
            case "3rokinder":
            case "1rosecundaria":
            case "2dosecundaria":
            case "3rosecundaria":
            case "1roprimaria":
            case "2doprimaria":
            case "3roprimaria":
            case "4toprimaria":
            case "5toprimaria":
            case "6toprimaria":
                this.grupo = grupo.toLowerCase();
                break;
            default:
                this.grupo = "grupo";

        }


    }
}
