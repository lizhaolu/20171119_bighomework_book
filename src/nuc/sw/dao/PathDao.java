package nuc.sw.dao;

import nuc.sw.vo.Path;
import nuc.sw.util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by idea on 2017/11/5.
 */
public class PathDao {
    private Connection connection= JDBCUtil.getConnection();

    //增加新文件的方法
    public int add(Path path){
        int rs=0;
        PreparedStatement ps=null;
        String sql="insert into bighomework.file (downfilename,newfilename) values (?,?);";
        try {
            ps=connection.prepareStatement(sql);
            ps.setString(1,path.getUploadFileName());
            ps.setString(2,path.getSaveFileName());
            rs=ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    //查询方法
    public List<Path> select(){

        List<Path> list=new ArrayList<Path>();
        PreparedStatement ps=null;
        String sql="SELECT * FROM file";
        ResultSet rs;
        try {
            ps=connection.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Path path=new Path();
                path.setUploadFileName(rs.getString("downfilename"));
                path.setUploadContentType(rs.getString("contenttype"));
                path.setSaveFileName(rs.getString("newfilename"));
                list.add(path);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    public int deleteUser(Path path){
        PreparedStatement ps=null;
        int rs=0;
        String sql="DELETE FROM file WHERE downfilename=?";
        try {
            ps=connection.prepareStatement(sql);
            ps.setString(1,path.getUploadFileName());
            rs=ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
}
