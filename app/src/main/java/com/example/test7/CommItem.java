package com.example.test7;

public class CommItem {

    String name;
    String time;
    String comment;
    String commlike;
    String bar;
    String report;

    public CommItem(String name, String time, String comment, String commlike, String bar, String report) {
        this.name = name;
        this.time = time;
        this.comment = comment;
        this.commlike = commlike;
        this.bar = bar;
        this.report = report;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCommlike() {
        return commlike;
    }

    public void setCommlike(String commlike) {
        this.commlike = commlike;
    }

    public String getBar() {
        return bar;
    }

    public void setBar(String bar) {
        this.bar = bar;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    @Override
    public String toString() {
        return "CommItem{" +
                "name='" + name + '\'' +
                ", time='" + time + '\'' +
                ", comment='" + comment + '\'' +
                ", commlike='" + commlike + '\'' +
                ", bar='" + bar + '\'' +
                ", report='" + report + '\'' +
                '}';
    }
}
