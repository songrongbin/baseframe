package com.bins.baseframe.dto.resp;

import com.bins.baseframe.common.CommonRequest;

/**
 * Created by songrongbin on 2016/11/11.
 */
public class HelloWorldRespDto extends CommonRequest {
    private Long result;

    public Long getResult() {
        return result;
    }

    public void setResult(Long result) {
        this.result = result;
    }
}
