
package Factory;

import Model.DB;

public abstract class DBFactory {
    
    public DB orderDB()
    {
        DB device = null;
        
        device = CreateDB();
        device.getConnection();
        
        return device;
    }
    
    public abstract DB CreateDB();
}
