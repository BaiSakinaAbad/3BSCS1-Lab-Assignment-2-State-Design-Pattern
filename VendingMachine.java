public class VendingMachine {
    private VendingMachineState currentState;
    private int inventory;
    private int balance;

    public VendingMachine(int inventory) {
        this.inventory = inventory;
        this.balance = 0;
        this.currentState = (inventory > 0) ? new IdleState() : new OutOfOrderState();
    }


    public void setState(VendingMachineState state) {
        this.currentState = state;
    }
    public int getInventory() {
        return inventory;
    }
    public void setInventory(int inventory) {
        this.inventory = inventory;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }


    public void selectItem() {
        currentState.selectItem(this);
    }
    public void insertCoin() {
        currentState.insertCoin(this);
    }

    public void dispense() {
        currentState.dispense(this);
        if (currentState instanceof DispensingState) {
            currentState.dispense(this);
        }
    }
}