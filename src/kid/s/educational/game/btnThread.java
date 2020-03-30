/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kid.s.educational.game;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

/**
 *
 * @author Dinh Long
 */
public class btnThread extends Thread{

    public btnThread(Integer WaitTime, JButton btn) {
        this.WaitTime = WaitTime;
        this.btn = btn;
    }
    
    
    
    private Integer WaitTime;
    private JButton btn;

    /**
     * Get the value of btn
     *
     * @return the value of btn
     */
    public JButton getBtn() {
        return btn;
    }

    /**
     * Set the value of btn
     *
     * @param btn new value of btn
     */
    public void setBtn(JButton btn) {
        this.btn = btn;
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

    @Override
    public void run()
    {
        try {
            Thread.sleep(WaitTime);
        } catch (InterruptedException ex) {
            Logger.getLogger(btnThread.class.getName()).log(Level.SEVERE, null, ex);
        }
        btn.setVisible(true);
    }
}
