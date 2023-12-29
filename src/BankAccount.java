public class BankAccount {

    private double accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private long phoneNumber;

    public double getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(double accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double amount){
        double newBalance = getAccountBalance() + amount;
        setAccountBalance(newBalance);
        System.out.println("Remaining Balance = " + newBalance);
    }

    public void withdraw(double amount){
        double newBalance = getAccountBalance() - amount;
        if(newBalance < 0){
            System.out.println("Sorry, you don't have enough founds. Please try different amount.");
        }else{
            setAccountBalance(newBalance);
            System.out.println("Remaining Balance = " + newBalance);
        }
    }
    //adding random text to check git diff
}


