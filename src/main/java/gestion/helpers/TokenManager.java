package gestion.helpers;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.sql.Date;
import java.util.Random;

public class TokenManager {
    static String[] req;
    public static  int genererInt(int borneInf, int borneSup){
        Random random = new Random();
        int nb;
        nb = borneInf+random.nextInt(borneSup-borneInf);
        return nb;
    }
       
    public static String generateToken(int id,String url) throws NoSuchAlgorithmException, UnsupportedEncodingException
    {
        int numero= genererInt(0, url.length());
        return Encrypte.SHA1(req[numero]+id+"  "+System.currentTimeMillis()+url);
    }
    public static String getTok(String token)
    {
        return token.substring(7);
    }
}
