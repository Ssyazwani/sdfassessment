package sdfassessment.task1;

import java.util.List;

public class AppRate {
    private String App;
    private String Category;

    public String getApp() {
        return App;
    }



    public void setApp(String app) {
        App = app;
    }



    private String Rating;

    

    public String getRating() {
        return Rating;
    }



    public void setRating(String rating) {
        Rating = Rating;
    }



    public AppRate (String App, String args){
        this.App= App;
        this.Rating= args;
    }



    public AppRate() {
    }



    public String getCategory() {
        return this.Category = Category;
    }



    
    
}
