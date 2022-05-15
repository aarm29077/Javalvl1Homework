package com.aca.homework.week10.object.factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
Create an ObjectFactory generic interface that has the below method:
T getObject();

Create a ServletRequest interface that has the following methods
int getContentLength();
String getBody();

Create a ServletRequestImpl implementation class that has default constructor and setters.

Create an ServletRequestObjectFactory that implements ObjectFactory and
       every time creates and returns a new ServletRequestImpl object when the getObject() method is invoked.

Create a ServletRequestObjectFactoryTest class and the following methods:
testSingleGetObject() //assert that the result is not null
testGet2Objects() // get 2 objects from the factory and assert that they are not the same
testGet3Objects() // get 3 objects from the factory and assert that they are not the same
 */
class ServletRequestObjectFactoryTest {

    @Test
    public void testSingleGetObject() {
        ServletRequestImpl servletRequest = new ServletRequestImpl();
        ObjectFactory<String> objectFactory = new ServletRequestObjectFactory<>();
        servletRequest.servletRequestObjectFactory = (ServletRequestObjectFactory) objectFactory;
        objectFactory.getObject();
        Assertions.assertNotEquals(null, objectFactory.getObject());
    }

    @Test
    public void testGet2Objects() {
        ServletRequestImpl servletRequest = new ServletRequestImpl();
        ObjectFactory<String> objectFactory = new ServletRequestObjectFactory<>();
        servletRequest.servletRequestObjectFactory = (ServletRequestObjectFactory) objectFactory;
        Assertions.assertNotEquals(objectFactory.getObject(),objectFactory.getObject());
    }

    @Test
    public void testGet3Objects(){
        ServletRequestImpl servletRequest = new ServletRequestImpl();
        ObjectFactory<String> objectFactory = new ServletRequestObjectFactory<>();
        servletRequest.servletRequestObjectFactory = (ServletRequestObjectFactory) objectFactory;
        Object obj1 = objectFactory.getObject();
        Object obj2 = objectFactory.getObject();
        Object obj3 = objectFactory.getObject();

        Assertions.assertNotEquals(obj1,obj2);
        Assertions.assertNotEquals(obj1,obj3);

    }
}