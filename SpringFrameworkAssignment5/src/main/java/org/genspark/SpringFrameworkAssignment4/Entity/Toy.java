package org.genspark.SpringFrameworkAssignment4.Entity;

import javax.persistence.*;

@Entity
@Table(name = "Toy_Database")
public class Toy {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int toyId;
    private String name;
    private String toyLine;


    public Toy(){

    }
    public Toy(int toyId, String name, String toyLine) {
        this.toyId = toyId;
        this.name = name;
        this.toyLine = toyLine;
    }

    public int getToyId() {
        return toyId;
    }

    public void setToyId(int toyId) {
        this.toyId = toyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getToyLine() {
        return toyLine;
    }

    public void setToyLine(String toyLine) {
        this.toyLine = toyLine;
    }
}
