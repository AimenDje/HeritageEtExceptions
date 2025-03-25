package dt;

public class VehicleException extends Exception{
        private String parameter;

        public VehicleException(String parameter){
                this.parameter = parameter;
        }

        public String getParameter(){
                return parameter;
        }

}