package sdfassessment.task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Locale.Category;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main{

    public static void main(String[]args) {
        if (args.length<=0) {
            System.out.println("Please insert CSV file");
            System.exit(1);
        }

        System.out.println("Proceeding to read file");


        try { FileReader fr= new FileReader(args[0]);
         BufferedReader br = new BufferedReader(fr);
         br.readLine();

         String row = " ";
         while((row= br.readLine()) != null){
             String[] field  = row.trim().split(",");
             //printing out category name
             Set<String> CategoryName = new HashSet<>();
             CategoryName.add(field[1]);
          for(String category: CategoryName){
            System.out.println(CategoryName.iterator());
          }
            //printing average ratings for one category
            Map<String,List<Header>> classfied = br.lines() // br.readLine()
            .skip(1) // skipping the first line
            .map(line -> line.trim().split(","))
            .map(fields -> new Header(fields[2],fields[1]) ) //how to map a field to a Header
            .collect(Collectors.groupingBy(rating->rating.getCategory())); // grouping rating to a category, hence it is a list
            for( String Category: classfied.keySet()){
                List<Header> Rate = classfied.get(Category);// assigning a list of ratings to a key(category)
                System.out.printf("%s\n", Category);
                for (Header r : Rate){
                    Float Avg = (Float.parseFloat(r.getRating())/CategoryName.size());
                    ArrayList<Float> AvgRate = new ArrayList<>();
                }
              HashMap<String,List<Float>> Average = new HashMap<>(); {
                String category= myMapentrySet();
                ArrayList<Float> AvgRate = keySet();
                for (Entry<String, List<Float>> entry: Average.entrySet()){
                    System.out.println(entry.getKey()+":" + entry.getValue());
                }
              };
            }

            //print highest rated application and rating in category

            AppRate CateApp = new AppRate (args[0],args[2]);
            String Rating = CateApp.getRating();
            collect(Collectors.groupingBy(rating->((AppRate)rating).getRating()));

            HashMap<String,List<String>> Cate = new HashMap<>();
            String category= myMapentrySet();
            List<String> AppRate= (List<String>) Cate.keySet();
            collect(Collectors.groupingBy(rating->((AppRate)rating).getCategory()));



        


            //print lowest rated application and rating in category
             


            //total number of applications for that category
            Map<String,String> AppCate = new HashMap<String,String>();

            for (Entry<String, String> entry: AppCate.entrySet()){
                    System.out.println(entry.getKey()+":" + entry.getValue());
                }
            }
            
        
            



            //display the total number of lines read from the CSV file
            while(((row = br.readLine())!= null)){
                String[] lines = row.split(" ");
                int linesread = lines.length;

                System.out.printf("Total lines read ", linesread);
            }
    
           
            
        }




            
         
        
             catch (Exception e) {
           
            
        }
     
}
    
    
    



    private static void collect(Collector<Object, ?, Map<Object, List<Object>>> groupingBy) {
    }



    private static ArrayList<Float> keySet() {
        return null;
    }



    private static String myMapentrySet() {
        return null;
    }



    @Override
    public String toString() {
        return "Main []";
    }   
}
        
        
        
        
    
        
 

