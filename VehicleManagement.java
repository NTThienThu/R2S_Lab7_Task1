public class VehicleManagement {
    public static void main(String[] args) {
        Vehicle vehicle1= new Vehicle("Thien Thu","AB",150,45000000);
        Vehicle vehicle2= new Vehicle("MV","Ex",155,55000000);
        Vehicle vehicle3= new Vehicle();
        vehicle3.setNameOwner("AAAA");
        vehicle3.setPrice(20000000);
        vehicle3.setCapacity(50);

        System.out.println("Thuế trước bạ xe 1: "+ vehicle1.calTax());
        System.out.println("Thuế trước bạ xe 2: "+vehicle2.calTax());
        System.out.println("Thuế trước bạ xe 3: "+vehicle3.calTax());

        System.out.println("Tổng thuế trước bạ = "+(vehicle1.calTax()+vehicle2.calTax()+vehicle3.calTax()));
    }
}