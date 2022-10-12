package pojo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class BookDB {
    private static Map<String, Book> booklist = new HashMap<>();

    static {
        booklist.put("1", new Book("1","Javaweb开发"));
        booklist.put("2", new Book("2","jdbc开发"));
        booklist.put("3", new Book("3","java基础"));
        booklist.put("4", new Book("4","struts开发"));
        booklist.put("5", new Book("5","spring开发"));
    }

    public static Collection<Book> GetAllBook() {
        return booklist.values();
    }

    public static Book GetBookById(String id) {
        return booklist.get(id);
    }
}
