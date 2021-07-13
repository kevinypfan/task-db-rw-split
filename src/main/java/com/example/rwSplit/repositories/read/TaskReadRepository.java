package com.example.rwSplit.repositories.read;

import com.example.rwSplit.entities.Task;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TaskReadRepository extends CrudRepository<Task, Long> {
    List<Task> findAll();
}
