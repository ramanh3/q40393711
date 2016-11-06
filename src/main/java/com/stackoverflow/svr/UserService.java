package com.stackoverflow.svr;

import org.springframework.stereotype.Service;

/**
 * Created by ramanh3 on 11/3/2016.
 */
@Service
public class UserService {
    public String excute(String id, String pw) {
        return Boolean.toString(id.equalsIgnoreCase(pw));
    }
}
