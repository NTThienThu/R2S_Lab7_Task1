public class Vehicle {
    private String nameOwner;
    private String nameBike;
    private int capacity;
    private long price;


    public Vehicle() {
    }

    public Vehicle(String nameOwner, String nameBike, int capacity, long price) {
        this.nameOwner = nameOwner;
        this.nameBike = nameBike;
        this.capacity = capacity;
        this.price = price;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public void setNameOwner(String nameOwner) {
        if (nameOwner == null) this.nameOwner = "không biết";
        this.nameOwner = nameOwner;
    }

    public String getNameBike() {
        return nameBike;
    }

    public void setNameBike(String nameBike) {
        if (nameBike == null) this.nameBike = "không biết";
        this.nameBike = nameBike;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        if (capacity <0) this.capacity = 0;
        this.capacity = capacity;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        if (price <0) this.price = 0;
        this.price = price;
    }

    public float calTax(){
        if (this.getCapacity() >= 100 && this.getCapacity()<200) return (float)(this.price*0.03);
        else if (this.getCapacity() > 200) {
            return (float)(this.price*0.05);
        } else return (float)(this.price*0.01);
    }

    public String showInfo() {
        return "Vehicle{" +
                "nameOwner='" + nameOwner + '\'' +
                ", nameBike='" + nameBike + '\'' +
                ", capacity=" + capacity +
                ", price=" + price +
                ", tax=" + this.calTax() +
                '}';
    }
}
