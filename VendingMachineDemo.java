public class VendingMachineDemo {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine(1);

        //select item - normal flow
        vm.selectItem();
        vm.insertCoin();
        vm.dispense();
        vm.dispense();

        // skip select
        System.out.println();
        VendingMachine vm2 = new VendingMachine(1);
        vm2.dispense();
        vm2.insertCoin();
        vm2.dispense();

        //skip insert coin still using vm2
        System.out.println();
        vm2.selectItem();
        vm2.dispense();
    }
}
