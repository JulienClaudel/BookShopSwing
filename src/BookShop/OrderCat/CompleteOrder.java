package BookShop.OrderCat;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Vector;
import javax.swing.JButton;

/**
 *
 * @author gregs
 */
public class CompleteOrder {
    private Long orderNum;
    private Date orderDate, DeliveryStatusDate, PaymentStatusDate;
    private BigDecimal PackageShippingCost, OrderdataTotalAmount;
    private String PackageNumber, OrderInvoice, orderTerms, orderCustomerIp, TransporterName, PaymentStatusLabel, CustomerMail, CmdLineBookIsbn, PaymentCorpName, PaymentStatusTransactionNum ;
    private int PackageLength, PackageHeight, PackageWeight, PackageWidth, OrderTotalAmount, BookPrice, CmdLineQty, BookStock, TotalAmountBookQty, TransporterWeightMax, TransporterPrice, ValueSelected; ;
    private JButton btn_Details = new JButton("Details");
    
    public CompleteOrder() {
    }
    
    ///Table OrdersResume Constructor///
    public CompleteOrder(Long orderNum, Date orderDate, String orderInvoice, String orderTerms, String orderCustomerIp, JButton btn_Details) {
        this.orderNum = orderNum;
        this.orderDate = orderDate;
        this.OrderInvoice = orderInvoice;
        this.orderTerms = orderTerms;
        this.orderCustomerIp = orderCustomerIp;
        this.btn_Details = btn_Details;
    }
    
    ///Table shipping///
    public CompleteOrder(Date DeliveryStatusDate, String TransporterName, int PackageWeight, BigDecimal PackageShippingCost, String PackageNumber ) {
        this.DeliveryStatusDate = DeliveryStatusDate;
        this.TransporterName = TransporterName;
        this.PackageWeight = PackageWeight;
        this.PackageShippingCost = PackageShippingCost;
        this.PackageNumber = PackageNumber;
    }   
    
    ///Table payment///
    public CompleteOrder(String PaymentStatusTransactionNum, String PaymentCorpName, BigDecimal OrderdataTotalAmount, BigDecimal PackageShippingCost ) {
        this.PaymentStatusTransactionNum = PaymentStatusTransactionNum;
        this.PaymentCorpName = PaymentCorpName;
        this.OrderdataTotalAmount = OrderdataTotalAmount;
        this.PackageShippingCost = PackageShippingCost;
        this.PaymentStatusTransactionNum = PaymentStatusTransactionNum;
    }   
    
    
    ///Table Products///
    public CompleteOrder(String CmdLineBookIsbn, int BookPrice, int CmdLineQty, int BookStock, int TotalAmountBookQty ) {
        this.CmdLineBookIsbn = CmdLineBookIsbn;
        this.BookPrice = BookPrice;
        this.CmdLineQty = CmdLineQty;
        this.BookStock = BookStock;
        this.TotalAmountBookQty = TotalAmountBookQty;
        
    }   
    
    ///Email Customer///
    public CompleteOrder(String CustomerMail ) {
        this.CustomerMail = CustomerMail;
    }   

    ////////////////////////////////////////////////////////////////////////////
    // JTable //
    
// Init JTable OrdersResume - VALUES
    public Vector getVectorOrdersResume() {
        Vector v = new Vector();
            v.add(this.getOrderNum());
            v.add(this.getOrderDate());
            v.add(this.getOrderInvoice());
            v.add(this.getOrderTerms());
            v.add(this.getOrderCustomerIp());
            v.add(this.getBtn_Details());
            
            return v;
    }
    
    // Init JTable shipping - VALUES
    public Vector getVectorShipping() {
        Vector v = new Vector();
            v.add(this.getDeliveryStatusDate());
            v.add(this.getTransporterName());
            v.add(this.getPackageWeight());
            v.add(this.getPackageShippingCost());
            v.add(this.getPackageNumber());
            
            return v;
    }
    
   
    
    // Init JTable payment - VALUES
    public Vector getVectorPayment() {
        Vector v = new Vector();
            v.add(this.getPaymentStatusDate());
            v.add(this.getPaymentStatusLabel());
            v.add(this.getPaymentStatusTransactionNum());
            v.add(this.getOrderTotalAmount());
            v.add(this.getOrderInvoice());
            
            return v;
    }
    
    // Init JTable products - VALUES
    public Vector getVectorProducts() {
        Vector v = new Vector();
            v.add(this.getCmdLineBookIsbn());
            v.add(this.getBookPrice());
            v.add(this.getCmdLineQty());
            v.add(this.getBookStock());
            v.add(this.getTotalAmountBookQty());
            
            return v;
    }

    public String getCustomerMail() {
        return CustomerMail;
    }
    
    
    
