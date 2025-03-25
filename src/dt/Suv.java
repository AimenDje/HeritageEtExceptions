package dt;

public final class Suv extends Vehicle{
    private byte capacity;
    private byte childSeatCount;
    private byte airbagCount;

    public Suv (byte capacity, byte childSeatCount, byte airbagCount, String ownerName, String ownerAddress, String brand, String model,String licencePlate, float value)throws VehicleException{
        super(ownerName,ownerAddress, brand, model, licencePlate, value);
        this.capacity = capacity;
        this.childSeatCount = childSeatCount;
        this.airbagCount = airbagCount;
    }
    public byte getCapacity() {
        return capacity;
    }
    public byte getChildSeatCount() {
        return childSeatCount;
    }
    public byte getAirbagCount() {
        return airbagCount;
    }
    public void setCapacity(byte capacity){
        this.capacity = capacity;
    }
    public void setChildSeatCount(byte childSeatCount){
        this.childSeatCount = childSeatCount;
    }
    public void setAirbagCount(byte airbagCount) {
        this.airbagCount = airbagCount;
    }
    @Override
    public float getValue(){
        return super.value;
    }
    @Override
    public String toString(){
        return super.toString()+ ", "+ capacity + ", "+ childSeatCount+ ", "+ airbagCount;
    }
}