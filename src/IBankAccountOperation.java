public interface IBankAccountOperation {
    void deposit(double d);
    void withdraw(double d);
    double processOperation(String message);







/* Deposit method takes as a parameter decimal d and adds it to the accounts.
    Withdraw method takes as a parameter decimal d and subtracts it from the accounts.
    ProcessOperation method takes as a parameter the string message and returns the balance.
    Function description:
    Create the BankOperations class and implement functions according
            to the IBankAccountOperation interface to process messages. */
}
