package nuc.sw.action.login;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import nuc.sw.service.UserService;
import nuc.sw.vo.User;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpSession;
import java.util.regex.Pattern;

/**
 * Created by superzhaolu on 2017/10/11.
 */
public class LoginAction extends ActionSupport {

    private String password;

    private String username;

    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    //定义常量
    private final String PASSWORD = "\\w{5,16}";
    private final String USERNAME = "[a-zA-Z]{6,15}";

    public void validateLoginMethod() {
        if (password == null || "".equals(password.trim())) {
            this.addFieldError("password", this.getText("pass.empty"));
        } else {
            if (!Pattern.matches(PASSWORD, password)) {
                this.addFieldError("password", this.getText("pass.required"));
            }
        }
        if (username == null || "".equals(username.trim())) {
            this.addFieldError("username", this.getText("user.empty"));
        } else {
            if (!Pattern.matches(USERNAME, username.trim())) {
                this.addFieldError("username", this.getText("user.required"));
            }
        }
        HttpSession session = ServletActionContext.getRequest().getSession();
        String code1 = (String) session.getAttribute("randomCode");
        if (code == null || code.trim().equals("")) {
            this.addFieldError("code", this.getText("code.required"));
        } else {
            if (!code.equals(code1)) {
                this.addFieldError("code", this.getText("codeerror"));
            }
        }
    }

    public String loginMethod() {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        UserService service = new UserService();

        int exist = service.find(user);
        if (exist == 0) {
            System.out.println("找不到用户");
            return "loginNull";
        }
        int rs = service.validate(user);
        if (rs == 0) {
            System.out.println("登陆失败");
            return "loginFail";
        } else {
            System.out.println("登陆成功");
            ActionContext.getContext().getSession().put("user",user);
            return "loginOK";
        }

    }

}


