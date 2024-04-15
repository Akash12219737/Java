// Design and implement a multi-threaded task scheduler in Java. The task scheduler should be able to execute multiple tasks
//  concurrently using Java threads. Each task can have a priority assigned to it, and the scheduler should ensure that higher 
// priority tasks are executed before lower priority ones. Additionally, tasks may have dependencies on other tasks, and the scheduler 
// should resolve these dependencies to ensure proper execution order. Implement methods to add tasks to the scheduler, specify task 
// priorities, manage task dependencies, and start the scheduler to execute the tasks.

package OOPs;

import java.util.concurrent.*;

public class Task_sed {
    public static class TaskScheduler {
        private final ExecutorService executorService;

        public TaskScheduler(int numberOfThreads) {
            executorService = Executors.newFixedThreadPool(numberOfThreads);
        }

        public void submitTask(Task task) {
            executorService.submit(task::run);
        }

        public void shutdown() {
            executorService.shutdown();
        }

        public static void main(String[] args) {
            TaskScheduler scheduler = new TaskScheduler(4); // Create a scheduler with 4 threads

            // Define sample tasks
            Task task1 = new Task("Task 1", 1);
            Task task2 = new Task("Task 2", 2);
            Task task3 = new Task("Task 3", 3);
            Task task4 = new Task("Task 4", 2);
            Task task5 = new Task("Task 5", 1);

            // Add tasks to the scheduler
            scheduler.submitTask(task1);
            scheduler.submitTask(task2);
            scheduler.submitTask(task3);
            scheduler.submitTask(task4);
            scheduler.submitTask(task5);

            // Shutdown the scheduler after all tasks are completed
            scheduler.shutdown();
        }
    }

    static class Task implements Runnable {
        private final String name;
        private final int priority;

        public Task(String name, int priority) {
            this.name = name;
            this.priority = priority;
        }

        @Override
        public void run() {
            System.out.println("Executing " + name);
            try {
                Thread.sleep(1000); // Simulate task execution
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Completed " + name);
        }
    }
}
