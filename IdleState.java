public class IdleState implements  VendingMachineState{

    @Override
    public void selectItem(VendingMachine machine) {
        if (machine.getInventory() > 0) {
            System.out.println("Item selected. Please insert coins.");
            machine.setState(new ItemSelectedState());
        } else {
            System.out.println("OUT OF STOCK");
            machine.setState(new OutOfOrderState());
        }
    }

    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("Select an item first.");
    }

    @Override
    public void dispense(VendingMachine machine) {
        System.out.println("Select an item first.");
    }

    @Override
    public void setOutOfOrder(VendingMachine machine) {
        machine.setState(new OutOfOrderState());
        System.out.println("OUT OF ORDER");
    }
}
