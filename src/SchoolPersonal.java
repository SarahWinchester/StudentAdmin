public class SchoolPersonal {

    // QUITAR ATRIBUTOS NO REQUERIDOS

    private String id = "00000";
    private String name;
    private String lastName;
    private String lvl;
    private String stage = "stage";
    private String group = lvl+ " " + stage;


        //Constructor to ask values without grades  USAR SETS EN EL CONSTRUCTOR

    public SchoolPersonal(String id, String name, String lastName, String group) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.group = group;
    }

    public SchoolPersonal(String id, String name, String lastName, String lvl, String stage) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.lvl = lvl;
        this.stage = stage;

    }

    public SchoolPersonal() {
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
    public String getGroup() {
        return group;
    }
    public void setGroup(String group) {
        this.group = group;
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
}

