package net.developerly.springbootproject.handle;

import net.developerly.springbootproject.domain.Result;
import net.developerly.springbootproject.exception.PeopleException;
import net.developerly.springbootproject.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author LY
 * @create 2017/10/18
 **/

@ControllerAdvice
public class ExceptionHandle {
    private final static Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e) {
        if (e instanceof PeopleException) {
            PeopleException peopleException = (PeopleException) e;
            return ResultUtil.error(peopleException.getCode(), peopleException.getMessage());
        } else {
            logger.error("【系统异常】{}", e);
            return ResultUtil.error(-1, "未知错误");
        }
    }

}
