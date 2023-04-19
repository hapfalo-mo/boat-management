package dao;

import dto.User;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {

    public User readUserFromFile() {
        User user = null;
        try {
            FileReader fr = new FileReader("C:\\Users\\Admin\\Documents\\NetBeansProjects\\BoatManagement\\web\\setup.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                String txt[] = line.split(";");
                String username = txt[0];
                String password = txt[1];
                user = new User(username, password);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return user;
    }
    

}
