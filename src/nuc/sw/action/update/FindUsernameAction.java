package nuc.sw.action.update;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import nuc.sw.dao.UserDao;
import nuc.sw.vo.User;

import java.sql.ResultSet;

/**
 * Created by superzhaolu on 2017/11/25.
 */
public class FindUsernameAction extends ActionSupport {
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

    UserDao dao=new UserDao();
    User user=new User();
    //HttpServletRequest request;
    public String find(){
        String username=(String) ActionContext.getContext().getSession().get("username");
        user=dao.FindByUserName(username);
        ActionContext.getContext().getSession().put("password", getPassword());
        ActionContext.getContext().getSession().put("summary", getSummary());
        ActionContext.getContext().getSession().put("sex", getSex());
        System.out.println("password");
        return "OK";

    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

}

