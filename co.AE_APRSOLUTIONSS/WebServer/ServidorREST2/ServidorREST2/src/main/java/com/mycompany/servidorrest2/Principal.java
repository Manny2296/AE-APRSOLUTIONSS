/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.servidorrest2;

import spark.Request;
import spark.Response;
import spark.Route;
import static spark.Spark.*;
/**
 *
 * @author Gabriel
 */
public class Principal {
    public static void main(String[] args) {
        
        get("/hola", new Route(){
    @Override
    public Object handle(Request request, Response response){
       return "Hola " + request.queryParams("name");
    } 
 });
    }

    
}
