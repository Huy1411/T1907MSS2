public class Lab3_1_5_InvoiceItem {
    String id, desc;
    int qty;
    double unitPrice;

    public Lab3_1_5_InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double gettotal() {
        return unitPrice * qty;
    }
    public String toString() {
        return "InvoiceItem[id = " + id + ",desc = " + desc + ",qty =" + qty + ",unitPrice" + unitPrice + "]";
    }


}
