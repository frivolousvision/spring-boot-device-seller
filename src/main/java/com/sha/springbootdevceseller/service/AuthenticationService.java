package com.sha.springbootdevceseller.service;

import com.sha.springbootdevceseller.model.User;

public interface AuthenticationService {

    public User signInAndReturnJWT(User signInRequest);

}
