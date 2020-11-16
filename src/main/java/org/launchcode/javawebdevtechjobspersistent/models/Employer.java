package org.launchcode.javawebdevtechjobspersistent.models;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;


@Entity

public class Employer extends AbstractEntity {

    @NotBlank(message = "Location is required")
    @Size(min = 3, max=100)
    private String location;

    @OneToMany
    @JoinColumn
    private List<Job> jobs = new ArrayList<>();

    public Employer(){
    }

    public Employer(String location){
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}


