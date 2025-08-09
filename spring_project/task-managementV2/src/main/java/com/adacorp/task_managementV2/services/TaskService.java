package com.adacorp.task_managementV2.services;

import com.adacorp.task_managementV2.model.State;
import com.adacorp.task_managementV2.model.Task;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface TaskService {
    void save(Task task) ;

    void update (Task task);

    //la surcharge de méthode(Overloading : meme type de retour, meme nom mais arguments differents)
    void delete(Long id);

    //la surcharge de méthode(Overloading)
    void delete(Task task);

    Optional<Task> findByCode (String code);
    Optional<Task> findOne (Long id);

    List<Task> findAll();
//---------------------------------------------------------
    long count();

    int countByState_Code (String code);

    int countAllByState_Code(String code);

    long countByState(State state);

    //---------------------------------------------------------
    List<Task> findALlByState_Code(String code) ;

    List<Task> findAllByStateIdAndDateCreationBetweenNativeQuery( String dateDebut, String dateFin, Long state_id) ;

    List<Task> findAllByDateCreationBetweenJoinUtilisateurTaskNativeQuery( String dateDebut, String dateFin,  Long utilisateur_id) ;

    List<Task> findAllByStateIdAndDateCreationBetweenJoinUtilisateurTaskNativeQuery( String dateDebut, String dateFin,  Long state_id, Long utilisateur_id) ;


    List<Task> findAllByDateCreationBetweenQuery(Date dateDebut, Date dateFin) ;

    List<Task> findAllByDateCreationBetween (Date dateDebut, Date dateFin ) ;

    Optional<Task> findByName(String Name);
}
