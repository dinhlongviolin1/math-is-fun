/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kid.s.educational.game;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Huong Ly
 */
public class NormalThread extends Thread{

    public NormalThread(Integer WaitTime) {
        this.WaitTime = WaitTime;
    }
    
    private Integer WaitTime;
    
    @Override
    public void run()
    {
        try {
            Thread.sleep(WaitTime);
        } catch (InterruptedException ex) {
            Logger.getLogger(NormalThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Get the value of WaitTIme
     *
     * @return the value of WaitTIme
     */
    public Integer getWaitTime() {
        return WaitTime;
    }

    /**
     * Set the value of WaitTIme
     *
     * @param WaitTime new value of WaitTIme
     */
    public void setWaitTime(Integer WaitTime) {
        this.WaitTime = WaitTime;
    }

}
