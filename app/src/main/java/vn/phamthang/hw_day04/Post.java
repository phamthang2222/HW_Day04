package vn.phamthang.hw_day04;

public class Post {
    private String urlAvt;
    private String userName;
    private String status;
    private String urlImgPost;

    public Post() {
    }

    public String getUrlAvt() {
        return urlAvt;
    }

    public void setUrlAvt(String urlAvt) {
        this.urlAvt = urlAvt;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUrlImgPost() {
        return urlImgPost;
    }

    public void setUrlImgPost(String urlImgPost) {
        this.urlImgPost = urlImgPost;
    }

    public Post(String urlAvt, String userName, String status, String urlImgPost) {
        this.urlAvt = urlAvt;
        this.userName = userName;
        this.status = status;
        this.urlImgPost = urlImgPost;
    }

    @Override
    public String toString() {
        return "Post{" +
                "urlAvt='" + "Link avt" + '\'' +
                ", userName='" + userName + '\'' +
                ", status='" + status + '\'' +
                ", urlImgPost='" + "Link ảnh" + '\'' +
                '}';
    }
}
