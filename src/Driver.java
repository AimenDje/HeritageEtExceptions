import dt.*;
public class Driver {
    public static void testTruck()throws VehicleException{

        Truck cityTruck = new Truck(new String[] {"sand", "traffic cones"}, 1001, "Ville de Montreal", "Valerie Plante", "City Hall"
                , "Chevrolet", "Silverado", "MTL 001", 40000.f);

        Truck wesmountTruck = new Truck(new String[] {"sand", "traffic cones", "concrete", "trees", "flowers"}, 2001, "Westmount", "Michelle Desjardins", "75 Belvedere"
                , "Ford", "XLT", "WMT 100", 27000.f);

        Truck expensiveTruck = new Truck(new String[] { "traffic cones", "sand", "wood", "furniture", "food", "ice"}, 3003, "Griffintown", "Jean Montagne", "1122 Peel"
                , "Toyota", "Tundra", "RST 002", 45000.f);

        System.out.println(cityTruck.toString());
        System.out.println(wesmountTruck.toString());
        System.out.println(expensiveTruck.toString());

    }
    public static void testSuv()throws VehicleException{
        Suv cheapSuv = new Suv((byte)12,(byte)4,(byte)2,"Jeanne Tremblay", "1100 Notre-Dame", "Fiat", "500X",
                "ABC 123", 25000.f);

        Suv mediumSuv = new Suv((byte)7,(byte)2,(byte)2,"Pierre Maisonneuve", "", "Honda", "Odyssey","FHG 789", 36000.f);

        Suv expensiveSuv = new Suv((byte)8,(byte)2,(byte)2,"Justin Levesque", "1400 McGill", "BMW", "X6","", 74000.f);

        System.out.println(cheapSuv.toString());
        System.out.println(mediumSuv.toString());
        System.out.println(expensiveSuv.toString());

    }
    public static float sumValues(Vehicle[] vehicles){
        float somme =0;
        if(vehicles == null || vehicles.length == 0 ){
            return 0.0f;
        }
        for (int i =0; i<vehicles.length; i++){
            if( vehicles[i] != null &&Float.isNaN(vehicles[i].getValue())){
                somme = somme + 0;
            }
            somme = somme + vehicles[i].getValue();
        }
        return somme;
    }
    public static void main(String[] args) {
        String choix = args[0];
        if(choix.equalsIgnoreCase("truck")){
            try{
                testTruck();
            }
            catch (TruckException e){
                System.out.println("Error with Truck Constructor parameter " + e.getParameter());
            }
            catch(VehicleException e) {
                System.out.println("Error with Vehicle constructor parameter " +e.getParameter());
            }
        }else if(choix.equalsIgnoreCase("suv")){
            try{
                testSuv();
            }
            catch(VehicleException e) {
                System.out.println("Error with Vehicle constructor parameter " +e.getParameter());
            }
        }else if (choix.equalsIgnoreCase("sum")){
            try{
                Vehicle[] vehicles = {
                        new Truck(new String[]{"sand", "cones"}, 1001, "Montreal", "Valerie Plante", "City Hall", "Chevrolet", "Silverado", "MTL 001", 40000.f),
                        new Truck(new String[]{"wood", "furniture"}, 2002, "Laval", "Sophie Tremblay", "300 Laval Blvd", "Ram", "1500", "LVL 333", 32000.f)};
                System.out.println("La somme de la valeur marchande est " + sumValues(vehicles));
            }
            catch (TruckException e){
                System.out.println("Error with Truck Constructor parameter " + e.getParameter());
            }
            catch(VehicleException e) {
                System.out.println("Error with Vehicle constructor parameter " +e.getParameter());
            }


        }
        else {
            System.out.println("Option inconnue!");
        }
    }
}
