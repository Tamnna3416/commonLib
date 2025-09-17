package com.intimetec.dummy.commonLib.config;

public interface RabbitConsumer<T> {

    String handleMessage(T message);
}
