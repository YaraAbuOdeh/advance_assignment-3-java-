package com.test;

import java.util.List;

public class PluginAdapter implements myInterface
{
    private TFTPProtocol plugin;

    public PluginAdapter(TFTPProtocol plugin){this.plugin = plugin;}

    @Override
    public Connection getInstance(String protocol){
        plugin.getTFTPInstance();
        return null;
    }

    @Override
    public List<String> getCurrentConnections() {
        return null;
    }



    @Override
    public  boolean releaseByParameter(String protocol){
        return plugin.releaseTFTP();
    }

    @Override
    public void send(String message){
         plugin.sendMessage(message);

    }
}
