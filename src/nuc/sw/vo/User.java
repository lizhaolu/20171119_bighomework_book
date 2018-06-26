package nuc.sw.vo;

import java.util.Date;

/**
 * Created by superzhaolu on 2017/10/11.
 */
public class User {
    @Override
    public String toString() {
        return "User{" +
                "sex='" + sex + '\'' +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                ", summary='" + summary + '\'' +
                '}';
    }


    private String sex;
    private String password;
    private String username;
    private String summary;
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
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


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


}