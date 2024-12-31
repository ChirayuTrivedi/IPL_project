package com.wecp.progressive.entity;

public class Cricketer {
    private int cricket_id;
    private int team_id;
    private String cricket_name;
    private int age;
    private String nationality;
    private int  experience;
    private String role;
    private int total_run;
    private int total_wicket;

    public Cricketer(int cricket_id, int team_id, String cricket_name, int age, String nationality, int experience,
            String role, int total_run, int total_wicket) {
        this.cricket_id = cricket_id;
        this.team_id = team_id;
        this.cricket_name = cricket_name;
        this.age = age;
        this.nationality = nationality;
        this.experience = experience;
        this.role = role;
        this.total_run = total_run;
        this.total_wicket = total_wicket;
    }

    public Cricketer() {
    }

    public int getCricket_id() {
        return cricket_id;
    }

    public void setCricket_id(int cricket_id) {
        this.cricket_id = cricket_id;
    }

    public int getTeam_id() {
        return team_id;
    }

    public void setTeam_id(int team_id) {
        this.team_id = team_id;
    }

    public String getCricket_name() {
        return cricket_name;
    }

    public void setCricket_name(String cricket_name) {
        this.cricket_name = cricket_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getTotal_run() {
        return total_run;
    }

    public void setTotal_run(int total_run) {
        this.total_run = total_run;
    }

    public int getTotal_wicket() {
        return total_wicket;
    }

    public void setTotal_wicket(int total_wicket) {
        this.total_wicket = total_wicket;
    }

    

    
}