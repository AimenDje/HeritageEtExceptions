package dt;

public abstract class Vehicle {
    private String ownerName;
    private String ownerAddress;
    protected String brand;
    protected String model;
    protected String licencePlate;
    protected float value;

    protected Vehicle(String ownerName, String ownerAddress, String brand, String model,String licencePlate, float value)throws VehicleException{
        String[] nomsParametres = {"ownerName", "ownerAddress", "brand", "model", "licencePlate"};
        String[] valeursParametres = {ownerName, ownerAddress, brand, model, licencePlate};
        for (int i = 0; i<valeursParametres.length;i++){
            if(valeursParametres[i].equals("")){
                throw new VehicleException(nomsParametres[i]);
            }
        }
        this.ownerName = ownerName;
        this.ownerAddress = ownerAddress;
        this.brand = brand;
        this.model = model;
        this.licencePlate = licencePlate;
        this.value = value;
    }

    public String getOwnerName(){
        return ownerName;
    }

    public String getOwnerAddress(){
        return ownerAddress;
    }

    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }

    public void setOwnerAddress(String ownerAddress){
        this.ownerAddress = ownerAddress;

    }
    public abstract float getValue();

    @Override
    public String toString(){
        return ownerName+ ", "+ ownerAddress+ ", " + brand+ ", "+ model+", "+ licencePlate+", " + value;
    }

}
