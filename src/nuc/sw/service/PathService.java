package nuc.sw.service;

import nuc.sw.vo.Path;
import nuc.sw.dao.PathDao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by superzhaolu on 2017/11/22.
 */
public class PathService {
    PathDao dao=new PathDao();

    public final String savepath="d:/class/";
    public int uploadPath(File[] upload,String[] uploadFileName,String[]  uploadContentType){
        int rs=0;
        int di=0;
        for (int i=0;i<uploadFileName.length;i++) {
            try{
                FileInputStream fis = new FileInputStream(upload[i]);
                //System.out.println("up n is "+ uploadFileName[i]);
                String newFileName = UUID.randomUUID().toString() + "_" + uploadFileName[i];
               // System.out.println("新名字"+newFileName);
                Path path = new Path();
                path.setSaveFileName(newFileName);
                path.setUploadContentType(uploadContentType[i]);
                path.setUploadFileName(uploadFileName[i]);
                FileOutputStream fos = new FileOutputStream(savepath+ newFileName);
                byte[] buffer = new byte[1024];
                int len;
                while ((len = fis.read(buffer)) > 0) {
                    fos.write(buffer, 0, len);
                }
                rs=dao.add(path);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if(rs==0){
            return di;
        }else {
            di=1;
            return di;
        }
    }
    public List<Path> downloadPath(){
        List<Path> paths=new ArrayList<Path>();
        PathDao dao=new PathDao();
        paths=dao.select();
        return paths;
    }

    Path path=new Path();

    public int deletePath(){
        int rs=0;
        int del=0;
        PathDao dao=new PathDao();
        rs=dao.deleteUser(path);
        if (rs==0){
            return del;
        }else {
            del=1;
            return del;
        }
    }

}
