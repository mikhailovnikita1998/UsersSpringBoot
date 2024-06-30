package ru.mihaylov.spring.ProjectBoot.service;


import org.apache.catalina.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findById(int id);
    void save(User user);
    void update(int id, User user);
    void delete(int id);
}
