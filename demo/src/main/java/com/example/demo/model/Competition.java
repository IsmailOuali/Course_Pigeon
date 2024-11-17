package com.example.demo.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Document
public class Competition {
    @Id
    private String id;

    private String competitionName;
    private String cordGPS;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startDate;
    private double distance;
    private List<String> pigeonRingNumbers = new ArrayList<>();
    private boolean is_finished = false;
    private Competition(String competitionName, String cordGPS, Date startDate, double distance,List<String> pigeonRingNumbers,boolean is_finished) {

        this.competitionName = competitionName;
        this.cordGPS = cordGPS;
        this.startDate = startDate;
        this.distance = distance;
        this.pigeonRingNumbers = pigeonRingNumbers;
        this.is_finished = is_finished;

    }

    public Competition() {}

    public void setId(String id) {
        this.id = id;
    }

    public void setCompetitionName(String competitionName) {
        this.competitionName = competitionName;
    }

    public void setCordGPS(String cordGPS) {
        this.cordGPS = cordGPS;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void setPigeonRingNumbers(List<String> pigeonRingNumbers) {
        this.pigeonRingNumbers = pigeonRingNumbers;
    }

    public String getId() {
        return id;
    }

    public String getCompetitionName() {
        return competitionName;
    }

    public String getCordGPS() {
        return cordGPS;
    }

    public Date getStartDate() {
        return startDate;
    }

    public double getDistance() {
        return distance;
    }

    public List<String> getPigeonRingNumbers() {
        return pigeonRingNumbers;
    }

    public boolean isIs_finished() {
        return is_finished;
    }

    public void setIs_finished(boolean is_finished) {
        this.is_finished = is_finished;
    }
}
