import java.util.Scanner;

class Job{
    private int id; //案件番号
    private int requiredWorkers; //業務に必要な人数（運転手+助手含む）
    private Vehicle vehicle;

    public void setId(int id){
        this.id = id;
    }
    public void setRequiredWorkers(int requiredWorkers){
        this.requiredWorkers = requiredWorkers;
    }
    public void setVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    public int getId(){
        return id;
    }
    public int getRequiredWorkers(){
        return requiredWorkers;
    }
    public Vehicle getVehicle(){
        return vehicle;
    }
    
    public void inputJobData(Scanner scanner,Vehicle vehicle1, Vehicle vehicle2){
        System.out.print("案件番号を入力してください：");
        this.setId(scanner.nextInt());
        
        System.out.print("業務に必要な人数を入力してください：");
        this.setRequiredWorkers(scanner.nextInt());

        System.out.print("2tトラックが必要ですか？(true / false)：");
        boolean vehicleChoice = scanner.nextBoolean();
        if(vehicleChoice == true){
            this.setVehicle(vehicle1);
        }else{
            this.setVehicle(vehicle2);
        }
    }
    
}