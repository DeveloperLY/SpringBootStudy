package net.developerly.springbootproject.enums;

public enum ResultEnum {
    UNKONW_ERROR(-1, "未知错误"),
    SUCCESS(0, "请求成功"),
    NAME_NULL(1001, "姓名为空"),
    AGE_NULL(1002, "年龄为空"),
    ALL_NULL(1003, "没有找到")
    ;

    private Integer code;

    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
