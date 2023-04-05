package org.vmorg.exception;

public class UserNotEntitledException extends Exception{

    public UserNotEntitledException() {
        super("User Not Entitled To Request Machine creation");
    }
}
