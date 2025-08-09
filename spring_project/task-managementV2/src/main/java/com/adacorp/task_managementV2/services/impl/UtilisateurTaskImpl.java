package com.adacorp.task_managementV2.services.impl;

import com.adacorp.task_managementV2.model.Task;
import com.adacorp.task_managementV2.model.Utilisateur;
import com.adacorp.task_managementV2.model.UtilisateurTask;
import com.adacorp.task_managementV2.repository.UtilisateurTaskRepository;
import com.adacorp.task_managementV2.services.UtilisateurTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UtilisateurTaskImpl implements UtilisateurTaskService {
    @Autowired
    private final UtilisateurTaskRepository utilisateurTaskRepository ;

    public UtilisateurTaskImpl(UtilisateurTaskRepository utilisateurTaskRepository) {
        this.utilisateurTaskRepository = utilisateurTaskRepository;
    }

    @Override
    public void save(UtilisateurTask utilisateurTask) {
        this.utilisateurTaskRepository.save(utilisateurTask);
    }

    @Override
    public void update(UtilisateurTask utilisateurTask) {
        this.utilisateurTaskRepository.save(utilisateurTask);
    }

    @Override
    public void delete(Long id) {
        this.utilisateurTaskRepository.deleteById(id);
    }

    @Override
    public void delete(UtilisateurTask utilisateurTask) {
        this.utilisateurTaskRepository.delete(utilisateurTask);
    }

    @Override
    public Optional<UtilisateurTask> findByTask(Task task) {
        return this.utilisateurTaskRepository.findByTask(task);
    }

    @Override
    public List<UtilisateurTask> findAllByUtilisateur(Utilisateur utilisateur) {
        return this.utilisateurTaskRepository.findAllByUtilisateur(utilisateur);
    }

    @Override
    public List<UtilisateurTask> findAllByUtilisateur_Id(Long id) {
        return this.utilisateurTaskRepository.findAllByUtilisateur_Id(id);
    }

    @Override
    public List<UtilisateurTask> findAllByUtilisateurOrderByTaskIdDesc(Utilisateur utilisateur) {
        return this.utilisateurTaskRepository.findAllByUtilisateurOrderByTaskIdDesc(utilisateur);
    }

    @Override
    public Optional<UtilisateurTask> findByTask_Id(Long id) {
        return this.utilisateurTaskRepository.findByTask_Id(id);
    }
}
