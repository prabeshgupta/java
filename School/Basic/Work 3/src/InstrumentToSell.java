public class InstrumentToSell extends Instrument {

    private double price;
    private String sellDate;
    private double discountPercent;
    private boolean isSold;

    InstrumentToSell(String instrumentName, double price) {
        super(instrumentName);
        this.price = price;
        this.sellDate = "";
        this.discountPercent = 0;
        this.isSold = false;
    }

    public double getPrice() {
        return price;
    }

    public String getSellDate() {
        return sellDate;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public boolean getIsSold() {
        return isSold;
    }

    public void setPrice(double price) {
        if (isSold == false) {
            this.price = price;
        } else {
            System.out.println("Not Possible to change price.");
        }
    }

    public void setSellDate(String sellDate) {
        this.sellDate = sellDate;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    public void setIsSold(boolean isSold) {
        this.isSold = isSold;
    }

    public void sellInstruments(String customerName, String customerMobileNumber, int customerPAN, String sellDate,
            double discountPercent) {
        if (isSold == true) {
            System.out.println("Instrument already sold to ");
            System.out.println("Customer Name: " + super.getCustomerName());
            System.out.println("Customer Phone number: " + super.getCustomerMobileNumber());
            System.out.println("Customer PAN: " + super.getCustomerPAN());
        } else {
            super.setCustomerName(customerName);
            super.setCustomerMobileNumber(customerMobileNumber);
            super.setCustomerPAN(customerPAN);
            this.sellDate = sellDate;
            this.discountPercent = discountPercent;
            this.isSold = true;
            this.price -= ((discountPercent / 100) * price);
        }
    }

    public void display() {
        super.display();

        System.out.println("Price: " + price);
        if (isSold == true) {
            System.out.println("Customer Name: " + super.getCustomerName());
            System.out.println("Customer Phone number: " + super.getCustomerMobileNumber());
            System.out.println("Customer PAN: " + super.getCustomerPAN());
            System.out.println("Sold date: " + sellDate);

        }
    }
}
