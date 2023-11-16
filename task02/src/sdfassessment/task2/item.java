package sdfassessment.task2;


import java.util.LinkedList;
import java.util.Queue;

public class item implements Comparator{
   private String request_id; 
   private int item_count;
   private int budget;
   private String prod_list;
   private String prod_start;
   private String prod_end;
   private int prod_id;
   private String title;
   private int price;
   private int rating;
  private Object item;

  public item(int rating, int price){
    this.item = item;
}

public void weighing(int budget, int rating, int price) {
    Queue<Integer> queue = new LinkedList<>();
    for (int i : queue){
        item obj1 = new item(rating, price);
        item obj2 = new item(rating,price);
     if (obj1.rating>obj2.rating){
        queue.offer(obj1.rating);
        queue.offer(obj2.rating);
     } else if (obj1.rating == obj2.rating && obj2.price<obj1.price) {
        queue.offer(obj2.rating);
        queue.offer(obj1.rating);
     } else{
        queue.offer(obj2.rating);
        queue.offer(obj1.rating);
     }
    }
  
    }
   

public String getRequest_id() {
    return request_id;
}
public void setRequest_id(String request_id) {
    this.request_id = request_id;
}
public int getItem_count() {
    return item_count;
}
public void setItem_count(int item_count) {
    this.item_count = item_count;
}
public int getBudget() {
    return budget;
}
public void setBudget(int budget) {
    this.budget = budget;
}
public String getProd_list() {
    return prod_list;
}
public void setProd_list(String prod_list) {
    this.prod_list = prod_list;
}
public String getProd_start() {
    return prod_start;
}
public void setProd_start(String prod_start) {
    this.prod_start = prod_start;
}
public String getProd_end() {
    return prod_end;
}
public void setProd_end(String prod_end) {
    this.prod_end = prod_end;
}
public int getProd_id() {
    return prod_id;
}
public void setProd_id(int prod_id) {
    this.prod_id = prod_id;
}
public String getTitle() {
    return title;
}
public void setTitle(String title) {
    this.title = title;
}
public int getPrice() {
    return price;
}
public void setPrice(int price) {
    this.price = price;
}
public int getRating() {
    return rating;
}
public void setRating(int rating) {
    this.rating = rating;
}

public static int compare(item obj1, item obj2) {
    return 0;
}


}
    

