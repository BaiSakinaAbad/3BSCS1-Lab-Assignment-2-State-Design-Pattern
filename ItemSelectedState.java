public class ItemSelectedState implements  VendingMachineState{
    @Override
    public void selectItem(VendingMachine machine) {
        System.out.println("Item selected.");
    }

    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("Coins accepted.");
        machine.setBalance(machine.getBalance() + 1);
        machine.setState(new DispensingState());
    }

    @Override
    public void dispense(VendingMachine machine) {
        System.out.println("Insert coins first.");
    }

    @Override
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Out of order.");
        machine.setState(new OutOfOrderState());
    }
}
