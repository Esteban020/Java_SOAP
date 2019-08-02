/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ws.packages;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.swing.JOptionPane;
/**
 *
 * @author esteban.gomez
 */
@WebService(serviceName = "WS1")
public class WS1 {

    /**
     * This is a sample web service operation
     */
private int re;
    @WebMethod(operationName = "Agregar")
    
    public int Clientes (@WebParam(name="N_1")int n1,@WebParam(name="N_2")int n2)
    {
      return re=n1*n2;
      
              
      }
    

    
    
   /* public String sayHello(@WebParam(name="say")String name)
    {
        return "Hi, "+name+" !";
    }*/
    

}
