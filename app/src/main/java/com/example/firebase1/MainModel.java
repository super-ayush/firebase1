package com.example.firebase1;

public class MainModel {
    String name, profile, n_team, p_team, p_score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getN_team() {
        return n_team;
    }

    public void setN_team(String n_team) {
        this.n_team = n_team;
    }

    public String getP_team() {
        return p_team;
    }

    public void setP_team(String p_team) {
        this.p_team = p_team;
    }

    public String getP_score() {
        return p_score;
    }

    public void setP_score(String p_score) {
        this.p_score = p_score;
    }

    public MainModel(String name, String profile, String n_team, String p_team, String p_score) {
        this.name = name;
        this.profile = profile;
        this.n_team = n_team;
        this.p_team = p_team;
        this.p_score = p_score;
    }

    public MainModel() {
    }
}
