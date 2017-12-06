package main.java.bobko.service;

import main.java.bobko.model.User;

import java.util.List;

/**
 * @author Bobko Vladimir
 */
public interface UserService {

    User save(User user);

    User getById(Long id);

    void delete(Long id);

}
