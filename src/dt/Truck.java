package dt;

public final class Truck extends Vehicle{
    private String[] materials = new String[5];
    private long permit;
    private String company;

    public String[] getMaterials() {
        return materials;
    }
    public long getPermit(){
        return permit;
    }
    public String getCompany(){
        return company;
    }

    public void setMaterials(String[] materials) {
        for(int i = 0; i<5;i++){
            if (i< materials.length && materials[i] !=null){
                this.materials[i] = materials[i];
            }else {
                this.materials[i] = null;
            }
        }
    }
    public void setPermit(long permit) {
        this.permit = permit;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Truck(String[]materials, long permit, String company, String ownerName, String ownerAddress, String brand, String model,String licencePlate, float value)throws VehicleException{
        super(ownerName,ownerAddress, brand, model, licencePlate, value);
        if( materials == null || materials.length == 0 || materials.length > 5){
            throw new TruckException("materials");
        }else if(company.equals("")){
            throw new TruckException("company");
        }
        for(int i = 0; i<5;i++){
            if (i< materials.length && materials[i] !=null){
                this.materials[i] = materials[i];
            }else {
                this.materials[i] = null;
            }
        }

        this.permit = permit;
        this.company = company;
    }

    @Override
    public float getValue(){
        return super.value;
    }

    @Override
    public String toString(){
        StringBuilder materiaux = new StringBuilder("[/");
        boolean premierElement = true;

        for (int i = 0; i<materials.length;i++){
            if(materials[i]!= null ){
                if(premierElement == false){
                    materiaux.append("//");
                }
                materiaux.append(materials[i]);
                premierElement = false;
            }
        }
        materiaux.append("/]");
        return super.toString() +", "+ materiaux.toString() + ", "+ permit+ ", "+ company;
    }
}