package com.adacorp.task_managementV2.services;

import com.adacorp.task_managementV2.model.Utilisateur;

import java.util.List;
import java.util.Optional;

public interface UtilisateurService {
    void save(Utilisateur utilisateur) ;

    void update (Utilisateur utilisateur);

    //la surcharge de méthode(Overloading : meme type de retour, meme nom mais arguments differents)
    void delete(Long id);

    //la surcharge de méthode(Overloading)
    void delete(Utilisateur utilisateur);

    Optional<Utilisateur> findOneByFirstName (String firstName);
    List<Utilisateur> findAllByFirstName (String firstName);
    Optional<Utilisateur> findOne (Long id);

    List<Utilisateur> findAll();

    boolean existsByEmail(String email);
    Optional<Utilisateur> findByEmail(String email);
}
