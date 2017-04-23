package librarymanagementsystem;

import java.util.Objects;
import javax.swing.JOptionPane;

class Admin {

    private String Admin_Username;
    private String Admin_Password;

    public String getUsername() {
        return Admin_Username;
    }

    public String getPassword() {
        return Admin_Password;
    }

    public void setUsername(String name) {
        Admin_Username = name;
    }

    public void setPassword(String pass) {
        Admin_Password = pass;
    }

    public Admin() {
        Admin_Username = "admin";
        Admin_Password = "admin";
    }

    public Admin(String user, String pass) {
        Admin_Username = user;
        Admin_Password = pass;
    }
    
    public String equals(String user, String pass){
        if(Admin_Username.equals(user) && Admin_Password.equals(pass)){
            return "true";
        }
        else if(Admin_Username.equals(user) && !Admin_Password.equals(pass)){
            return "password";
        }else if(!Admin_Username.equals(user) && Admin_Password.equals(pass)){
            return "username";
        }else{
            return "false";
        }
    }
    
}
