
public class Main {

    public static void main(String[] args) {
        // Your job is to create a simple banking application.
        // There should be a Bank class
        // It should have an arraylist of Branches
        // Each Branch should have an arraylist of Customers
        // The Customer class should have an arraylist of Doubles (transactions)
        // Customer:
        // Name, and the ArrayList of doubles.
        // Branch:
        // Need to be able to add a new customer and initial transaction amount.
        // Also needs to add additional transactions for that customer/branch
        // Bank:
        // Add a new branch
        // Add a customer to that branch with initial transaction
        // Add a transaction for an existing customer for that branch
        // Show a list of customers for a particular branch and optionally a list
        // of their transactions
        // Demonstration autoboxing and unboxing in your code
        // Hint: Transactions
        // Add data validation.
        // e.g. check if exists, or does not exist, etc.
        // Think about where you are adding the code to perform certain actions

        Bank bank = new Bank("National Australia Bank");

        if (bank.addBranch("USA")) {
            System.out.println("Adelaide branch created");
        }

        bank.addCustomer("USA", "Tim", 50.05);
        bank.addCustomer("USA", "Mike", 175.34);
        bank.addCustomer("USA", "Percy", 220.12);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "Bob", 150.54);

        bank.addCustomerTransaction("USA", "Tim", 44.22);
        bank.addCustomerTransaction("USA", "Tim", 12.44);
        bank.addCustomerTransaction("USA", "Mike", 1.65);

        bank.listCustomers("USA", true);
        bank.listCustomers("Sydney", true);

        bank.addBranch("Polish");

        if (!bank.addCustomer("Polish", "Brian", 5.53)) {
            System.out.println("Error Polish branch does not exist");
        }

        if (!bank.addBranch("USA")) {
            System.out.println("Adelaide branch already exists");
        }

        if (!bank.addCustomerTransaction("USA", "Fergus", 52.33)) {
            System.out.println("Customer does not exist at branch");
        }

        if (!bank.addCustomer("USA", "Tim", 12.21)) {
            System.out.println("Customer Tim already exists");
        }

    }
}
