public class List {
    private String address;

    public List(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "List{" +
                "address='" + address + '\'' +
                '}';
    }
}
