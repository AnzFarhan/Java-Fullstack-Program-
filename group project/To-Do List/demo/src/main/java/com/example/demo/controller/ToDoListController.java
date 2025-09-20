package com.example.demo.controller;

import com.example.demo.model.ToDoListModel;
import com.example.demo.responsitory.ToDoListDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/todo")
public class ToDoListController {

    @Autowired
    private final ToDoListDAO dao;

    public ToDoListController(ToDoListDAO dao) {
        this.dao = dao;
    }

    //update status based on id
    @PutMapping("/{no}/updated-status")
    public ResponseEntity<ToDoListModel> updateStatus(@PathVariable int no, @RequestParam String status){
        try {
            ToDoListModel updatedTask = dao.updatedTodoListStatus(no, status);
            return ResponseEntity.ok(updatedTask);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }
}
