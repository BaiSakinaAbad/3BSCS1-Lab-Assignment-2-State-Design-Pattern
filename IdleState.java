public class IdleState implements  VendingMachineState{

    @Override
    public void selectItem(VendingMachineController machine) {
        if (machine.getInventory() > 0) {
            System.out.println("Item selected. Please insert coins.");
            machine.setState(new ItemSelectedState());
        } else {
            System.out.println("OUT OF STOCK");
            machine.setState(new OutOfOrderState());
        }
    }

    @Override
    public void insertCoin(VendingMachineController machine) {
        System.out.println("Select an item first.");
    }

    @Override
    public void dispense(VendingMachineController machine) {
        System.out.println("Select an item first.");
    }

    @Override
    public void setOutOfOrder(VendingMachineController machine) {
        machine.setState(new OutOfOrderState());
        System.out.println("OUT OF ORDER");
    }
}
