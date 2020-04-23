package club.banyuan.cqmall.common;

public enum BadRequestDetails {

    RESOURCE_ROLE_DELETE_ERROR(10010,"资源角色相关联，无法删除");

    private int code;
    private String message;

    BadRequestDetails() {
    }

    BadRequestDetails(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "BadRequestDetails{" +
                "code=" + code +
                ", message='" + message + '\'' +
                '}';
    }
}
