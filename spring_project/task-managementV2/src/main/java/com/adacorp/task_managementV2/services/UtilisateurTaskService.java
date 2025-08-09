package com.adacorp.task_managementV2.services;

import com.adacorp.task_managementV2.model.Task;
import com.adacorp.task_managementV2.model.Utilisateur;
import com.adacorp.task_managementV2.model.UtilisateurTask;

import java.util.List;
import java.util.Optional;

public interface UtilisateurTaskService {
    void save(UtilisateurTask utilisateurTask) ;

    void update (UtilisateurTask utilisateurTask);

    //la surcharge de méthode(Overloading : meme type de retour, meme nom mais arguments differents)
    void delete(Long id);

    //la surcharge de méthode(Overloading)
    void delete(UtilisateurTask utilisateurTask);

    Optional<UtilisateurTask> findByTask_Id(Long id) ;
    Optional<UtilisateurTask> findByTask (Task task);

    List<UtilisateurTask> findAllByUtilisateur(Utilisateur utilisateur) ;
    List<UtilisateurTask> findAllByUtilisateur_Id(Long id) ;
    List<UtilisateurTask> findAllByUtilisateurOrderByTaskIdDesc (Utilisateur utilisateur) ;
}
