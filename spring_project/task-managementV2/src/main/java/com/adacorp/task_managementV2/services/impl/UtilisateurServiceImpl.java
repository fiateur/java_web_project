package com.adacorp.task_managementV2.services.impl;

import com.adacorp.task_managementV2.model.Utilisateur;
import com.adacorp.task_managementV2.repository.UtilisateurRepository;
import com.adacorp.task_managementV2.services.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UtilisateurServiceImpl implements UtilisateurService {

    @Autowired
    private UtilisateurRepository utilisateurRepository;

    public UtilisateurServiceImpl(UtilisateurRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
    }


    @Override
    public boolean existsByEmail(String email) {
        return this.utilisateurRepository.existsByEmail(email);
    }

    @Override
    public Optional<Utilisateur> findByEmail(String email) {
        return this.utilisateurRepository.findByEmail(email);
    }

    @Override
    public void save(Utilisateur utilisateur) {
        this.utilisateurRepository.save(utilisateur);
    }

    @Override
    public void update(Utilisateur utilisateur) {
        this.utilisateurRepository.save(utilisateur);
    }

    @Override
    public void delete(Long id) {
        this.utilisateurRepository.deleteById(id);
    }

    @Override
    public void delete(Utilisateur utilisateur) {
        this.utilisateurRepository.delete(utilisateur);
    }

    @Override
    public Optional<Utilisateur> findOneByFirstName(String firstName) {
        return this.utilisateurRepository.findOneByFirstNameLikeNativeQuery(firstName);
    }

    @Override
    public Optional<Utilisateur> findOne(Long id) {
        return this.utilisateurRepository.findById(id);
    }

    @Override
    public List<Utilisateur> findAll() {
        return this.utilisateurRepository.findAll();
    }
    @Override
    public List<Utilisateur> findAllByFirstName(String firstName) {
        return this.utilisateurRepository.findAllByFirstNameLikeNativeQuery(firstName);
    }

}