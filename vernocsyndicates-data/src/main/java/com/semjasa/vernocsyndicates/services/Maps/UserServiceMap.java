package com.semjasa.vernocsyndicates.services.Maps;

import com.semjasa.vernocsyndicates.models.User;
import com.semjasa.vernocsyndicates.services.UserService;

import java.util.Set;

public class UserServiceMap extends AbstractMapService<User, Long> implements UserService<User, Long> {
    @Override
    public Set<User> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public User save(User object) {
        return super.save(object);
    }

    @Override
    public void delete(User object) {
        super.delete(object);
    }

    @Override
    public User findById(Long id) {
        return super.findById(id);
    }

    @Override
    public User findByLastName(String lastName) {
        return null;
    }
}
