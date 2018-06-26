package nuc.sw.vo;

/**
 * Created by idea on 2017/11/5.
 */
public class Path {
    private String uploadContentType;
    private String uploadFileName;
    private String saveFileName;

    @Override
    public String toString() {
        return "Path{" +
                "uploadContentType='" + uploadContentType + '\'' +
                ", uploadFileName='" + uploadFileName + '\'' +
                ", saveFileName='" + saveFileName + '\'' +
                '}';
    }

    public String getUploadContentType() {
        return uploadContentType;
    }

    public void setUploadContentType(String uploadContentType) {
        this.uploadContentType = uploadContentType;
    }

    public String getUploadFileName() {
        return uploadFileName;
    }

    public void setUploadFileName(String uploadFileName) {
        this.uploadFileName = uploadFileName;
    }

    public String getSaveFileName() {
        return saveFileName;
    }

    public void setSaveFileName(String saveFileName) {
        this.saveFileName = saveFileName;
    }
}
