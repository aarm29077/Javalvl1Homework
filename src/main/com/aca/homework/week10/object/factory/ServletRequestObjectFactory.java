package com.aca.homework.week10.object.factory;

/*
Create an ObjectFactory generic interface that has the below method:
T getObject();

Create a ServletRequest interface that has the following methods
int getContentLength();
String getBody();

Create a ServletRequestImpl implementation class that has default constructor and setters.
Create an ServletRequestObjectFactory that implements ObjectFactory and every
       time creates and returns a new ServletRequestImpl object when the getObject() method is invoked.

Create a ServletRequestObjectFactoryTest class and the following methods:

testSingleGetObject() //assert that the result is not null
testGet2Objects() // get 2 objects from the factory and assert that they are not the same
testGet3Objects() // get 3 objects from the factory and assert that they are not the same

 */
public class ServletRequestObjectFactory<T> implements ObjectFactory<T> {

    @Override
    public T getObject() {
        return (T) new ServletRequestImpl();
    }

    @Override
    public String toString() {
        return getObject().toString();
    }
}
