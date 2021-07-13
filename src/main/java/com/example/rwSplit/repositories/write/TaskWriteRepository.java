package com.example.rwSplit.repositories.write;

import com.example.rwSplit.entities.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskWriteRepository extends CrudRepository<Task, Long> {
}
