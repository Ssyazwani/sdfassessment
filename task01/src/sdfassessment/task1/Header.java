package sdfassessment.task1;

import java.util.ArrayList;
import java.util.Locale.Category;

public class Header {
    private static String Category;
    private static String App;
    private Float Rating;
    
    public Header(String Category, String App, float Rating) {
    }
    public static String getCategory() {
        return Category;
    }
    public  void setCategory(String category) {
    this.Category = Category;
    }
    
    public Float getRating() {
        return Rating;
    }
    public  void setRating(Float rating) {
        this.Rating = rating;
    }
   
    public static  String getApp() {
        return App;
    }
    public  void setApp(String app) {
        this.App = app;
    }

    public static Float getAvg (Float Rating, String Category){
        Float Avg = (Rating / (Integer.parseInt(Category)));
        return Avg;

    } 

    public static void Cate (String App, String Category){
        App = getApp();
        Category = getCategory();

    }
    }
    

