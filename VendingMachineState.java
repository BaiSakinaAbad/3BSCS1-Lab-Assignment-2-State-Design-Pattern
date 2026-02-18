public interface VendingMachineState {

        void selectItem(VendingMachineController machine);
        void insertCoin(VendingMachineController machine);
        void dispense(VendingMachineController machine);
        void setOutOfOrder(VendingMachineController machine);

}
