package collection.deque.test.queue;

public class SchedulerTest {
    public static void main(String[] args) {
        TaskSchedular scheduler = new TaskSchedular();
        scheduler.addTask(new CompressionTask());
        scheduler.addTask(new BackupTask());
        scheduler.addTask(new CleanTask());

        System.out.println("run start");
        run(scheduler);
        System.out.println("run end");
    }

    private static void run(TaskSchedular scheduler) {
        while(scheduler.getRemainingTasks() > 0){
            scheduler.processNextTask();
        }
    }
}
