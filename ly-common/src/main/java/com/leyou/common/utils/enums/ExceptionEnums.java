package com.leyou.common.utils.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 自定义异常枚举
 */
@Getter
@NoArgsConstructor//自动生成无参构造
@AllArgsConstructor//自动生成全参数构造函数
public enum ExceptionEnums {
    PRICE_CANNOT_BE_NULL(400,"价格不能为空！");

    private int code;
    private  String msg;

}
