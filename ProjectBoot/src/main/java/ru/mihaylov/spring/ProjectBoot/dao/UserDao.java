package ru.mihaylov.spring.ProjectBoot.dao;

import org.apache.catalina.User;

import java.util.List;

public interface UserDao {
    List<User> index();
    User show(int id);
    void save(User user);
    void update(int id, User user);
    void delete(int id);
}
