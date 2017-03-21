/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KhadimN
 */
 
public class Box {
    
   private double h,w,d;
   private boolean full;

public Box(double h,double w, double d,boolean full )
   {
    this.h=h;
    this.w=w;
    this.d=d;
    this.full=full;
   }
   
   public void setwidth(double w){
   this.w=w;
   }
   public void sethight(double h){
   
  this.h=h;
   }

   public void setdepth(double d){
  this.d=d;
   
   }
   public double gethight(){
   
   return h;
   }
   public double getwidth(){
   return w;
   }
   public double getdepth(){
   return w;
   }
   public void setfull(boolean full){
   
   this.full=full;
   
   }
   public boolean getfull(){
   
   return full;
   }
   
      public String toString(){
      
      return "hight of box:="+h+"width of Box="+w+"depth of Box is="+d;
              }
      
      }
           
             

