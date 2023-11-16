package sdfassessment.task1;

import java.util.ArrayList;
import java.util.Locale.Category;

public class Header {
    private String Category;
    public Header(String string, String string2) {
    }
    public String getCategory() {
        return Category;
    }
    public  void setCategory(String category) {
    this.Category = Category;
    }
    private String Rating;
    public  String getRating() {
        return Rating;
    }
    public  void setRating(String rating) {
        this.Rating = rating;
    }
    private static String App;
    public static String getApp() {
        return App;
    }
    public  void setApp(String app) {
        this.App = app;
    }

    public void Header (String Category, String Rating){
        this.Rating= Rating;
        this.Category= Category;
    }
    
    
}
