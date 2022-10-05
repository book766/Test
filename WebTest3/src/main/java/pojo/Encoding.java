package pojo;

import java.io.UnsupportedEncodingException;

public class Encoding {
    public Encoding() {
    }

    public String encoded(String s) throws UnsupportedEncodingException {
        String temp = null;

        if(!s.equals("") && s != null){
            temp = new String(s.getBytes("ISO-8859-1"),"UTF-8");
        }
        return temp;
    }
}
