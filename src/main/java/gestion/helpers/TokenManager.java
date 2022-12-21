package gestion.helpers;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.sql.Date;
import java.util.Random;

public class TokenManager {
    public static String generateToken(int id,String url) throws NoSuchAlgorithmException, UnsupportedEncodingException
    {
        return Encrypte.SHA1("messi pour tout"+id+"  "+System.currentTimeMillis()+url);
    }
    public static String getTok(String token)
    {
        return token.substring(7);
    }
}
