package com.example.demo.responsitory;

import com.example.demo.model.ToDoListModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ToDoListDAO {

    @Autowired
    private final JdbcTemplate jdbcTemplate;

    public ToDoListDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<ToDoListModel> findAll() {
        String sql = "SELECT * FROM ToDoList";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            ToDoListModel toDoListModel = new ToDoListModel();
            toDoListModel.setTaskName(rs.getString(1));
            toDoListModel.setTaskDesc(rs.getString(2));
            toDoListModel.setStatus(rs.getString(3));
            return toDoListModel;
        });
    }

    /*Updated the SQL query to set the
    status field to a String value
    like 'Completed' or 'Pending'. */
    //kat database status kene default kan status = pending

    /*CREATE TABLE ToDoList (
            no INT AUTO_INCREMENT PRIMARY KEY,
            task_name VARCHAR(255) NOT NULL,
    task_desc VARCHAR(500),
    status VARCHAR(50) NOT NULL DEFAULT 'Pending'
);
    INSERT INTO ToDoList (task_name, task_desc, status)
    VALUES ('Java', 'Java Programming', 'Pending'); */

//    public int updateStatusById(int no, String status){
//        String sql = "UPDATE ToDoList SET status = 'Completed' WHERE id = ? AND status = 'Pending'";
////        return String.valueOf(jdbcTemplate.update(sql, status, id));
//        return jdbcTemplate.update(sql, no);
//    }

    /*Updated the SQL query to set the
    status field to a String value
    like 'Completed' or 'Pending'. */
    public ToDoListModel updatedTodoListStatus(int no, String status){
        //perform the updated
        String sql = "UPDATE ToDoList SET status = ? WHERE no = ?";
        int rowsAffected = jdbcTemplate.update(sql, status, no);

        // Check if any row was updated
        if (rowsAffected == 0) {
            throw new IllegalArgumentException("Task not found or update failed for no: " + no);
        }

        // Retrieve and return the updated To-Do List
        String selectSql = "SELECT * FROM ToDoList WHERE no = ?";
        return jdbcTemplate.queryForObject(selectSql, new Object[]{no}, (rs, rowNum) -> {
            ToDoListModel updatedToDoList = new ToDoListModel();
            updatedToDoList.setNo(rs.getInt("no"));
            updatedToDoList.setTaskName(rs.getString("task_name"));
            updatedToDoList.setTaskDesc(rs.getString("task_desc"));
            updatedToDoList.setStatus(rs.getString("status"));
            return updatedToDoList;
        });
    }

    // Retrieve task by ID (optional, for validation or additional logic)
    public ToDoListModel findToDoListById(int no) {
        String sql = "SELECT * FROM ToDoList WHERE no = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(ToDoListModel.class), no);
    }
}
