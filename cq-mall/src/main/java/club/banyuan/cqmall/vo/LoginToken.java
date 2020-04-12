package club.banyuan.cqmall.vo;

public class LoginToken {
    private String schema;
    private String token;

    public LoginToken() {
    }

    public LoginToken(String schema, String token) {
        this.schema = schema;
        this.token = token;
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "LoginToken{" +
                "schema='" + schema + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}
