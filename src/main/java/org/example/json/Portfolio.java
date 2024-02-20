package org.example.json;

import java.util.List;

public class Portfolio {
    private String company;
    private String position;
    private int years;
    private double salary;
    private float efficiencyScore;
    private List<String> responsibilities;

    public Portfolio(String company, String position, int years, double salary, float efficiencyScore, List<String> responsibilities) {
        this.company = company;
        this.position = position;
        this.years = years;
        this.salary = salary;
        this.efficiencyScore = efficiencyScore;
        this.responsibilities = responsibilities;
    }

    public Portfolio() {
    }

    public String getCompany() {
        return company;
    }

    public String getPosition() {
        return position;
    }

    public int getYears() {
        return years;
    }

    public double getSalary() {
        return salary;
    }

    public float getEfficiencyScore() {
        return efficiencyScore;
    }

    public List<String> getResponsibilities() {
        return responsibilities;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setEfficiencyScore(float efficiencyScore) {
        this.efficiencyScore = efficiencyScore;
    }

    public void setResponsibilities(List<String> responsibilities) {
        this.responsibilities = responsibilities;
    }
}