    ////////////////////////////////////////////////////////////////////////////
    public Long getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Long orderNum) {
        this.orderNum = orderNum;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getDeliveryStatusDate() {
        return DeliveryStatusDate;
    }

    public void setDeliveryStatusDate(Date DeliveryStatusDate) {
        this.DeliveryStatusDate = DeliveryStatusDate;
    }

    public Date getPaymentStatusDate() {
        return PaymentStatusDate;
    }

    public void setPaymentStatusDate(Date PaymentStatusDate) {
        this.PaymentStatusDate = PaymentStatusDate;
    }

    public String getPackageNumber() {
        return PackageNumber;
    }

    public void setPackageNumber(String PackageNumber) {
        this.PackageNumber = PackageNumber;
    }

    public String getOrderInvoice() {
        return OrderInvoice;
    }

    public void setOrderInvoice(String OrderInvoice) {
        this.OrderInvoice = OrderInvoice;
    }

    public String getOrderTerms() {
        return orderTerms;
    }

    public void setOrderTerms(String orderTerms) {
        this.orderTerms = orderTerms;
    }

    public String getOrderCustomerIp() {
        return orderCustomerIp;
    }

    public void setOrderCustomerIp(String orderCustomerIp) {
        this.orderCustomerIp = orderCustomerIp;
    }

    public String getTransporterName() {
        return TransporterName;
    }

    public void setTransporterName(String TransporterName) {
        this.TransporterName = TransporterName;
    }

    public String getPaymentStatusLabel() {
        return PaymentStatusLabel;
    }

    public void setPaymentStatusLabel(String PaymentStatusLabel) {
        this.PaymentStatusLabel = PaymentStatusLabel;
    }

    public JButton getBtn_Details() {
        return btn_Details;
    }

    public void setBtn_Details(JButton btn_Details) {
        this.btn_Details = btn_Details;
    }

    public int getPackageLength() {
        return PackageLength;
    }

    public void setPackageLength(int PackageLength) {
        this.PackageLength = PackageLength;
    }

    public int getPackageHeight() {
        return PackageHeight;
    }

    public void setPackageHeight(int PackageHeight) {
        this.PackageHeight = PackageHeight;
    }

    public int getPackageWidth() {
        return PackageWidth;
    }

    public void setPackageWidth(int PackageWidth) {
        this.PackageWidth = PackageWidth;
    }

    public BigDecimal getPackageShippingCost() {
        return PackageShippingCost;
    }

    public void setPackageShippingCost(BigDecimal PackageShippingCost) {
        this.PackageShippingCost = PackageShippingCost;
    }

    public String getPaymentStatusTransactionNum() {
        return PaymentStatusTransactionNum;
    }

    public void setPaymentStatusTransactionNum(String PaymentStatusTransactionNum) {
        this.PaymentStatusTransactionNum = PaymentStatusTransactionNum;
    }

    public int getOrderTotalAmount() {
        return OrderTotalAmount;
    }

    public void setOrderTotalAmount(int OrderTotalAmount) {
        this.OrderTotalAmount = OrderTotalAmount;
    }

    public String getCmdLineBookIsbn() {
        return CmdLineBookIsbn;
    }

    public void setCmdLineBookIsbn(String CmdLineBookIsbn) {
        this.CmdLineBookIsbn = CmdLineBookIsbn;
    }

    public int getBookPrice() {
        return BookPrice;
    }

    public void setBookPrice(int BookPrice) {
        this.BookPrice = BookPrice;
    }

    public int getCmdLineQty() {
        return CmdLineQty;
    }

    public void setCmdLineQty(int CmdLineQty) {
        this.CmdLineQty = CmdLineQty;
    }

    public int getBookStock() {
        return BookStock;
    }

    public void setBookStock(int BookStock) {
        this.BookStock = BookStock;
    }

    public int getTotalAmountBookQty() {
        return TotalAmountBookQty;
    }

    public void setTotalAmountBookQty(int TotalAmountBookQty) {
        this.TotalAmountBookQty = TotalAmountBookQty;
    }

    public int getTransporterWeightMax() {
        return TransporterWeightMax;
    }

    public void setTransporterWeightMax(int TransporterWeightMax) {
        this.TransporterWeightMax = TransporterWeightMax;
    }

    public int getTransporterPrice() {
        return TransporterPrice;
    }

    public void setTransporterPrice(int TransporterPrice) {
        this.TransporterPrice = TransporterPrice;
    }

    public BigDecimal getOrderdataTotalAmount() {
        return OrderdataTotalAmount;
    }

    public void setOrderdataTotalAmount(BigDecimal OrderdataTotalAmount) {
        this.OrderdataTotalAmount = OrderdataTotalAmount;
    }

    public String getPaymentCorpName() {
        return PaymentCorpName;
    }

    public void setPaymentCorpName(String PaymentCorpName) {
        this.PaymentCorpName = PaymentCorpName;
    }

    public int getPackageWeight() {
        return PackageWeight;
    }

    public void setPackageWeight(int PackageWeight) {
        this.PackageWeight = PackageWeight;
    }

    public int getValueSelected() {
        return ValueSelected;
    }

    public void setValueSelected(int ValueSelected) {
        this.ValueSelected = ValueSelected;
    }
    
    

   

    
}
