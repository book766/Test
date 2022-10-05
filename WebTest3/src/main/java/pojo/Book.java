package pojo;

import java.util.HashMap;
import java.util.Map;

public class Book {
    private String name;

    public Book(String name) {
        this.name = name;
    }

    public static Map booklist(){
        Map booklist = new HashMap();

        booklist.put("1", "Javaweb开发");
        booklist.put("2", "jdbc开发");
        booklist.put("3", "java基础");
        booklist.put("4", "struts开发");
        booklist.put("5", "spring开发");

        return booklist;
    }
}
