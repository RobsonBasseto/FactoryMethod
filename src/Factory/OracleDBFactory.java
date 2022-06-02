/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

import Model.DB;
import Model.OracleDB;

/**
 *
 * @author RROBASSETO
 */
public class OracleDBFactory extends DBFactory{

    @Override
    public DB CreateDB() {
        System.out.println("Criação do OracleDB");
        return new OracleDB();
    }
    
}
