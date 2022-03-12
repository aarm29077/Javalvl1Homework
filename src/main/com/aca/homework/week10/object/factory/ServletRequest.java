package com.aca.homework.week10.object.factory;

public interface ServletRequest<T extends ObjectFactory<T>> {

    int getContentLength();

    String getBody();
}
