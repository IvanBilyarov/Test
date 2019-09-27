/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 3bilyi81
 */
public class NewEmptyJUnitTest {
    String name = "Ivan";
    int age = 20;
    boolean isBirthday = true;
    int speed = 40;
    int speedLimit = 50;
    @Test
      public void hello()  {
      
      System.out.println("My name is Ivan");
      System.out.println("________");
      System.out.println("| o o |");
      System.out.println("| --- | < Hello! " + name);
      System.out.println("---------");
      System.out.println(name);
      System.out.println("My name is " + name + " and I am " + age + " years old!");
      System.out.println("You are " + age + " years old!");
      if (isBirthday = true){
              age = age + 1;
              System.out.println("Yay! It's your birthday! Now you are " + age);      
      }
      if (age >= 18) {
      System.out.println("That means you’re old enough to drink!");
      }
      if (age >= 20 || age <= 39) {
          System.out.println("You are in the 20s, 30s club!");
          
        }
      else {
      System.out.println("You are not in the 20s, 30s club!");
      }
      if (speed > 50){
      System.out.println("Your speed is" + speed + " , the speed limit is " + speedLimit + " You are speeding! Ticket for you!");
      }
      else {
      System.out.println("Please continue to drive safetly");
      }
      if (speed > speedLimit + 15){
      System.out.println("Your speed is" + speed + " If you continue driving with this speed there will be penalties ");
      }
      else if (speed < speedLimit + 15 && speed > speedLimit ) {
      System.out.println("Your speed is " + speed + " , the speed limit is " + speedLimit + " You are speeding! Ticket for you!");
      }
      else {
      System.out.println("Please continue to drive safetly");
      }
      }
      
}
