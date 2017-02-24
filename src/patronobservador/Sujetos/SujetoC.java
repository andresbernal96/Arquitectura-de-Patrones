/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronobservador.Sujetos;

import java.util.ArrayList;
import patronobservador.Observadores.Observer;

/**
 *
 * @author Andres Felipe Bernal
 */
public class SujetoC implements Subject{
    public ArrayList<Observer> Observadores;
    public String State;

    public SujetoC( String State) {
        this.Observadores = new ArrayList<Observer>();
        this.State = State;
    }
    public void setState(String State) {
        this.State = State;
        for (int i = 0; i <Observadores.size(); i++) {
            Observadores.get(i).update();
        }
       
    }
    
    @Override
    public void subscribe(Observer ob) {
    if(Observadores.add(ob)){
        System.out.println("Subscrito en el canal");
    }
     verSubscritos();
    }

    @Override
    public void deSubscribe(Observer ob) {
    Observadores.remove(ob);
    }

    @Override
    public String getState() {
        return this.State;
    }
    public void verSubscritos(){
        for (int i = 0; i < Observadores.size(); i++) {
            System.out.println(Observadores.get(i).getId());
        }
    }
}
