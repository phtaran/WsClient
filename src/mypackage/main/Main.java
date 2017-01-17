package mypackage.main;

import mypackage.HelloWorldService;

import javax.annotation.Resource;
import javax.xml.ws.WebServiceContext;

public class Main {

    @Resource
    static WebServiceContext webServiceContext;

    public static void main(String[] args) {

        HelloWorldService helloWorldService = new HelloWorldService();
        String sayHelloWorldFrom = helloWorldService.getHelloWorldPort().sayHelloWorldFrom("Paska");
        System.out.println(sayHelloWorldFrom);
    }
}
