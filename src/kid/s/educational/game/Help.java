/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kid.s.educational.game;

import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Huong Ly
 */
public class Help {
    public static ArrayList<Number> t1 = new ArrayList<>();
    public static Mark Plus = new Mark("+", "Plus.png", "Plus.mp3");
    public static Mark Minus = new Mark("-", "Minus.png", "Minus.mp3"); 
    public static Mark Equal = new Mark("=", "Equal.png", "Equal.mp3"); 
    public static Mark Bigger = new Mark(">", "Bigger.png", "Bigger.mp3"); 
    public static Mark Smaller = new Mark("<", "Smaller.png", "Smaller.mp3");
    public static Mark QuestionMark = new Mark("?", "QuestionMark.png", null);
    public static Boolean Sound = true;
    public static Boolean HomeIsOn = false;
    
    public static void InputData()
    {
        // Get Number
        t1 = new ArrayList<>();
        for(int i=1; i<21;i++)
        {
            Number a = new Number(i, i+".png", i+".mp3");
            t1.add(a);
        }  
    }
    public static ImageIcon imgicn(String URL, Integer w1, Integer w2)
    {
        ImageIcon imgThisImg1 = new ImageIcon(URL);
        Image Img1 = imgThisImg1.getImage().getScaledInstance(w1, w2,java.awt.Image.SCALE_SMOOTH);
        ImageIcon icon1 = new ImageIcon(Img1);
        return icon1;
    }
}
