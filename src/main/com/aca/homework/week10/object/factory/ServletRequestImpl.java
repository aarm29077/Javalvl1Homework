package com.aca.homework.week10.object.factory;

public class ServletRequestImpl<T extends ObjectFactory<T>> implements ServletRequest<T> {
    ServletRequestObjectFactory servletRequestObjectFactory;


    public ServletRequestImpl() {

    }

    @Override
    public int getContentLength() {
        String string = servletRequestObjectFactory.getObject().toString();
        return string.length();
    }


    @Override
    public String getBody() {
        return servletRequestObjectFactory.getObject().toString();
    }

}
