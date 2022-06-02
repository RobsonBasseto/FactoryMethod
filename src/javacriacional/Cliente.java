
package javacriacional;

import Factory.DBFactory;
import Factory.OracleDBFactory;
import Factory.PostgresDBFactory;
import Model.DB;

public class Cliente {

   
    public static void main(String[] args) {
       DBFactory  OracleDBFactory = new OracleDBFactory();
       
             
       DB Oracledb = OracleDBFactory.orderDB();
        System.out.println(Oracledb);
        
       DBFactory PostgresDBFactory = new PostgresDBFactory();
       
       DB Posgresdb = PostgresDBFactory.orderDB();
        System.out.println(Posgresdb);
    }
    
}
