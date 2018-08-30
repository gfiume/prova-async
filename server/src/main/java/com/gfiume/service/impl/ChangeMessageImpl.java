package com.gfiume.service.impl;

import com.gfiume.entity.TestMessage;
import com.gfiume.service.ChangeMessage;
import org.apache.cxf.annotations.UseAsyncMethod;
import org.apache.cxf.jaxws.ServerAsyncResponse;

import javax.jws.WebService;
import javax.xml.ws.AsyncHandler;
import java.util.concurrent.Future;

@WebService(endpointInterface = "com.gfiume.service.ChangeMessage", serviceName = "ChangeMessage")
public class ChangeMessageImpl implements ChangeMessage {

    @Override
    @UseAsyncMethod
    public String changeMessage(String message){
        System.out.println("Executing changeMessage synchronously\n");
        return "echo message: " + message;
    }

    @Override
    public Future<?> changeMessageAsync(String message, AsyncHandler<TestMessage> asyncHandler) {
        System.out.println("Executing changeMessageAsync asynchronusly\n");
        final ServerAsyncResponse<TestMessage> asyncResponse = new ServerAsyncResponse<>();
        new Thread() {
            public void run() {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                TestMessage payload  = new TestMessage();
                payload.setMessage("message : " +  message);
                asyncResponse.set(payload);
                System.out.println("Responding on another thread\n");
                asyncHandler.handleResponse(asyncResponse);
            }
        }.start();
        return asyncResponse;
    }
}

