package com.test;

public class mian {
    public static void main(String[] args) {
        myInterface plugin_in_protocolConnection = new Connection();
        usePlugin(plugin_in_protocolConnection);

        myInterface plugin_in_TFTPProtocol = (myInterface) new TFTPProtocol();
        usePlugin(plugin_in_TFTPProtocol);
    }

    private static void usePlugin(myInterface plugin){
        plugin.getInstance();
    }
}
