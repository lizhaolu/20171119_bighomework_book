package nuc.sw.action.upload;

import com.opensymphony.xwork2.ActionSupport;
import nuc.sw.vo.Path;
import nuc.sw.service.PathService;

import java.io.File;
import java.util.List;

/**
 * Created by idea on 2017/10/23.
 */
public class UploadAction extends ActionSupport {
    private String title;
    private File[] upload;
    private String[] uploadContentType;
    private String[] uploadFileName;
    private String savePath;
    private List<Path> paths;

    public String getSavePath() {
        return savePath;
    }

    public List<Path> getPaths() {
        return paths;
    }

    public void setPaths(List<Path> paths) {
        this.paths = paths;
    }

    public void setSavePath(String savePath) {
        this.savePath = savePath;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public File[] getUpload() {
        return upload;
    }

    public void setUpload(File[] upload) {
        this.upload = upload;
    }

    public String[] getUploadContentType() {
        return uploadContentType;
    }

    public void setUploadContentType(String[] uploadContentType) {
        this.uploadContentType = uploadContentType;
    }

    public String[] getUploadFileName() {
        return uploadFileName;
    }

    public void setUploadFileName(String[] uploadFileName) {
        this.uploadFileName = uploadFileName;
    }

    public String uploadMethod(){
        int rs=0;
        PathService service=new PathService();
        rs=service.uploadPath(upload,uploadFileName,uploadContentType);
        if (rs==1){
            return "uploadOk";
        }else {
            return "uploadFail";
        }

    }


}
