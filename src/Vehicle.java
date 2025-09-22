class Vehicle{
    private String vehicleName; //車両名
    private boolean vehicleMidiumLicense; //中型免許が必要な車両か

    public void setVehicleName(String vehicleName){
        this.vehicleName = vehicleName;
    }
    public void setVehicleMidiumLicenses(boolean vehicleMidiumLicense){
        this.vehicleMidiumLicense = vehicleMidiumLicense;
    }
    
    public String getVehicleName(){
        return vehicleName;
    }
    public boolean getVehicleMiddiumLicence(){
        return vehicleMidiumLicense;
    }

    public void inputVehicleData(String vehicleName, boolean vehicleMidiumLicense){
        this.setVehicleName(vehicleName);
        this.setVehicleMidiumLicenses(vehicleMidiumLicense);
    }
}