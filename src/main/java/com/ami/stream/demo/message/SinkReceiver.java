package com.ami.stream.demo.message;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@EnableBinding
public class SinkReceiver {

    @StreamListener(Sink.INPUT)
    public void receive(Object payload){
        System.out.println(payload);
    }
}
