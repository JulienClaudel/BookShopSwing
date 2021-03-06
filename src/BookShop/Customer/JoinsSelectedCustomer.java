
package BookShop.Customer;

import BookShop.Methods.GetConnection;
import BookShop.OrderCat.CompleteOrder;
import BookShop.OrderCat.Orders;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;


public class JoinsSelectedCustomer {
    GetConnection connect = new GetConnection();
    CompleteCustomer custo = new CompleteCustomer();
    
    int valueSelected;

    public JoinsSelectedCustomer(int valueSelected) {
        this.valueSelected = valueSelected;
    }
    
    public Vector getCustoData() {
        Vector vector = new Vector();     
        String query = "select custo.CustomerId,\n" +
                        "soc.SocialTitleId,\n" +
                        "addr.AddressLastname,\n" +
                        "addr.AddressFirstname,\n" +
                        "custo.CustomerMail,\n" +
                        "custo.CustomerBirthdate,\n" +
                        "custo.CustomerDateSignin,\n" +
                        "custo.CustomerNote,\n" +
                        "stat.StatusTypeLabel\n" +
                        "from CUSTOMER custo\n" +
                        "left join HasInvoiceAdr inv on (custo.CustomerId = inv.CustomerId)\n" +
                        "left join ADDRESS addr on (addr.AddressId = inv.AddressId)\n" +
                        "left join SOCIALTITLE soc on (soc.SocialTitleId = custo.SocialTitleId)\n" +
                        "left join SetCustomer setcusto on (setcusto.CustomerId = custo.CustomerId)\n" +
                        "left join STATUSTYPE stat on (stat.StatusTypeId = setcusto.StatusTypeId)"
                        + " where (custo.CustomerId = '" + valueSelected + "');";
            
        try {  
            Statement stmt = connect.connectURL().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            while (rs.next()) {
                vector.add(rs.getLong("CustomerId"));
                vector.add(rs.getLong("SocialTitleId"));
                vector.add(rs.getString("AddressLastname"));
                vector.add(rs.getString("AddressFirstname"));
                vector.add(rs.getString("CustomerMail"));
                vector.add(rs.getDate("CustomerBirthdate"));
                vector.add(rs.getDate("CustomerDateSignin"));
                vector.add(rs.getString("StatusTypeLabel"));
                vector.add(rs.getString("CustomerNote"));
            }
            return vector;
        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return vector;
    }
    
    public Vector getAdressCustoInvoiceData() {
        Vector vector = new Vector();     
        String query = "select *\n" +
                        "from Address addr\n" +
                        "inner join HasInvoiceAdr inv on (inv.AddressId = addr.AddressId)\n" +
                        "inner join Customer custo on (custo.CustomerId = inv.CustomerId)\n" +
                        "left join SetCustomer setc on (setc.CustomerId = custo.CustomerId)\n" +
                        "left join StatusType stat on (stat.StatusTypeId = setc.StatusTypeId)\n" +
                        "where (custo.CustomerId = " + valueSelected + ")\n" + 
                        "order by custo.CustomerId;";
            
        try {  
            Statement stmt = connect.connectURL().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            Long lastCusto = null;
            
            while (rs.next()) {
                //if (lastCusto == null) {
                    vector.add(rs.getLong("CustomerId"));
                    vector.add(rs.getLong("SocialTitleId"));
                    vector.add(rs.getString("AddressLastname"));
                    vector.add(rs.getString("AddressFirstname"));
                    vector.add(rs.getString("CustomerMail"));
                    vector.add(rs.getDate("CustomerBirthdate"));
                    vector.add(rs.getDate("CustomerDateSignin"));
                    vector.add(rs.getString("StatusTypeLabel"));
                    vector.add(rs.getString("CustomerNote"));
                    lastCusto = rs.getLong("CustomerId");
//                }
//                if (lastCusto != rs.getLong("CustomerId")) {
                    vector.add(rs.getLong("CustomerId"));
                    vector.add(rs.getLong("SocialTitleId"));
                    vector.add(rs.getString("AddressLastname"));
                    vector.add(rs.getString("AddressFirstname"));
                    vector.add(rs.getString("CustomerMail"));
                    vector.add(rs.getDate("CustomerBirthdate"));
                    vector.add(rs.getDate("CustomerDateSignin"));
                    vector.add(rs.getString("StatusTypeLabel"));
                    vector.add(rs.getString("CustomerNote"));
                    lastCusto = rs.getLong("CustomerId");
                //}
            }
            return vector;
        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return vector;
    }
    
    public Vector getAdressInvoiceData() {
        Vector vector = new Vector();     
        String query = "select *\n" +
                        "from Address addr\n" +
                        "left join HasInvoiceAdr inv on (addr.AddressId = inv.AddressId)\n" +
                        "left join customer custo on (custo.CustomerId = inv.CustomerId)\n" +
                        "where (custo.CustomerId = '" + valueSelected + "')" + 
                        "ORDER BY addr.AddressStreet ASC;";
            
        try {  
            Statement stmt = connect.connectURL().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            Long lastAddress = null;
            
            while (rs.next()) {
                if (lastAddress == null) {
                    vector.add(rs.getLong("AddressId"));
                    vector.add(rs.getLong("AddressLabel"));
                    vector.add(rs.getString("AddressCompany"));
                    vector.add(rs.getString("AddressStreet"));
                    vector.add(rs.getString("AddressStreet2"));
                    vector.add(rs.getDate("AddressZip"));
                    vector.add(rs.getDate("AddressCity"));
                    vector.add(rs.getString("AddressCountry"));
                    vector.add(rs.getString("AddressPhone"));
                    vector.add(rs.getString("AddressStatus"));
                    vector.add(rs.getString("AddressNote"));
                    lastAddress = rs.getLong("AddressId");
                }
                if (lastAddress != rs.getLong("AddressId")) {
                    vector.add(rs.getLong("AddressId"));
                    vector.add(rs.getLong("AddressLabel"));
                    vector.add(rs.getString("AddressCompany"));
                    vector.add(rs.getString("AddressStreet"));
                    vector.add(rs.getString("AddressStreet2"));
                    vector.add(rs.getDate("AddressZip"));
                    vector.add(rs.getDate("AddressCity"));
                    vector.add(rs.getString("AddressCountry"));
                    vector.add(rs.getString("AddressPhone"));
                    vector.add(rs.getString("AddressStatus"));
                    vector.add(rs.getString("AddressNote"));
                    lastAddress = rs.getLong("AddressId");
                } 
            }
            return vector;
        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return vector;
    }
    
    public Vector getAdressDeliveryData() {
        Vector vector = new Vector();     
        String query = "select *\n" +
                        "from Address addr\n" +
                        "left join HasDelivAdr del on (addr.AddressId = del.AddressId)\n" +
                        "left join customer custo on (custo.CustomerId = del.CustomerId)\n" +
                        "where (custo.CustomerId = '" + valueSelected + "')" + 
                        "ORDER BY addr.AddressStreet ASC;";
            
        try {  
            Statement stmt = connect.connectURL().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            Long lastAddress = null;
            
            while (rs.next()) {
                if (lastAddress == null) {
                    vector.add(rs.getLong("AddressId"));
                    vector.add(rs.getString("AddressLabel"));
                    vector.add(rs.getString("AddressCompany"));
                    vector.add(rs.getString("AddressStreet"));
                    vector.add(rs.getString("AddressStreet2"));
                    vector.add(rs.getString("AddressZip"));
                    vector.add(rs.getString("AddressCity"));
                    vector.add(rs.getString("AddressCountry"));
                    vector.add(rs.getString("AddressPhone"));
                    vector.add(rs.getString("AddressStatus"));
                    vector.add(rs.getString("AddressNote"));
                    lastAddress = rs.getLong("AddressId");
                }
                if (lastAddress != rs.getLong("AddressId")) {
                    vector.add(rs.getLong("AddressId"));
                    vector.add(rs.getString("AddressLabel"));
                    vector.add(rs.getString("AddressCompany"));
                    vector.add(rs.getString("AddressStreet"));
                    vector.add(rs.getString("AddressStreet2"));
                    vector.add(rs.getString("AddressZip"));
                    vector.add(rs.getString("AddressCity"));
                    vector.add(rs.getString("AddressCountry"));
                    vector.add(rs.getString("AddressPhone"));
                    vector.add(rs.getString("AddressStatus"));
                    vector.add(rs.getString("AddressNote"));
                    lastAddress = rs.getLong("AddressId");
                } 
            }
            return vector;
        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return vector;
    }
    
    // Init JTable OrderCusto - ROW
    public Vector getDataRowOrderCusto(Long valueSelect) {
        Vector v = new Vector();
        String query = "select * from OrderData ord where CustomerId = " + valueSelect + ";";
        
        try { 
        Statement stmt = connect.connectURL().createStatement();
        ResultSet rs = stmt.executeQuery(query);
        
        while (rs.next()){
            CompleteCustomer order = new CompleteCustomer(
                    rs.getLong("CustomerId"),
                    rs.getString("OrderInvoice"),
                    rs.getDate("orderDate"),
                    rs.getString("OrderTotalAmount"),
                    rs.getString("PackageNumber"),
                    rs.getDate("DeliveryStatusDate"),
                    rs.getString("orderCustomerIp"),
                    custo.getBtn_Details());
            v.add(order.getVectorOrderCusto());
            }
            return v;
        } catch (SQLException ex) {
            Logger.getLogger(Orders.class.getName()).log(Level.SEVERE, null, ex);
        }      
        return v;
    }

    /////////////////////////////////////////////////////////////////////////////
    
    public int getValueSelected() {
        return valueSelected;
    }

    public void setValueSelected(int valueSelected) {
        this.valueSelected = valueSelected;
    }
    
    
    
}
