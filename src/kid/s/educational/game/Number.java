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
public class Number {

    public Number(Integer Numb, String NumbPicURL, String NumbVoiceURL) {
        this.Numb = Numb;
        this.NumbPicURL = NumbPicURL;
        this.NumbVoiceURL = NumbVoiceURL;
    }
    
    
    
    private Integer Numb;
    private String NumbPicURL;
    private String NumbVoiceURL;

    /**
     * Get the value of NumbVoiceURL
     *
     * @return the value of NumbVoiceURL
     */
    public String getNumbVoiceURL() {
        return NumbVoiceURL;
    }

    /**
     * Set the value of NumbVoiceURL
     *
     * @param NumbVoiceURL new value of NumbVoiceURL
     */
    public void setNumbVoiceURL(String NumbVoiceURL) {
        this.NumbVoiceURL = NumbVoiceURL;
    }


    /**
     * Get the value of NumbPicURL
     *
     * @return the value of NumbPicURL
     */
    public String getNumbPicURL() {
        return NumbPicURL;
    }

    /**
     * Set the value of NumbPicURL
     *
     * @param NumbPicURL new value of NumbPicURL
     */
    public void setNumbPicURL(String NumbPicURL) {
        this.NumbPicURL = NumbPicURL;
    }


    /**
     * Get the value of Numb
     *
     * @return the value of Numb
     */
    public Integer getNumb() {
        return Numb;
    }

    /**
     * Set the value of Numb
     *
     * @param Numb new value of Numb
     */
    public void setNumb(Integer Numb) {
        this.Numb = Numb;
    }

}
