package rest.handler;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import rest.service.CodeGeneratorService;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

/**
 * Created by jedgren on 20/12/15.
 */
public class GenerateCodeHandler implements HttpHandler {



    @Override
    public void handle(HttpExchange httpExchange) throws IOException {

        String response = CodeGeneratorService.generateCode(10);
        httpExchange.sendResponseHeaders(200, response.length());
        OutputStream os = httpExchange.getResponseBody();
        os.write(response.getBytes());
        os.close();

    }

}
