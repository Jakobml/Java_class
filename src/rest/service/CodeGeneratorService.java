package rest.service;

import java.util.Random;

/**
 * Created by jane on 2016-02-17.
 */
public class CodeGeneratorService {
    private static final String CODE_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    public static String generateCode(int codeLength){
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
