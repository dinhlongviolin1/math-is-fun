/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kid.s.educational.game;

;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jlgui.basicplayer.*;

/**
 *
 * @author Huong Ly
 */


public class VoiceThread extends Thread {

    public VoiceThread(Integer WaitTime, String VoiceURL, Integer WaitTimeAudio) {
        this.WaitTime = WaitTime;
        this.VoiceURL = VoiceURL;
        this.WaitTimeAudio = WaitTimeAudio;
    }

    private Integer WaitTime;
    private String VoiceURL;
    private Boolean Running;
    private Integer WaitTimeAudio;
    private Boolean Repeat = false;

    public void setRepeat(Boolean n) {
        this.Repeat = n;
    }

    /**
     * Get the value of WaitTimeAudio
     *
     * @return the value of WaitTimeAudio
     */
    public Integer getWaitTimeAudio() {
        return WaitTimeAudio;
    }

    /**
     * Set the value of WaitTimeAudio
     *
     * @param WaitTimeAudio new value of WaitTimeAudio
     */
    public void setWaitTimeAudio(Integer WaitTimeAudio) {
        this.WaitTimeAudio = WaitTimeAudio;
    }

    public Boolean IsRunning() {
        return Running;
    }

    /**
     * Get the value of VoiceURL
     *
     * @return the value of VoiceURL
     */
    public String getVoiceURL() {
        return VoiceURL;
    }

    /**
     * Set the value of VoiceURL
     *
     * @param VoiceURL new value of VoiceURL
     */
    public void setVoiceURL(String VoiceURL) {
        this.VoiceURL = VoiceURL;
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
    
    
    public BasicPlayer player= null;
    @Override
    public void run() {
        if (Repeat == false) {
            try {
                Running = true;
                Thread.sleep(WaitTime);
                String songName = VoiceURL;
                String pathToMp3 = System.getProperty("user.dir") + "/src/Database/Audio/" + songName;
                player = new BasicPlayer();
                try {
                    System.out.println(pathToMp3);
                    try {
                       
                        player.open(new URL("file:///" + pathToMp3));
                    } catch (MalformedURLException ex) {
                        Logger.getLogger(VoiceThread.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    player.play();
                    Thread.sleep(WaitTimeAudio);
                    Running = false;
                } catch (BasicPlayerException e) {
                    e.printStackTrace();
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(VoiceThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    Running = true;
                    Thread.sleep(WaitTime);
                    String songName = VoiceURL;
                    String pathToMp3 = System.getProperty("user.dir") + "/src/Database/Audio/" + songName;
                    BasicPlayer player = new BasicPlayer();
                    try {
                        System.out.println(pathToMp3);
                        try {
                            player.open(new URL("file:///" + pathToMp3));
                        } catch (MalformedURLException ex) {
                            Logger.getLogger(VoiceThread.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        player.play();
                        Thread.sleep(WaitTimeAudio);
                        Running = false;
                    } catch (BasicPlayerException e) {
                        e.printStackTrace();
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(VoiceThread.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
