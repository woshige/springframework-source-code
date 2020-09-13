package com.spring.source.core.initantiating;

/**
 * @author sunlichao
 * create bean by factory-method
 */
public class DefaultServiceLoader {
    private static ServerService serverService = new ServerService();
    public ServerService createServerService(){
        return serverService;
    }
}
