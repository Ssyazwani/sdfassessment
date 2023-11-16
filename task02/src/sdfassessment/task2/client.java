package sdfassessment.task2;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class client {

    public static void main(String[] args) {
        int port = 3000;
      String localhost = "";
      switch (args.length) {
         case 1:
            localhost = args[0];
            break;
         case 2:
            localhost = args[0];
            port = Integer.parseInt(args[1]);
            break;
         default:
            port = Integer.parseInt(args[0]);
      }
       Socket socket = new Socket();
       Program prog = new Program(socket);

       prog.start();



    }

           

           

        }
        
    



    
    

