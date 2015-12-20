package rest.handler;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

/**
 * Created by jedgren on 20/12/15.
 */
public class GenerateCodeHandler implements HttpHandler {

    private static final String CODE_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        String response = generateCode(10);
        httpExchange.sendResponseHeaders(200, response.length());
        OutputStream os = httpExchange.getResponseBody();
        os.write(response.getBytes());
        os.close();

    }
    private String generateCode(int codeLength){
        String code = "";
        Random random = new Random();
        for(int i = 0; i < codeLength; i++){
            int position = random.nextInt(CODE_CHARACTERS.length());
            char newChar = CODE_CHARACTERS.charAt(position);
            code = code + newChar;
        }
        return code;
    }
}
