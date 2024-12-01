package com.example.work_handler.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "job_posts")
public class WorkData {
    @Id
    private String id;

    private String title;
    private String company;
    private String description;
    private String people;

    private List<Email> dynamicFields;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people;
    }

    public List<Email> getDynamicFields() {
        return dynamicFields;
    }

    public void setDynamicFields(List<Email> dynamicFields) {
        this.dynamicFields = dynamicFields;
    }

    @Override
    public String toString() {
        return "WorkData{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", company='" + company + '\'' +
                ", description='" + description + '\'' +
                ", people='" + people + '\'' +
                ", dynamicFields=" + dynamicFields +
                '}';
    }
}
