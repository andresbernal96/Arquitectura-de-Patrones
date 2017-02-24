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
public interface Observer {
    public String getId();
    public void update();
}
