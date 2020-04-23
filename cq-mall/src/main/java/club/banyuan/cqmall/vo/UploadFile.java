package club.banyuan.cqmall.vo;

public class UploadFile {

    private String url;
    private String name;

    public UploadFile() {
    }

    public UploadFile(String url, String name) {
        this.url = url;
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "uploadFile{" +
                "url='" + url + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
