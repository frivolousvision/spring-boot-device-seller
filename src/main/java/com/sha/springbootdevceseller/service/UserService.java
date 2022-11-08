package com.sha.springbootdevceseller.service;

import java.util.Optional;

import com.sha.springbootdevceseller.model.Role;
import com.sha.springbootdevceseller.model.User;

public interface UserService {
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    void changeRole(Role newRole, String username);
}
