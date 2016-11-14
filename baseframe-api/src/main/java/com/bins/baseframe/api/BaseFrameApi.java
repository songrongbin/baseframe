package com.bins.baseframe.api;

import com.bins.baseframe.dto.req.HelloWorldReqDto;
import com.bins.baseframe.dto.resp.HelloWorldRespDto;

/**
 * Created by songrongbin on 2016/11/11.
 */
public interface BaseFrameApi {
    public HelloWorldRespDto sayHelloWorld(HelloWorldReqDto HelloWorldReqDto);
}
