/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhan.rest.webservices.restfullwebservices.users;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author Madhankumar Selvaraj
 */
@Component
public class UsersDAO {

private static List<Users> users = new ArrayList();
private static int userCount = 3;

static {
    users.add(new Users(1, "Madhan", new Date()));
    users.add(new Users(2, "Jeeva", new Date()));
    users.add(new Users(3, "yosiys", new Date()));
}

public List<Users> finAll() {
    return users;
}

public Users saveUsers(Users user) {
    if (user.getId() == null) {
        user.setId(++userCount);
    }
    users.add(user);
    return user;
}

public Users findOne(int id) {
    for (Users user : users) {
        if (user.getId() == id) {
            return user;
        }
    }
    return null;
}

public Users deleteOne(int id) {
    Iterator<Users> it = users.iterator();
    while (it.hasNext()) {
        Users usrIter = it.next();
        if (usrIter.getId() == id) {
            it.remove();
            return usrIter;
        } else {
            return usrIter;
        }
    }
    return null;
}

}
