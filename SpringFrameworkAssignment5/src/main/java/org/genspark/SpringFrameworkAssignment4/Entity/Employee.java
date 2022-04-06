package org.genspark.SpringFrameworkAssignment4.Entity;

import javax.persistence.*;

@Entity//lets the program know that this where the information in the table will be named from
@Table(name = "Employee_Database") // this will rename the database
public class Employee {

    @Id // this lets the program know what the primary key is
    @Column(name = "employeeID") // this renames the column name
    @GeneratedValue(strategy = GenerationType.AUTO) // this will program know that the primary key will be auto-generated and stops the use of the private int as the primary ID
    private int id;
    private String name;
    private String email;

    public Employee(){

    }

    public Employee( String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
