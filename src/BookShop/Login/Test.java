/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BookShop.Login;

import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author bolem
 */
public class Test {

    /**
     * @param args the command line arguments
     * @throws com.microsoft.sqlserver.jdbc.SQLServerException
     */
    public static void main(String[] args) throws SQLServerException {
        System.out.println("\u274C");
        System.out.println("\u2714");
        FileOutputStream file = null;
        try {
            file = new FileOutputStream(
                "database.properties.txt", false);
        } catch (Exception e) {
        }
        System.out.println("\uD83D\uDFE2");
        
        
        
        
//        // Setting up the DataSource object
//        com.microsoft.sqlserver.jdbc.SQLServerDataSource  dataSource 
//            = new com.microsoft.sqlserver.jdbc.SQLServerDataSource();
//        dataSource.setServerName("localhost\\SQLXPRESS");
//        dataSource.setPortNumber(Integer.parseInt("1433"));
//        dataSource.setDatabaseName("BookShop");
//        dataSource.setUser("sa");
//        dataSource.setPassword("appleton7");
        
        
    }
    
}
