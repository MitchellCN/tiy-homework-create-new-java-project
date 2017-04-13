package com.springboot2;

/**
 * Created by cmitchell on 4/12/17.
 */
public class Octonaught {

    private Integer personid;
    private String title;
    private String firstname;
    private String middlename;
    private String lastname;
    private String suffix;

    public Octonaught() {
    }

    public Octonaught(String title, String firstname, String middlename, String lastname, String suffix){
         this.title = title;
         this.firstname = firstname;
         this.middlename = middlename;
         this.lastname = lastname;
         this.suffix = suffix;
        }

    public Integer getPersonid() {
        return personid;
    }

    public void setPersonid(Integer personid) {
        this.personid = personid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
