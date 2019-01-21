public class SchoolPersonal {

    private int teacherId = 0;
    private String name;
    private String lastName;
    private String jobPosition = "Job Position";
    private String group;

    public SchoolPersonal(int teacherId, String name, String lastName, String jobPosition, String group) {
        this.teacherId = teacherId;
        this.name = name;
        this.lastName = lastName;
        this.jobPosition = jobPosition;
        this.group = group;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
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

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
