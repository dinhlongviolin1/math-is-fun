/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kid.s.educational.game;

/**
 *
 * @author Huong Ly
 */
public class Mark {

    public Mark(String Mak, String MakPicURL, String MakVoiceURL) {
        this.Mak = Mak;
        this.MakPicURL = MakPicURL;
        this.MakVoiceURL = MakVoiceURL;
    }
    
    
    private String Mak;
    private String MakPicURL;
    private String MakVoiceURL;

    /**
     * Get the value of MakVoiceURL
     *
     * @return the value of MakVoiceURL
     */
    public String getMakVoiceURL() {
        return MakVoiceURL;
    }

    /**
     * Set the value of MakVoiceURL
     *
     * @param MakVoiceURL new value of MakVoiceURL
     */
    public void setMakVoiceURL(String MakVoiceURL) {
        this.MakVoiceURL = MakVoiceURL;
    }


    /**
     * Get the value of MakPicURL
     *
     * @return the value of MakPicURL
     */
    public String getMakPicURL() {
        return MakPicURL;
    }

    /**
     * Set the value of MakPicURL
     *
     * @param MakPicURL new value of MakPicURL
     */
    public void setMakPicURL(String MakPicURL) {
        this.MakPicURL = MakPicURL;
    }


    /**
     * Get the value of Mak
     *
     * @return the value of Mak
     */
    public String getMak() {
        return Mak;
    }

    /**
     * Set the value of Mak
     *
     * @param Mak new value of Mak
     */
    public void setMak(String Mak) {
        this.Mak = Mak;
    }

}
