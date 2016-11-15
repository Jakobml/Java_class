package rest.handler;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import rest.db.Address;
import rest.db.Database;
import rest.service.CodeGeneratorService;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/**
 * Created by jane on 2016-02-17.
 */
public class AddressListHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        Database db = Database.getInstance();
        List<Address> addressList = db.findAll();
        String response = addressList.toString();
        httpExchange.sendResponseHeaders(200, response.length());
        OutputStream os = httpExchange.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }
}
