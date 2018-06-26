package nuc.sw.dao;

import nuc.sw.util.JDBCUtil;
import nuc.sw.vo.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by superzhaolu on 2017/11/21.
 */
public class UserDao {
    private Connection connection= JDBCUtil.getConnection();

    public int addUser(User user){
        int rs=0;
        PreparedStatement ps=null;
        //language=SQL
        System.out.println("user"+user);
        String sql = "insert into user(username,password,summary,sex)values (?,?,?,? )";
        try {
            ps=connection.prepareStatement(sql);
            ps.setString(1,user.getUsername());
            ps.setString(2,user.getPassword());
            ps.setString(3,user.getSummary());
            ps.setString(4,user.getSex());
            System.out.println(rs);
            rs=ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
    public ResultSet findUserName(User user){
        PreparedStatement ps=null;
        ResultSet rs=null;
        String sql="SELECT * FROM user WHERE username=?";
        try {
            ps=connection.prepareStatement(sql);
            ps.setString(1,user.getUsername());
            rs=ps.executeQuery();
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(rs);
        return rs;

    }
    public User FindByUserName(String username) {
        PreparedStatement ps=null;
        ResultSet rs=null;
        System.out.println(username);
        String sql = "select * from user where username=?";
        User user=new User();
        try {
            ps=connection.prepareStatement(sql);
            ps.setString(1, username);
            rs=ps.executeQuery();
            if(rs.next()){
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setSummary(rs.getString("summary"));
                user.setSex(rs.getString("sex"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(user);
        return user;
    }


    public User selectUser(User user){
        PreparedStatement ps=null;
        ResultSet rs=null;
        String sql="SELECT * FROM user WHERE username=? AND password=?";
        User currentUser = new User();
        try {
            ps=connection.prepareStatement(sql);
            ps.setString(1,user.getUsername());
            ps.setString(2,user.getPassword());
            rs=ps.executeQuery();
            while (rs.next()){
                currentUser.setUsername(rs.getString("username"));
                currentUser.setPassword(rs.getString("password"));
                currentUser.setSummary(rs.getString("summary"));
                currentUser.setSex(rs.getString("sex"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return currentUser;
    }

    public int UpdateUser(User user) {
        int rs=0;
        PreparedStatement ps=null;
        String sql = "UPDATE user SET password=?,summary=?,sex=? WHERE username=?";
        try {
            ps=connection.prepareStatement(sql);
            ps.setString(1, user.getPassword());
            ps.setString(2, user.getSummary());
            ps.setString(3,user.getSex());
            ps.setString(4,user.getUsername());
            System.out.println("updateuser"+user);
            rs = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(rs);
        return rs;

    }

}
