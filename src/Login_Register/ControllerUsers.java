/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login_Register;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author russell
 */
public class ControllerUsers {
    private final LoginView loginView;
    private final RegisterView registerView;
    private final HomePage home;
    private final ModelUsers model;
    private final ArrayList<User> users;
    private User currentUser;

    public ControllerUsers() {
        this.loginView = new LoginView(this);
        this.registerView = new RegisterView(this);
        this.home = new HomePage(this);
        this.model = new ModelUsers(this);
        this.home.setVisible(true);
        users = new ArrayList<>();
    }
    
    public void toRegisterButtonPushed()
    {
        this.loginView.dispose();
        this.home.dispose();
        this.registerView.setVisible(true);
    }
    
    public void toDocumentButtonPushed(User user)
    {
        this.loginView.dispose();
        currentUser = user;
        Documents.ControllerDocs nextCntl = new Documents.ControllerDocs();
    }
    
    public void toLogin(){
        this.home.dispose();
        this.loginView.setVisible(true);
    }
    
    public void toHome(){
        this.registerView.dispose();
        this.loginView.dispose();
        this.home.setVisible(true);
    }
    
    public void addUser(String firstName, String lastName, String address, String gender, String username, String password, String phoneNumber, int age, String userType){
        try{
            User toAdd = new User(firstName,lastName,address,gender,username,password,phoneNumber,age,userType);
            users.add(toAdd);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "The user could not be created due to one or more invalid fields.");
            System.out.println(e);
        }
    }
    
    public ArrayList<User> getUsers(){
        return users;
    }
    
    public void checkCredentials(String userName, String passWord){
        boolean usernamefound = false;
        boolean passwordfound = false;
        for(int i=0;i<users.size();i++){
            if(userName.equals(users.get(i).getUsername())){
                if(passWord.equals(users.get(i).getPassword())){
                    toDocumentButtonPushed(users.get(i));
                    usernamefound=true;
                    passwordfound=true;
                    break;
                }
                usernamefound=true;
            }
        }
        
        if(usernamefound==true){
            if(passwordfound==false){
                JOptionPane.showMessageDialog(null, "Invalid Password. Please try again.");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Username not found.");
        }
        
        
    }
    
}
