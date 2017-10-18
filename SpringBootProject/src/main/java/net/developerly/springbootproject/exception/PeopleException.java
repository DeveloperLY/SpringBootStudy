package net.developerly.springbootproject.exception;

import net.developerly.springbootproject.enums.ResultEnum;

/**
 * @author LY
 * @create 2017/10/18
 **/
public class PeopleException extends RuntimeException {

    private Integer code;

    public PeopleException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
