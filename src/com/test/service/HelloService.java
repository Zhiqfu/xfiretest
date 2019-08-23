package com.test.service;

public class HelloService implements IHelloService{   
    public String sayHello(String name){ 
        return "Hello, "+name;  
    }  
    public String sayHelloAxis(String name){ 
        return "Hello Axis, "+name;  
    }  
    public User getUser(User user) { 
        User userNew = new User();  
        userNew.setId("new:"+user.getId());  
        userNew.setName("new:"+user.getName());  
        return userNew;  
    }
	
}
