package org.launchcode.javawebdevtechjobspersistent.models;


import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

   @NotBlank(message="Please add a description of skills")
   private String description;

   @ManyToMany(mappedBy = "skills")
   private List<Job> jobs =new ArrayList<>();

    public Skill(@NotBlank(message = "Please add a description of skills") String description) {
        this.description = description;
        //this.jobs = jobs;
    }

    public Skill(){
    }

    public List<Job> getJobs() {
        return jobs;
    }
    public void setJobs(List<Job> jobs){
       this.jobs=jobs;

    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}

