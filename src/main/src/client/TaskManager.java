package client;

import composite.Compositer;
import composite.TaskCompositer;
import task.Task;


public class TaskManager {

    public static void main(String[] args) {
        Task task1 = new Task("task1", 1);
        Task task2 = new Task("task2", 2);
        Task task3 = new Task("task3", 3);
        Task task4 = new Task("task4", 5);

        Compositer individualTaskCompositer = new TaskCompositer();
        individualTaskCompositer.addTask(task1);
        individualTaskCompositer.countTotalEstimation();

        Compositer setTasksCompositer = new TaskCompositer();
        setTasksCompositer.addTask(task3);
        setTasksCompositer.addTask(task2);
        setTasksCompositer.addTask(task4);
        setTasksCompositer.addTask(task1);
        setTasksCompositer.countTotalEstimation();
        setTasksCompositer.removeTask(task3);
        setTasksCompositer.countTotalEstimation();

    }

}
