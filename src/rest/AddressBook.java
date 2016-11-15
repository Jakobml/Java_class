package rest;

import com.sun.net.httpserver.HttpServer;
import rest.handler.AddressListHandler;
import rest.handler.AddressSaveHandler;
import rest.handler.GenerateCodeHandler;
import rest.handler.TestHandler;

import java.io.IOException;
import java.net.InetSocketAddress;

/**
 * Created by jedgren on 20/12/15.
 */

public class AddressBook {
    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        server.createContext("/test", new TestHandler());
        server.createContext("/generateCode", new GenerateCodeHandler());
        server.createContext("/addressList", new AddressListHandler());
        server.createContext("/addressSave", new AddressSaveHandler());
        server.setExecutor(null); // creates a default executor
        server.start();
    }
}
