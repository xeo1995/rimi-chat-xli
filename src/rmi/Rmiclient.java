/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.io.InputStream;
import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.Remote;
import java.rmi.dgc.Lease;
import java.util.Scanner;
import static javafx.application.Platform.exit;

/**
 *
 * @author omar
 */
public class Rmiclient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
  
        try {
          ServiceInterface r = (ServiceInterface)Naming.lookup("rmi://127.0.0.1:1090/service");
          while(1==1) {
            String reps =null;
            Scanner scanner = new Scanner(System. in); 
            System.out.print("[ME] : ");            
            String input = scanner. nextLine();  
                 reps=r.chat(input);
              //  while(reps!=null) {}
                System.out.println("[Server] :"+reps);
                
          }

        } catch (Exception e) {
            System.out.println("ERROR :"+e.getMessage()); 
            exit();
        }        

// TODO code application logic here
    }
    
}
