package com.test;

import java.util.List;

public interface myInterface {
    // function to create new connection if does not exist and #connections still
    // less than 3

    public  boolean releaseByParameter(String protocol);
    public Connection getInstance(String protocol);
    public  List<String> getCurrentConnections();
    public void send(String message);

}
