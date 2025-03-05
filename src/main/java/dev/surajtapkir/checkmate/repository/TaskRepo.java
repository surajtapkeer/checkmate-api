package dev.surajtapkir.checkmate.repository;

import dev.surajtapkir.checkmate.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepo extends JpaRepository<Task, Long> {

    @Query("from Task where listName = :listName")
    List<Task> getTasksByListName(@Param("listName") String listName);

}
