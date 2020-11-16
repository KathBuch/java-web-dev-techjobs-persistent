package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @ManyToMany(mappedBy = "skills")
    private List<Job> jobs = new ArrayList<>();

    @NotBlank
    @Size(min = 3, max = 50, message = "Must be between 3 and 50 characters")
    private String description;

    public Skill(){
    }

    public Skill(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Job> getJobs(){
        return jobs;
    }

    public void setJobs(List<Job> jobs){
        this.jobs = jobs;
    }


    @Override
    public String toString() {
        return description;
    }


}