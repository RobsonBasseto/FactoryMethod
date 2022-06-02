package Factory;

import Model.DB;
import Model.PostgresDB;


public class PostgresDBFactory extends DBFactory{

    @Override
    public DB CreateDB() {
        System.out.println("Criação do PostgresDB");
        return new PostgresDB();
    }
    
}
