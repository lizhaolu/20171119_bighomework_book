package nuc.sw.service;

import nuc.sw.dao.UserDao;
import nuc.sw.vo.User;

import java.sql.ResultSet;

/**
 * Created by superzhaolu on 2017/11/21.
 */
public class UserService {

    UserDao dao = new UserDao();
    int da = 0;

    public int add(User user) {
        int rs = dao.addUser(user);
        if (rs != 0) {
            da = 1;
            return da;
        } else {
            return da;
        }
    }

    public int find(User user) {
        ResultSet rs = dao.findUserName(user);
        if (rs != null) {
            da = 1;
            return da;
        } else {
            return da;
        }
    }

    public int validate(User user) {
        int rs = 1;
        UserDao dao = new UserDao();
        String val1 = dao.selectUser(user).getUsername();
        String val2 = dao.selectUser(user).getPassword();
        if (user.getUsername().equals(val1) && user.getPassword().equals(val2)) {
            return rs;
        } else {
            rs = 0;
            return rs;
        }
    }

    public int update(User user){
        int rs=0;
        UserDao dao=new UserDao();
        rs=dao.UpdateUser(user);
        System.out.println("userservice"+user);
        return rs;
    }
}
