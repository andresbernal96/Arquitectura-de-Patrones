/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronConstructor.Builder;

import PatronConstructor.Objetos.Query;

/**
 *
 * @author Labing
 */
public interface QBuilder {
    public void build();
    public void setWhere();
    public void setFrom();
    public Query getResult();
    
}
