public class OutOfOrderState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachineController machine) {
        System.out.println("OUT OF ORDER");
    }

    @Override
    public void insertCoin(VendingMachineController machine) {
        System.out.println("OUT OF ORDER");
    }

    @Override
    public void dispense(VendingMachineController machine) {
        System.out.println("OUT OF ORDER");
    }

    @Override
    public void setOutOfOrder(VendingMachineController machine) {
        System.out.println("OUT OF ORDER ALREADY");
    }
}
