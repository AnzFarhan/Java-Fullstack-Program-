package com.example.demo.responsitory;

import com.example.demo.model.ToDoListModel;
import com.example.demo.model.ToDoListModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoListRepository extends JpaRepository<ToDoListModel,Long> {
}
