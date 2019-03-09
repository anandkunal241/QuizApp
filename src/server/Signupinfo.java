/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;


/**
 *
 * @author Kunal Anand
 */
import java.io.Serializable;

public class Signupinfo implements Serializable {
    private String NAME;
    private String BRANCH;
    private String COLLEGE;
    private String PASS;
   private String ID;

    public Signupinfo(String NAME, String BRANCH, String COLLEGE, String PASS, String ID) {
        this.NAME = NAME;
        this.BRANCH = BRANCH;
        this.COLLEGE = COLLEGE;
        this.PASS= PASS;
        this.ID= ID;
    }
    
    
    }

