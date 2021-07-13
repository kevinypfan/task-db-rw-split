package com.example.rwSplit.repositories;

import com.example.rwSplit.entities.Task;
import com.example.rwSplit.repositories.combo.TaskRepositoryCombo;
import com.example.rwSplit.repositories.write.TaskWriteRepository;
import com.example.rwSplit.repositories.read.TaskReadRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class TaskRepository implements TaskRepositoryCombo {

    private final TaskReadRepository readRepository;
    private final TaskWriteRepository writeRepository;

    public TaskRepository(TaskReadRepository taskReadRepository, TaskWriteRepository taskWriteRepository) {
        this.readRepository = taskReadRepository;
        this.writeRepository = taskWriteRepository;
    }

    @Override
    public <S extends Task> S save(S entity) {
        return writeRepository.save(entity);
    }

    @Override
    public <S extends Task> Iterable<S> saveAll(Iterable<S> entities) {
        return writeRepository.saveAll(entities);
    }

    @Override
    public Optional<Task> findById(Long aLong) {
        return readRepository.findById(aLong);
    }

    @Override
    public boolean existsById(Long aLong) {
        return readRepository.existsById(aLong);
    }

    @Override
    public List<Task> findAll() {
        return readRepository.findAll();
    }

    @Override
    public Iterable<Task> findAllById(Iterable<Long> longs) {
        return readRepository.findAllById(longs);
    }

    @Override
    public long count() {
        return readRepository.count();
    }

    @Override
    public void deleteById(Long aLong) {
        writeRepository.deleteById(aLong);
    }

    @Override
    public void delete(Task entity) {
        writeRepository.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {
        writeRepository.deleteAllById(longs);
    }

    @Override
    public void deleteAll(Iterable<? extends Task> entities) {
        writeRepository.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        writeRepository.deleteAll();
    }
}
