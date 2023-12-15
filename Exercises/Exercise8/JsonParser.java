import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.IOException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class JsonParser {
    public static void main(String[] args) throws IOException, ParseException {
        try {

            JSONParser parser = new JSONParser();
            JSONObject jsonObject = (JSONObject) parser.parse(new FileReader(new File("books.json")));
            System.out.println(jsonObject.toString());
            JSONObject bookShelf = (JSONObject) jsonObject.get("BookShelf");
            JSONArray bookArray = (JSONArray) bookShelf.get("Book");
            for (int i = 0; i < bookArray.size(); i++) {
                JSONObject book = (JSONObject) bookArray.get(i);
                String title = (String) book.get("title");
                String publishedYear = (String) book.get("publishedYear");
                String numberOfPages = (String) book.get("numberOfPages");
                JSONObject authors = (JSONObject) book.get("authors");
                String author = (String) authors.get("author");
                System.out.println("Title: " + title);
                System.out.println("Published Year: " + publishedYear);
                System.out.println("Number of Pages: " + numberOfPages);
                System.out.println("Author: " + author);
            }
            JSONObject newBook = new JSONObject();
            newBook.put("title", "Moby-Dick");
            newBook.put("publishedYear", "1851");
            newBook.put("numberOfPages", "732");
            JSONObject newAuthors = new JSONObject();
            newBook.put("authors", new JSONObject().put("author", "Herman Melville"));
            newBook.put("authors", newAuthors);
            bookArray.add(newBook);
            System.out.println("\nupdated JSON: " + jsonObject.toJSONString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}