package com.gfiume.service;


import com.gfiume.entity.TestMessage;

import javax.jws.WebService;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.ResponseWrapper;
import java.util.concurrent.Future;

@WebService
public interface ChangeMessage {
    @ResponseWrapper(localName = "changeMessageResponse", className = "com.gfiume.entity.TestMessage")
    public String changeMessage(String message);

    @ResponseWrapper(localName = "changeMessageResponse", className = "com.gfiume.entity.TestMessage")
    public Future<?> changeMessageAsync(String message, AsyncHandler<TestMessage> asyncHandler);

}
