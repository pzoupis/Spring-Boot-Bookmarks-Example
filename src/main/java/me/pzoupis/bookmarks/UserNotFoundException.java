package me.pzoupis.bookmarks;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
class UserNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

	public UserNotFoundException(String userId) {
        super("could not find user '" + userId +"'");
    }
}