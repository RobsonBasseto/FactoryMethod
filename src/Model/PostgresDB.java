package Model;

public class PostgresDB extends DB{

    @Override
    public void getConnection() 
    {
        System.out.println("Conexão com o PostgreSQL");
    }
}
