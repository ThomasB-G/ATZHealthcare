/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login_Register;

import java.util.*;
import java.io.*;

/**
 *
 * @author russell
 */
public class ModelUsers {
    private LinkedList<User> users;

    public ModelUsers() {
        users = new LinkedList<>();
    }

    public LinkedList<User> getUsers() {
        return users;
    }
    
}
