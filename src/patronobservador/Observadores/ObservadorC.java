/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronobservador.Observadores;

import patronobservador.Sujetos.Subject;

/**
 *
 * @author Andres Felipe Bernal
 */
public class ObservadorC implements Observer{
    public Subject ob;
    public String id;

    public ObservadorC(Subject ob, String id) {
        this.ob = ob;
        this.id = id;
    }

    public String getId() {
        return id;
    }
    
    public void update() {
        System.out.println(ob.getState()+" "+id);
    }
    
}
