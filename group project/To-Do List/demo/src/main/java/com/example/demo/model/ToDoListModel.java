package com.example.demo.model;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class ToDoListModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "Id")
    private int no;

    @Column(name = "Task Name")
    private String taskName;

    @Column(name = "Task Description")
    private String taskDesc;

    @Column(name = "Status")//false mean
    private String status;

    public int getId() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDesc() {
        return taskDesc;
    }

    public void setTaskDesc(String taskDesc) {
        this.taskDesc = taskDesc;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
