package sdfassessment.task2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Console;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Program {

    Socket socket = new Socket();

    public Program(Socket socket) {
        this.socket= socket;
    }

    public void main(String[] args) throws Exception {
        InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        OutputStream os = socket.getOutputStream();
        OutputStreamWriter ows = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(ows);

        boolean stop = false;
        Console cons = System.console();

        while (!stop) {
            String line = br.readLine();
            int count = 1;
            line = line.trim();
            if (line.length() <= 0)
               continue;
            String[]lines = line.split("\n");
            
            // item.getBudget();
            // item.getRating(), 
            // items.getPrice()
            
            


         bw.write(line);
         bw.flush();

            
        }
        
    }

    

}
