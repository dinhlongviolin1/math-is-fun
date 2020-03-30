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
 * @author Dinh Long
 */
public class ThreadWelcomeFrame extends Thread{

    public ThreadWelcomeFrame(String URL, Integer WaitTime, JLabel lbl) {
        this.URL = URL;
        this.WaitTime = WaitTime;
        this.lbl = lbl;
    }

    
    
    
    private String URL;
    private Integer WaitTime;
    private JLabel lbl;

    /**
     * Get the value of lbl
     *
     * @return the value of lbl
     */
    public JLabel getLbl() {
        return lbl;
    }

    /**
     * Set the value of lbl
     *
     * @param lbl new value of lbl
     */
    public void setLbl(JLabel lbl) {
        this.lbl = lbl;
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


    /**
     * Get the value of URL
     *
     * @return the value of URL
     */
    public String getURL() {
        return URL;
    }

    /**
     * Set the value of URL
     *
     * @param URL new value of URL
     */
    public void setURL(String URL) {
        this.URL = URL;
    }
    
    @Override
    public void run()
    {
        try {
            Thread.sleep(WaitTime);
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadWelcomeFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        lbl.setIcon(Help.imgicn("src/Database/Background/"+URL, 1030, 570));
    }
}
