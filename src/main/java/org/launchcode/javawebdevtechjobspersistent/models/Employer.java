package org.launchcode.javawebdevtechjobspersistent.models;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;


@Entity

public class Employer extends AbstractEntity {
    @NotBlank(message = "Location is required")
private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return location;
    }

@OneToMany
@JoinColumn(name = "employer_id")
    private List<Job> jobs = new ArrayList<>();

}


