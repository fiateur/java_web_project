package com.adacorp.task_managementV2.services.impl;

import com.adacorp.task_managementV2.model.Role;
import com.adacorp.task_managementV2.repository.RoleRepository;
import com.adacorp.task_managementV2.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleServiceImpl implements RoleService {


    //dependency injection by variables
    @Autowired //injection de dependence par variable car un bin
    private final RoleRepository roleRepository ;

    //dependency injection by constructor
    @Autowired
    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public void save(Role role) {
        this.roleRepository.save(role) ;
    }

    @Override
    public void update(Role role) {
        this.roleRepository.save(role);
    }

    @Override
    public void delete(Long id) {
        this.roleRepository.deleteById(id);
    }

    @Override
    public void delete(Role role) {
        this.roleRepository.delete(role);
    }

    @Override
    public Optional<Role> findByCode(String code) {
        return this.roleRepository.findByCode(code) ;
    }

    @Override
    public Optional<Role> findOne(Long id) {
        return this.roleRepository.findById(id);
    }

    @Override
    public List<Role> findAll() {
        return this.roleRepository.findAll();
    }
}
