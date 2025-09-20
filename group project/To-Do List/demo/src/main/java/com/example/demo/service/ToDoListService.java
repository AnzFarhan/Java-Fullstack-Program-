package com.example.demo.service;

import com.example.demo.model.ToDoListModel;
import com.example.demo.responsitory.ToDoListDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ToDoListService {

    @Autowired
    private final ToDoListDAO toDoListDAO;

    public ToDoListService(ToDoListDAO toDoListDAO) {
        this.toDoListDAO = toDoListDAO;
    }

    // Allowed statuses
    private static final List<String> ALLOWED_STATUSES = Arrays.asList("pending", "completed");

//    public void updateToDoListById(int no, String status) {
//        int rowsAffected = toDoListDAO.updatedTaskStatus(no, status);
//        if (rowsAffected == 0) {
//            throw new IllegalArgumentException("No task found with id " + no + " or task is completed");
//        }
//    }

    public void updateToDoListStatus(int no, String status){
        // Validate the 'completed' value
        if (!ALLOWED_STATUSES.contains(status.toLowerCase())) {
            throw new IllegalArgumentException("Invalid status: " + status + ". Allowed values: pending, completed.");
        }

        // Call repository to update status
        int rowsAffected = toDoListDAO.updatedTaskStatus(no, status);
        if (rowsAffected == 0) {
            throw new IllegalArgumentException("Task not found or status cannot be updated.");
        }
    }
}
