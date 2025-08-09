package com.adacorp.task_managementV2.services;

import com.adacorp.task_managementV2.model.*;

import java.util.List;
import java.util.Optional;

public interface HabilitationRoleService {
    void save(HabilitationRole habilitationRole) ;

    void update (HabilitationRole habilitationRole);

    //la surcharge de méthode(Overloading : meme type de retour, meme nom mais arguments differents)
    void delete(Long id);

    //la surcharge de méthode(Overloading)
    void delete(HabilitationRole habilitationRole);

    List<HabilitationRole> findByRole (Role role);
    Optional<HabilitationRole> findOne (HabilitationRole habilitationRole);

    List<HabilitationRole> findHabilitation (Habilitation Habilitation);
    List<HabilitationRole> findAll();
}
