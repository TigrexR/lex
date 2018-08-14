package com.tigrex.api.vo.templateProvider;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class ResultData {

    /**
     * 接口是否调用成功
     */
    private boolean flag = true;

    /**
     * 回传的消息
     */
    private String msg;

    /**
     * 回传的数据
     */
    private Object data;

}
