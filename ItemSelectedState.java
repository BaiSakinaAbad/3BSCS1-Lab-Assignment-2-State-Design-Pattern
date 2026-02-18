public class ItemSelectedState implements  VendingMachineState{
    @Override
    public void selectItem(VendingMachineController machine) {
        System.out.println("Item selected.");
    }

    @Override
    public void insertCoin(VendingMachineController machine) {
        System.out.println("Coins accepted.");
        machine.setBalance(machine.getBalance() + 1.0);
        machine.setState(new DispensingState());
    }

    @Override
    public void dispense(VendingMachineController machine) {
        System.out.println("Insert coins first.");
    }

    @Override
    public void setOutOfOrder(VendingMachineController machine) {
        System.out.println("Out of order.");
        machine.setState(new OutOfOrderState());
    }
}
