/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronConstructor.Objetos;

/**
 *
 * @author Labing
 */
public class SqlQ implements Query{

    @Override
    public void setWhere() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setFrom() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void execute() {
        
        System.out.println("Se ejecuto SqlQ");
    }
    
}
