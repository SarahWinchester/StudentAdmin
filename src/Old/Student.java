package Old;

import java.util.ArrayList;
import java.util.List;

public class Student {


    private String id = "00000";
    private String name;
    private String lastName;
    private String lvl;
    private String stage = "stage";
    private List courses;


    //Constructor to ask values without grades


    public Student(String id, String name, String lastName, String lvl, String stage) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.lvl = lvl;
        this.stage = stage;
    }

    //constructor with  course
    public Student(String id, String name, String lastName, String lvl, String stage, List<Course> courses) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.lvl = lvl;
        this.stage = stage;
        this.courses=courses;


    }

    public Student() {
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
