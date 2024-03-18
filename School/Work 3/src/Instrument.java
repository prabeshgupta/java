public class Instrument {
    // Attributes with access modifier as private

    private int instrumentID;
    private String instrumentName;
    private String customerName;
    private String customerMobileNumber;
    private int customerPAN;

    // Parameterized Constructor

    Instrument(String instrumentName) {
        this.instrumentName = instrumentName;
        this.instrumentID = 0;
        this.customerName = "";
        this.customerMobileNumber = "";
        this.customerPAN = 0;
    }

    // Getter methods

    public int getInstrumentID() {
        return instrumentID;
    }

    public String getInstrumentName() {
        return instrumentName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerMobileNumber() {
        return customerMobileNumber;
    }

    public int getCustomerPAN() {
        return customerPAN;
    }

    // Setter methods

    public void setInstrumentID(int instrumentID) {
        this.instrumentID = instrumentID;
    }

    public void setInstrumentName(String instrumentName) {
        this.instrumentName = instrumentName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerMobileNumber(String customerMobileNumber) {
        this.customerMobileNumber = customerMobileNumber;
    }

    public void setCustomerPAN(int customerPAN) {
        this.customerPAN = customerPAN;
    }

    // Display method

    public void display() {
        System.out.println("Instrument ID: " + instrumentID);
        System.out.println("Instrument Name: " + instrumentName);

        if (customerName != "" && customerMobileNumber != "" && customerPAN != 0) {
            System.out.println("Customer Name: " + customerName);
            System.out.println("Customer Mobile Number: " + customerMobileNumber);
            System.out.println("Customer PAN: " + customerPAN);
        }
    }
}
