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
 
      }
      
}
