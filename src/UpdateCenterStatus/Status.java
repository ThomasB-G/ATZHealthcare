/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UpdateCenterStatus;

/**
 *
 * @author russell
 */
public class Status {
    //Represents comments that could be entered describing the current status of the medcal center
    private String status;
    //Represents the actual epidemic level of the medical center
    private int statusLvl;

    public Status(String status, int statusLvl) {
        this.status = status;
        this.statusLvl = statusLvl;
    }
    public Status(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getStatusLvl() {
        return statusLvl;
    }

    public void setStatusLvl(int statusLvl) {
        this.statusLvl = statusLvl;
    }
    
    
}
