import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //車両定義
        Vehicle vehicle1 = new Vehicle();
        vehicle1.inputVehicleData("2tトラック", true);

        Vehicle vehicle2 = new Vehicle();
        vehicle2.inputVehicleData("ハイエース", false);

        //案件定義
        Job job1 = new Job();
        job1.inputJobData(scanner, vehicle1, vehicle2);

        //労働者定義
        Worker worker1 = new Worker();
        worker1.inputWorkerData("玲仁",false);

        Worker worker2 = new Worker();
        worker2.inputWorkerData("太郎",true);

        Worker worker3 = new Worker();
        worker3.inputWorkerData("五郎",false);

        Worker worker4 = new Worker();
        worker4.inputWorkerData("新一",true);

        //ここから出力処理
        Worker[] workers = {worker1, worker2, worker3, worker4};

        int assigned = 0; //割り当てた人数

        //必要人数チェック
        if (job1.getRequiredWorkers() > 4) {
            System.out.println("人手が足りません");
            scanner.close();
            return;
        }

        System.out.println("案件番号：" + job1.getId());
        System.out.println("使用車両：" + job1.getVehicle().getVehicleName());

        Worker driver = null;
        if(job1.getVehicle().getVehicleMiddiumLicence()){
            for(int i = 0; i < workers.length; i++){
                if(workers[i].getHasMidiumLicense()){
                    driver = workers[i];
                    workers[i] = null;
                    assigned++;
                    break; //最初に見つけた中型免許持ちを運転手にするため
                }
            }
        }else{
            driver = workers[0];
            workers[0] = null;
            assigned++;
        }
        if(driver != null){
            System.out.println("運転手：" + driver.getWorkerName());
        }
        for(int i = 0; i < workers.length && assigned < job1.getRequiredWorkers(); i++){
            if(workers[i] != null){
                System.out.println("助手：" + workers[i].getWorkerName());
                assigned++;
            }
        }
        scanner.close();

    }
}