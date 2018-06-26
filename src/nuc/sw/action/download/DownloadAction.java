package nuc.sw.action.download;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import nuc.sw.vo.Path;
import nuc.sw.service.PathService;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by idea on 2017/10/29.
 */
public class DownloadAction extends ActionSupport {

    private String inputPath;
    private String contentType;
    private String downFileName;
    public String getInputPath() {
        return inputPath;
    }

    public void setInputPath(String inputPath) {
        this.inputPath = inputPath;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getDownFileName() throws UnsupportedEncodingException {
        return URLEncoder.encode(downFileName, "utf-8");
    }

    public void setDownFileName(String downFileName) {
        this.downFileName = downFileName;
    }


    public InputStream getTargetFile() {
        InputStream is = null;
        try {
            is = new FileInputStream(inputPath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return is;
    }


    public String showAll() {
        PathService pathService = new PathService();
        List<Path> paths = pathService.downloadPath();
        ActionContext.getContext().put("paths", paths);
        ActionContext.getContext().put("savePath","d:/class/");
        return SUCCESS;
    }

    public String deletefile(){
        Path path=new Path();
        PathService pathService=new PathService();
        pathService.deletePath();
        return SUCCESS;
    }
}
