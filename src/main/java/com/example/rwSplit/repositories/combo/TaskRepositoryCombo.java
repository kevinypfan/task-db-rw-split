package com.example.rwSplit.repositories.combo;

import com.example.rwSplit.repositories.write.TaskWriteRepository;
import com.example.rwSplit.repositories.read.TaskReadRepository;

public interface TaskRepositoryCombo extends TaskReadRepository, TaskWriteRepository {
}
