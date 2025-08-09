package com.adacorp.task_managementV2.services.impl;

import com.adacorp.task_managementV2.model.State;
import com.adacorp.task_managementV2.model.Task;
import com.adacorp.task_managementV2.repository.TaskRepository;
import com.adacorp.task_managementV2.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    private TaskRepository taskRepository ;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public void save(Task task) {
        this.taskRepository.save(task) ;
    }

    @Override
    public void update(Task task) {
        this.taskRepository.save(task) ;
    }

    @Override
    public void delete(Long id) {
        this.taskRepository.deleteById(id);
    }

    @Override
    public void delete(Task task) {
        this.taskRepository.delete(task);
    }

    @Override
    public Optional<Task> findByCode(String code) {
        return Optional.empty();
    }

    @Override
    public Optional<Task> findOne(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Task> findAll() {
        return List.of();
    }

    @Override
    public long count() {
        return this.taskRepository.count();
    }

    @Override
    public int countByState_Code(String code) {
        return this.taskRepository.countByState_Code(code);
    }

    @Override
    public int countAllByState_Code(String code) {
        return this.taskRepository.countAllByState_Code(code);
    }

    @Override
    public long countByState(State state) {
        return this.taskRepository.countByState(state);
    }

    @Override
    public List<Task> findALlByState_Code(String code) {
        return this.taskRepository.findALlByState_Code(code);
    }

    @Override
    public List<Task> findAllByStateIdAndDateCreationBetweenNativeQuery(String dateDebut, String dateFin, Long state_id) {
        return this.taskRepository.findAllByStateIdAndDateCreationBetweenNativeQuery(dateDebut, dateFin, state_id);
    }

    @Override
    public List<Task> findAllByDateCreationBetweenJoinUtilisateurTaskNativeQuery(String dateDebut, String dateFin, Long utilisateur_id) {
        return this.taskRepository.findAllByDateCreationBetweenJoinUtilisateurTaskNativeQuery(dateDebut, dateFin, utilisateur_id);
    }

    @Override
    public List<Task> findAllByStateIdAndDateCreationBetweenJoinUtilisateurTaskNativeQuery(String dateDebut, String dateFin, Long state_id, Long utilisateur_id) {
        return  this.taskRepository.findAllByStateIdAndDateCreationBetweenJoinUtilisateurTaskNativeQuery(dateDebut, dateFin, state_id, utilisateur_id);
    }

    @Override
    public List<Task> findAllByDateCreationBetweenQuery(Date dateDebut, Date dateFin) {
        return this.taskRepository.findAllByDateCreationBetweenQuery(dateDebut, dateFin);
    }

    @Override
    public List<Task> findAllByDateCreationBetween(Date dateDebut, Date dateFin) {
        return findAllByDateCreationBetween(dateDebut, dateFin);
    }
    @Override
    public Optional<Task> findByName(String Name) {
        return this.taskRepository.findByName(Name);
    }
}
