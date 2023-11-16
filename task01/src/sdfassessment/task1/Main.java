package sdfassessment.task1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Locale.Category;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main{

    public static void main(String[]args) throws IOException  {
        if (args.length<=0) {
            System.out.println("Please insert CSV file");
            System.exit(1);
        }

        System.out.println("Proceeding to read file");


         FileReader fr= new FileReader(args[0]);
         BufferedReader br = new BufferedReader(fr);
         br.readLine();

         String row = br.readLine();
         while((row = br.readLine()) != null){
             String[] field  = row.trim().split(",");
             //printing out category name
             Set<String> CategoryName = new HashSet<>();
             CategoryName.add(field[1]);
          for(String category: CategoryName)
            System.out.println(CategoryName.iterator());
          }
        
        }
            //printing average ratings for one category
        public static void categorize(BufferedReader br) throws Exception  {
                br.readLine();
          
                String line;
                while (null != (line = br.readLine())) {
                String[] columns = line.trim().split(",");
                Header App = new Header(columns[0] , columns[1] , (Float.parseFloat(columns[2])));
                Header.getAvg(null, line);

                Map<Float, List<Header>> AppbyRating = new HashMap<>();
                Float Avg = Header.getAvg(null, line);
                int key = 0;
                for(Entry<Float, List<Header>> entry : AppbyRating.entrySet()){
                   System.out.printf("Average Rating:", Header.getCategory() );
                }
            }     
        }
               //print highest rated application and rating in category
            public static void max(String App, Float Rating){
                System.out.println("Highest");
                return ;
            }
    

            


            //print lowest rated application and rating in category
             public static void min(String App, Float Rating){
                System.out.println("Lowest");
                return;
            }


            //total number of applications for that category
            public static void collect (Header App){
                System.out.println("Count" + Integer.parseInt(Header.getCategory()));
            }

            //number of discarded records for that category
            
             //display the total number of lines read from the CSV file
            public  static void linesread (BufferedReader br) throws IOException{
                 
                     String str= br.readLine();
                     String[] columns = str.trim().split(",");
                    for( int i = 0;i < columns.length; i++){
                        int lines = columns.length;
                        System.out.println("Total lines in file: " + lines);
                    }
                    
                    }
                
            

            
            
        }
            
            
    



            //display the total number of lines read from the CSV file
            
        

        

    


                   
            
    
    


        
        
    


      
        
      
        
    
        
 

