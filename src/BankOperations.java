import java.util.Scanner;

public class BankOperations implements IBankAccountOperation {

    private double balance;
    Scanner scanner = new Scanner(System.in);

    public BankOperations() {
        this.balance = 0;
    }

    @Override
    public void deposit(double d) {
        balance +=d;
    }

    @Override
    public void withdraw(double d) {
        if (balance >= d) {
            balance -=d;
        } else {
            System.out.println("Insufficient balance, withdraw request cancelled.");
        }

    }

    @Override
    public double processOperation(String message) {
        if (message.equals("see") || message.equals("show")) {
            System.out.println("Balance: " + balance);
        } else if (message.equals("deposit") || message.equals("put") || message.equals("invest") || message.equals("transfer")) {
            double d = scanner.nextDouble();
            deposit(d);
        } else if (message.equals("withdraw") || message.equals("pull")) {
            double d = scanner.nextDouble();
            withdraw(d);
        } else {
            System.out.println("No input detected");
        }
        return 0;
    }
}

   /* a chatbot processes customer queries and responses.
    it takes human sentences and translates them into simple operations.
        implements functions to take these sentences and make the process automatic.
    The initial balance is 0. perform the correct action when a keyword is encountered.
    Map keywords to actions. Action: show balance, Keyword: "see", "show", Action: deposit funds,
    Keyword: "deposit", "put", "invest", "transfer". Action: withdraw funds, Keywords: "withdraw", "pull".
    Note that if the action is deposit or withdraw funds, the user request word is followed by the amount.
    After each request is processed, the chatbot responds with the balance. If there is an insufficient balance,
    a withdrawal request is canceled and the balance remains unchanged.
    It is guaranteed that every sentence given by a customer is valid as defined above.
        BankOperations class: implement the IBankAccountOperation interface.
    The following methods will be used to create output:
            - Deposit method takes as a parameter decimal d and adds it to the accounts.
    Withdraw method takes as a parameter decimal d and subtracts it from the accounts.
    ProcessOperation method takes as a parameter the string message and returns the balance.
    Function description:
    Create the BankOperations class and implement functions according
    to the IBankAccountOperation interface to process messages. */