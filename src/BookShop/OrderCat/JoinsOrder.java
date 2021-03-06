
package BookShop.OrderCat;

import BookShop.Methods.GetConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JoinsOrder {
    GetConnection connect = new GetConnection();
    CompleteOrder co = new CompleteOrder();
    
    
    ////////////////////////////////////////////////////////////////////////////
    // JTable //
    
    // Init JTable Order - ROW 
    public Vector getOrderResumeRow() {
        Vector vector = new Vector();    
        String query =  "select ord.OrderDataNum,\n" +
                        "ord.OrderDataDate,\n" +
                        "ord.OrderDataInvoice,\n" +
                        "ord.OrderDataTerms,\n" +
                        "ord.OrderDataCustomerIp\n" +
                        "from OrderData ord";
            
        try {  
            Statement stmt = connect.connectURL().createStatement();
            ResultSet rs= stmt.executeQuery(query);
             
            Long lastOrder = null;
            
            while (rs.next()) {
                // Creation order 1
                if (lastOrder == null) {
                    CompleteOrder orde = new CompleteOrder(
                        rs.getLong("OrderDataNum"),
                        rs.getDate("OrderDataDate"),
                        rs.getString("OrderDataInvoice"),
                        rs.getString("OrderDataTerms"),
                        rs.getString("OrderDataCustomerIp"),
                        co.getBtn_Details());
                    vector.add(orde.getVectorOrdersResume()); // Init of values
                lastOrder = rs.getLong("OrderDataNum");
                }
                
                // Check if Order is alreay existing
                if (lastOrder != rs.getLong("OrderDataNum")) {
                    CompleteOrder orde = new CompleteOrder(
                        rs.getLong("OrderDataNum"),
                        rs.getDate("OrderDataDate"),
                        rs.getString("OrderDataInvoice"),
                        rs.getString("OrderDataTerms"),
                        rs.getString("OrderDataCustomerIp"),
                        co.getBtn_Details());

                    vector.add(orde.getVectorOrdersResume()); // Init of values
                    lastOrder = rs.getLong("OrderDataNum");
                }
            }
            return vector;
        } catch (SQLException ex) {
            Logger.getLogger(Orders.class.getName()).log(Level.SEVERE, null, ex);
        }      
        return vector;
    }
    
    public Vector getOrderResumeColumn() {
        Vector orderListColumn = new Vector();
            orderListColumn.add("Order number");
            orderListColumn.add("Date");
            orderListColumn.add("Invoice number");
            orderListColumn.add("Terms");
            orderListColumn.add("Customer Ip");
            orderListColumn.add("Edit");
            
            
            return orderListColumn;
    }
}