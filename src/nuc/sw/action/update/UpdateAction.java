package nuc.sw.action.update;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.net.httpserver.Authenticator;
import nuc.sw.dao.UserDao;
import nuc.sw.service.UserService;
import nuc.sw.vo.User;

/**
 * Created by superzhaolu on 2017/11/26.
 */
public class UpdateAction {
    private String username;
    private String password;
    private String summary;
    private String sex;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


    public String updateUser(){
        User user=new User();
        UserService service=new UserService();
        int rs=0;
        user.setUsername(username);
        user.setPassword(password);
        user.setSummary(summary);
        user.setSex(sex);
        rs=service.update(user);
        ActionContext.getContext().getSession().put("user",user);
        if (rs == 0) {
            return "fail";
        }else {
            return "success";
        }
    }
}
