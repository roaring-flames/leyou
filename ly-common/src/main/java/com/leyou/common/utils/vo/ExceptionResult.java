package com.leyou.common.utils.vo;

import com.leyou.common.utils.enums.ExceptionEnums;
import lombok.Data;

/**
 * 返回结果集
 */
@Data
public class ExceptionResult {
    private int  status;
    private String message;
    private Long timestamp;

    public ExceptionResult(ExceptionEnums enums) {
        this.status = enums.getCode();
        this.message = enums.getMsg();
        this.timestamp = System.currentTimeMillis();
    }
}
