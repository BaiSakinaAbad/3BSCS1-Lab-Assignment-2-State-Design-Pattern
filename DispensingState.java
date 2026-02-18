public class DispensingState implements  VendingMachineState{
    @Override
    public void selectItem(VendingMachineController machine) {
        System.out.println("Currently dispensing.... Cannot select another item.");
    }

    @Override
    public void insertCoin(VendingMachineController machine) {
        System.out.println("Currently dispensing.... Cannot insert another coin.");
    }

    @Override
    public void dispense(VendingMachineController machine) {
        machine.setInventory(machine.getInventory() - 1);
        machine.setBalance(0);
        System.out.println("Item is dispensing.... Completed!");

        if (machine.getInventory() > 0) {
            machine.setState(new IdleState());
        } else {
            machine.setState(new OutOfOrderState());
        }
//       if(machine.getInventory() == 0 || machine.getInventory() < 0){
//           System.out.println("Item is out of stock.");
//           new OutOfOrderState();
//       } else {
//           System.out.println("Item is dispensing.... Completed!");
//           machine.setInventory(machine.getInventory() - 1);
//       }
    }

    @Override
    public void setOutOfOrder(VendingMachineController machine) {
        machine.setState(new OutOfOrderState());
    }
}
