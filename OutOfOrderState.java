public class OutOfOrderState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine) {
        System.out.println("OUT OF ORDER");
    }

    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("OUT OF ORDER");
    }

    @Override
    public void dispense(VendingMachine machine) {
        System.out.println("OUT OF ORDER");
    }

    @Override
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("OUT OF ORDER ALREADY");
    }
}
