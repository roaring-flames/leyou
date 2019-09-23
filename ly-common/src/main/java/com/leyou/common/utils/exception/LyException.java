package com.leyou.common.utils.exception;

import com.leyou.common.utils.enums.ExceptionEnums;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 工程自定义异常
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class LyException extends  RuntimeException{

    private ExceptionEnums exceptionEnums;

}
