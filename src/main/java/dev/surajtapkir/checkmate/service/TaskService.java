package dev.surajtapkir.checkmate.service;

import dev.surajtapkir.checkmate.model.Task;
import dev.surajtapkir.checkmate.repository.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepo taskRepo;

    public void saveTask(Task task) {
        taskRepo.save(task);
    }

    public List<Task> getTasks() {
        return taskRepo.findAll();
    }

    public Task updateTask(long id, Task task) {
        Optional<Task> existingTaskOptional = taskRepo.findById(id);
        if(existingTaskOptional.isPresent()) {
            Task existingTask = existingTaskOptional.get();

            existingTask.setName(task.getName());
            existingTask.setDueDate(task.getDueDate());
            existingTask.setStatus(task.isStatus());
            existingTask.setListName(task.getListName());

            return taskRepo.save(existingTask);
        } else {
            throw new RuntimeException("Task with id %d not found, Can't update!".formatted(id));
        }
    }

    public Task deleteTask(long id) {
        Optional<Task> deletedTaskOptional = taskRepo.findById(id);
        if(deletedTaskOptional.isPresent()) {
            Task deletedTask = deletedTaskOptional.get();
            taskRepo.deleteById(id);
            return deletedTask;
        } else {
            throw new RuntimeException("Task with id %d not found, Can't delete!".formatted(id));
        }
    }

    public Task getTaskById(long id) {
        Optional<Task> taskOptional = taskRepo.findById(id);
        if(taskOptional.isPresent()) {
            return taskOptional.get();
        } else {
            throw new RuntimeException("Task with id %d not found, Can't get task!".formatted(id));
        }
    }

    public List<Task> getTasksByListName(String listName) {
        List<Task> tasks = taskRepo.getTasksByListName(listName);

        if(tasks.isEmpty()) {
            throw new RuntimeException("No task found of type %s.".formatted(listName));
        }

        return tasks;
    }

}
