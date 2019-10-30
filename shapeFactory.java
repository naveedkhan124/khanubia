/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4Q2;

/**
 *
 * @author fa16-bse-081
 */
public class shapeFactory extends abstractFactory{
    public void getShape(String s){
        if(s==null){
            System.out.println("No shape");
        }
        if(s.equalsIgnoreCase("circle")){
            new circle().draw();
        }
        if(s.equalsIgnoreCase("circle")){
            new circle().draw();
        }
    }
}
