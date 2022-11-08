package com.sha.springbootdevceseller.security.jwt;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.Authentication;

import com.sha.springbootdevceseller.security.UserPrincipal;

public interface JwtProvider {
    public Authentication getAuthentication(HttpServletRequest request);

    public boolean isTokenValid(HttpServletRequest request);

    public String generateToken(UserPrincipal auth);

}
