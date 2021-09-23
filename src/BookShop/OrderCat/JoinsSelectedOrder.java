/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BookShop.OrderCat;

import BookShop.Methods.*;
import BookShop.Methods.GetConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

public class JoinsSelectedOrder {
    CompleteOrder co = new CompleteOrder();
    
    GetConnection connect = new GetConnection();
    
    ////////////////////////////////////////////////////////////////////////////
    // JTable //
    
    // Init Shipping Table - ROW 
    public Vector getVectorShippingRow(int valueSelected) {
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
    
    public Vector getVectorShippingColumn() {
        Vector orderListColumn = new Vector();
            orderListColumn.add("Delivery date");
            orderListColumn.add("Transporter");
            orderListColumn.add("Weight");
            orderListColumn.add("Shipping Cost");
            orderListColumn.add("Tracking number");
            
            return orderListColumn;
    }
    
    
    
    // Init Shipping Payment - ROW 
    public Vector getVectorPaymentRow(int valueSelected) {
        Vector vector = new Vector();    
        String query =  "select pack.PackageNumber, \n" +
                        "setpack.DeliveryStatusDate, \n" +
                        "trans.TransporterName, \n" +
                        "trans.TransporterWeightMax, \n" +
                        "trans.TransporterPrice \n" +
                        "from PACKAGE pack \n" +
                        "left join SETPACKAGE setpack on ( pack.PackageId = "+valueSelected+" and pack.PackageId = setpack.PackageId) \n" +
                        "left join TRANSPORTER trans on (pack.TransporterId = trans.TransporterId );";
            
        try {  
            Statement stmt = connect.connectURL().createStatement();
            ResultSet shippingRs= stmt.executeQuery(query);
             
            String lastShip = null;
            
            while (shippingRs.next()) {
                // Creation order 1
                if (lastShip == null) {
                    CompleteOrder ship = new CompleteOrder(
                        shippingRs.getString("PaymentStatusTransactionNum"),
                        shippingRs.getString("PaymentCorpName"),
                        shippingRs.getBigDecimal("OrderdataTotalAmount"),
                        shippingRs.getBigDecimal("PackageShippingCost"));

                    vector.add(ship.getVectorShipping()); // Init of values
                    lastShip = shippingRs.getString("PaymentStatusTransactionNum");
                }
                
                // Check if Order is alreay existing
                if (!lastShip.equals(shippingRs.getString("PackageNumber"))) {
                    CompleteOrder ship = new CompleteOrder(
                        shippingRs.getString("PaymentStatusTransactionNum"),
                        shippingRs.getString("PaymentCorpName"),
                        shippingRs.getBigDecimal("OrderdataTotalAmount"),
                        shippingRs.getBigDecimal("PackageShippingCost"));

                    vector.add(ship.getVectorShipping()); // Init of values
                    lastShip = shippingRs.getString("PaymentStatusTransactionNum");
                }
            }
            return vector;
        } catch (SQLException ex) {
            Logger.getLogger(Orders.class.getName()).log(Level.SEVERE, null, ex);
        }      
        return vector;
    }
    
    public Vector getVectorPaymentColumn() {
        Vector orderListColumn = new Vector();
            orderListColumn.add("PaymentStatusTransactionNum");
            orderListColumn.add("PaymentCorpName");//setpayment
            orderListColumn.add("OrderdataTotalAmount");
            orderListColumn.add("ShippingCost");
            orderListColumn.add("PaymentStatusTransactionNum");
            
            return orderListColumn;
    }
    
    
    ////////////////////////////////////////////////////////////////////////////
    // Get data //
    
    public Vector getOrderData(int valueSelected) {
        Vector vector = new Vector();    
        String query =  "select ord.OrderdataNum, \n" +
                        "ord.OrderdataDate, \n" +
                        "ord.OrderdataInvoice, \n" +
                        "ord.OrderdataTerms, \n" +
                        "ord.OrderdataDelivInstruct, \n" +
                        "ord.OrderdataDeparture, \n" +
                        "ord.OrderdataTotalAmount, \n" +
                        "ord.OrderdataCustomerIp, \n" +
                        "ord.OrderdataNote \n" +
                        "from OrderData ord \n" + 
                        " where ( ord.OrderdataNum = "+valueSelected+");";
            
        try {  
            Statement stmt = connect.connectURL().createStatement();
            ResultSet orderRs= stmt.executeQuery(query);
            
            while (orderRs.next()) {
                // Creation order 1
                        vector.add(orderRs.getInt("OrderdataNum"));
                        vector.add(orderRs.getDate("OrderdataDate"));
                        vector.add(orderRs.getString("OrderdataInvoice"));
                        vector.add(orderRs.getString("OrderdataTerms"));
                        vector.add(orderRs.getString("OrderdataDelivInstruct"));
                        vector.add(orderRs.getDate("OrderdataDeparture"));
                        vector.add(orderRs.getInt("OrderdataTotalAmount"));
                        vector.add(orderRs.getString("OrderdataCustomerIp"));
                        vector.add(orderRs.getString("OrderdataNote"));
            }
            return vector;
        } catch (SQLException ex) {
            Logger.getLogger(Orders.class.getName()).log(Level.SEVERE, null, ex);
    }      
    return vector;
    
    }
    
    public Vector getShipAddressData(int valueSelected) {
        Vector vector = new Vector();   
        String query =  "select adr.AddressId, \n" +
                        "adr.AddressLabel, \n" +
                        "adr.AddressCompany, \n" +
                        "adr.AddressLastname, \n" +
                        "adr.AddressFirstname, \n" +
                        "adr.AddressStreet, \n" +
                        "adr.AddressStreet2, \n" +
                        "adr.AddressZip, \n" +
                        "adr.AddressCity, \n" +
                        "adr.AddressCountry, \n" +
                        "adr.AddressPhone, \n" +
                        "adr.AddressNote, \n" +
                        "CONCAT (AddressFirstname , ' ' ,AddressLastname) as Name \n" +
                        "from Address adr, OrderData ord  \n" +
                        " where ( adr.AddressId = ord.AddAddressid and ord.OrderdataNum = "+valueSelected+")";
            
        try {  
            Statement stmt = connect.connectURL().createStatement();
            ResultSet orderRs= stmt.executeQuery(query);
            
            while (orderRs.next()) {
                // Creation order 1
                        vector.add(orderRs.getLong("AddressId"));
                        vector.add(orderRs.getString("Name"));
                        vector.add(orderRs.getString("AddressLabel"));
                        vector.add(orderRs.getString("AddressCompany"));
                        vector.add(orderRs.getString("AddressLastname"));
                        vector.add(orderRs.getString("AddressFirstname"));
                        vector.add(orderRs.getString("AddressStreet"));
                        vector.add(orderRs.getString("AddressStreet2"));
                        vector.add(orderRs.getString("AddressZip"));
                        vector.add(orderRs.getString("AddressCity"));
                        vector.add(orderRs.getString("AddressCountry"));
                        vector.add(orderRs.getString("AddressPhone"));
                        vector.add(orderRs.getString("AddressNote"));
                        
            }
            return vector;
        } catch (SQLException ex) {
            Logger.getLogger(Orders.class.getName()).log(Level.SEVERE, null, ex);
    }      
    return vector;
    
    }
    
    public Vector getDelAddressData(int valueSelected) {
        Vector vector = new Vector();   
        String query =  "select adr.AddressId, \n" +
                        "adr.AddressLabel, \n" +
                        "adr.AddressCompany, \n" +
                        "adr.AddressLastname, \n" +
                        "adr.AddressFirstname, \n" +
                        "adr.AddressStreet, \n" +
                        "adr.AddressStreet2, \n" +
                        "adr.AddressZip, \n" +
                        "adr.AddressCity, \n" +
                        "adr.AddressCountry, \n" +
                        "adr.AddressPhone, \n" +
                        "adr.AddressNote, \n" +
                        "CONCAT (AddressFirstname , ' ' ,AddressLastname) as Name \n" +
                        "from Address adr, OrderData ord  \n" +
                        " where ( adr.AddressId = ord.AddressId and ord.OrderdataNum = "+valueSelected+")";
            
        try {  
            Statement stmt = connect.connectURL().createStatement();
            ResultSet orderRs= stmt.executeQuery(query);
            
            while (orderRs.next()) {
                // Creation order 1
                        vector.add(orderRs.getLong("AddressId"));
                        vector.add(orderRs.getString("Name"));
                        vector.add(orderRs.getString("AddressLabel"));
                        vector.add(orderRs.getString("AddressCompany"));
                        vector.add(orderRs.getString("AddressLastname"));
                        vector.add(orderRs.getString("AddressFirstname"));
                        vector.add(orderRs.getString("AddressStreet"));
                        vector.add(orderRs.getString("AddressStreet2"));
                        vector.add(orderRs.getString("AddressZip"));
                        vector.add(orderRs.getString("AddressCity"));
                        vector.add(orderRs.getString("AddressCountry"));
                        vector.add(orderRs.getString("AddressPhone"));
                        vector.add(orderRs.getString("AddressNote"));
            }
            return vector;
        } catch (SQLException ex) {
            Logger.getLogger(Orders.class.getName()).log(Level.SEVERE, null, ex);
    }      
    return vector;
    
    }

    public GetConnection getConnect() {
        return connect;
    }

    public void setConnect(GetConnection connect) {
        this.connect = connect;
    }

   

    
}
