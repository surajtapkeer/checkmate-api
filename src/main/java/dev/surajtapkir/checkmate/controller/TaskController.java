package dev.surajtapkir.checkmate.controller;

import dev.surajtapkir.checkmate.model.Task;
import dev.surajtapkir.checkmate.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping("task")
    public Task saveTask(@RequestBody Task task) {
        taskService.saveTask(task);
        return task;
    }

    @GetMapping("tasks")
    public List<Task> getTasks() {
        return taskService.getTasks();
    }

    @PutMapping("task/{id}")
    public Task updateTask(@PathVariable Long id, @RequestBody Task task) {
        return taskService.updateTask(id, task);
    }

    @DeleteMapping("task/{id}")
    public Task deleteTask(@PathVariable long id) {
        return taskService.deleteTask(id);
    }

    @GetMapping("task/{id}")
    public Task getTaskById(@PathVariable long id) {
        return taskService.getTaskById(id);
    }

    @GetMapping("task/list/{listName}")
    public List<Task> getTasksByListName(@PathVariable String listName) {
        return taskService.getTasksByListName(listName);
    }
}
