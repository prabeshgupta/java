public class InstrumentToRent extends Instrument {

    private double chargePerday;
    private String dateOfRent;
    private String dateOfReturn;
    private double noOfDays;
    private boolean isRented;

    InstrumentToRent(String instrumentName, double chargePerday) {
        super(instrumentName);
        this.chargePerday = chargePerday;
        this.dateOfRent = "";
        this.dateOfReturn = "";
        this.isRented = false;
        this.noOfDays = 0;
    }

    public double getChargePerDay() {
        return chargePerday;
    }

    public String getDateOfRent() {
        return dateOfRent;
    }

    public String getDateOfReturn() {
        return dateOfReturn;
    }

    public double getNoOfDays() {
        return noOfDays;
    }

    public boolean getIsRented() {
        return isRented;
    }

    public void setChargePerDay(double chargePerday) {
        this.chargePerday = chargePerday;
    }

    public void setDateOfRent(String dateOfRent) {
        this.dateOfRent = dateOfRent;
    }

    public void setDateOfReturn(String dateOfReturn) {
        this.dateOfReturn = dateOfReturn;
    }

    public void setNoOfDays(double noOfDays) {
        this.noOfDays = noOfDays;
    }

    public void setIsRented(boolean isRented) {
        this.isRented = isRented;
    }

    public void rentOut(String customerName, String customerMobileNumber, int customerPAN, String dateOfRent,
            String dateOfReturn, double noOfDays) {
        if (isRented == false) {
            System.out.println("Customer " + customerName + " return date is " + dateOfReturn + ". Phone number is "
                    + customerMobileNumber);
        } else {
            super.setCustomerName(customerName);
            super.setCustomerMobileNumber(customerMobileNumber);
            super.setCustomerPAN(customerPAN);

        }
        this.dateOfRent = dateOfRent;
        this.dateOfReturn = dateOfReturn;
        this.noOfDays = noOfDays;
        this.isRented = true;

    }

    public void totalCharge() {
        double total = noOfDays * chargePerday;
        System.out.println("Total charge: " + total);
    }

    public void returnInstruments() {
        if (isRented == false) {
            System.out.println("Not rented.");
        } else {
            super.setCustomerName("");
            super.setCustomerMobileNumber("");
            super.setCustomerPAN(0);
            dateOfReturn = "";
            dateOfRent = "";
            noOfDays = 0;
        }
    }

    public void display() {
        super.display();
        if (isRented == true) {
            System.out.println("Customer Name: " + super.getCustomerName());
            System.out.println("Customer Phone number: " + super.getCustomerMobileNumber());
            System.out.println("Customer PAN: " + super.getCustomerPAN());
            System.out.println("Renting Date: " + dateOfRent);
            System.out.println("Return Date: " + dateOfReturn);
        }
    }
}