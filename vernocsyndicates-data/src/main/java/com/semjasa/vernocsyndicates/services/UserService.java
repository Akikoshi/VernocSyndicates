package com.semjasa.vernocsyndicates.services;

import com.semjasa.vernocsyndicates.models.User;

import java.util.Set;

public interface UserService {

    User findByLastName(String lastName);

    User findById(Long id);

    User save(User user);

    Set<User> findAll();
}
