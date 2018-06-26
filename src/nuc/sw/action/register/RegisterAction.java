package nuc.sw.action.register;

import com.opensymphony.xwork2.ActionSupport;
import nuc.sw.service.UserService;
import nuc.sw.vo.User;

import java.util.regex.Pattern;

/**
 * Created by superzhaolu on 2017/11/21.
 */
public class RegisterAction extends ActionSupport {
    public String username;
    public String password;
    public String summary;
    public String sex;

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
    private final String PASSWORD = "\\w{5,16}";
    private final String USERNAME = "[a-zA-Z]{6,15}";
    public void validateRegisterMethod() {
        if (password == null || "".equals(password.trim())) {
            this.addFieldError("password", "密码不可为空");
        } else {
            if (!Pattern.matches(PASSWORD, password)) {
                this.addFieldError("password1","密码必须为5~16位");
            }
        }
        if (username == null || "".equals(username.trim())) {
            this.addFieldError("username", "用户名不可为空");
        } else {
            if (!Pattern.matches(USERNAME, username.trim())) {
                this.addFieldError("username", "用户名必须为5~16位");
            }
        }
    }
    User user=new User();
    public void userset(){
       user.setUsername(username);
       user.setPassword(password);
       user.setSummary(summary);
       user.setSex(sex);
       System.out.println("user"+user);
   }
    UserService service=new UserService();
    public String registerMethod(){
        int rm;
        userset();
        rm=service.add(user);
        if(rm==1){
            return "registerOK";
        }else{
            this.addFieldError("err","注册失败，请重新输入");
            return "registerFail";
        }

    }
}
