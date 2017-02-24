/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronobservador.Sujetos;

import patronobservador.Observadores.Observer;

/**
 *
 * @author Andres Felipe Bernal
 */
public interface Subject {
    public void subscribe(Observer ob);
    public void deSubscribe(Observer ob);
    public String getState();
}
