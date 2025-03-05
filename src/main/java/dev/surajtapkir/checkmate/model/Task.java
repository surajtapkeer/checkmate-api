package dev.surajtapkir.checkmate.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Date;

@Component
@Entity
public class Task {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private long id;
    private String name;
    private LocalDate dueDate;
    private boolean status;
    private String listName;

    public Task() {

    }

    public Task(long id, String name, LocalDate dueDate, boolean status, String listName) {
        this.id = id;
        this.name = name;
        this.dueDate = dueDate;
        this.status = status;
        this.listName = listName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dueDate=" + dueDate +
                ", status=" + status +
                ", listName='" + listName + '\'' +
                '}';
    }
}
