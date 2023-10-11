/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hamza_yahya_project;

/**
 *
 * @author yahya
 */
public class Recursionmethod {
    
    public static void main(String[] args) {
        
        
        sayHi(5);
    }
    
    public static void sayHi(int num){
        if (num == 0){
            System.out.println("Done!");
        } else{
            num--;
            System.out.println("Hi");
            sayHi(num);
        }
        
        
    }
}
