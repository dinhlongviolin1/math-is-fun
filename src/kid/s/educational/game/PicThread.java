/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kid.s.educational.game;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author Huong Ly
 */
public class PicThread extends Thread{

    public PicThread(Integer WaitTime, String PicURL, JLabel Label) {
        this.WaitTime = WaitTime;
        this.PicURL = PicURL;
        this.Label = Label;
    }
    
    private Integer WaitTime;
    private String PicURL;
    private JLabel Label;
    
    @Override
    public void run()
    {
        Label.setIcon(Help.imgicn("src/Database/Background/"+PicURL, 1139, 640));
        try {
            Thread.sleep(WaitTime);
        } catch (InterruptedException ex) {
            Logger.getLogger(PicThread.class.getName()).log(Level.SEVERE, null, ex);
        }
        Label.setIcon(Help.imgicn("src/Database/Background/BlackBackground.jpg", 1139, 640));
    }

    /**
     * Get the value of Label
     *
     * @return the value of Label
     */
    public JLabel getLabel() {
        return Label;
    }

    /**
     * Set the value of Label
     *
     * @param Label new value of Label
     */
    public void setLabel(JLabel Label) {
        this.Label = Label;
    }


    /**
     * Get the value of PicURL
     *
     * @return the value of PicURL
     */
    public String getPicURL() {
        return PicURL;
    }

    /**
     * Set the value of PicURL
     *
     * @param PicURL new value of PicURL
     */
    public void setPicURL(String PicURL) {
        this.PicURL = PicURL;
    }


    /**
     * Get the value of WaitTime
     *
     * @return the value of WaitTime
     */
    public Integer getWaitTime() {
        return WaitTime;
    }

    /**
     * Set the value of WaitTime
     *
     * @param WaitTime new value of WaitTime
     */
    public void setWaitTime(Integer WaitTime) {
        this.WaitTime = WaitTime;
    }

}
