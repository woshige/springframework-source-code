package com.spring.source.core.initantiating;

/**
 * @author sunlichao
 * use static factory-method
 */
public class ClientService {
    private static ClientService clientService = new ClientService();

    private ClientService() {
    }
    public static ClientService createInstance(){
        return clientService;
    }
}
