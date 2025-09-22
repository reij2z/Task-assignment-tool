class Worker{
    private String workerName;
    private boolean hasMidiumLicense; //中型免許を所有しているか

    public void setWorkerName(String workerName){
        this.workerName = workerName;
    }
    public void setHasMidiumLicense(boolean hasMidiumLicense){
        this.hasMidiumLicense = hasMidiumLicense;
    }

    public String getWorkerName(){
        return workerName;
    }
    public boolean getHasMidiumLicense(){
        return hasMidiumLicense;
    }

    public void inputWorkerData(String workerName, boolean hasMidiumLicense){
        this.setWorkerName(workerName);
        this.setHasMidiumLicense(hasMidiumLicense);
    }
}