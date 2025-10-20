package com.gamingroom.gameauth.auth;

import io.dropwizard.auth.Authorizer;

public class GameAuthorizer implements Authorizer<GameUser> 
{
    @Override
    public boolean authorize(GameUser user, String role) {
    	
        // FIXME: Finish the authorize method based on BasicAuth Security Example
    	if (user == null) {
            return false;
        }
        if (user.getRoles() == null) {
            return false;
        }
        return user.getRoles().contains(role);
    	
    }
}