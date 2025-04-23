package myapp;

class Konto {
    private String accountNumber;
    private double availableFunds;
    private String ownerName;
    private String email;
    private String phoneNumber;

    public Konto(String accountNumber, double availableFunds, String ownerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.availableFunds = availableFunds;
        this.ownerName = ownerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAvailableFunds() {
        return availableFunds;
    }

    public void setAvailableFunds(double availableFunds) {
        this.availableFunds = availableFunds;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositAmount(double amount) {
        availableFunds += amount;
        System.out.println("Deposit PLN " + amount + " completed. New balance PLN " + availableFunds);
    }

    public void withdrawAmount(double amount) {
        if (amount <= availableFunds) {
            availableFunds -= amount;
            System.out.println("Withdrawn PLN " + amount + " from account, Remaining balance = PLN " + availableFunds);
        } else {
            System.out.println("Insufficient funds. You have PLN " + availableFunds + " in your account.");
        }
    }
}
