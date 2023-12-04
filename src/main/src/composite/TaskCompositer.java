package composite;

import task.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskCompositer implements Compositer {

    private List<Task> tasks;

    public TaskCompositer() {
        tasks = new ArrayList<>();
    }

    @Override
    public void addTask(Task task) {
        tasks.add(task);
    }

    @Override
    public void removeTask(Task task) {
        System.out.println("removing task " + task);
        tasks.remove(task);
    }

    @Override
    public double countTotalEstimation() {
        double totalEstimation =  tasks.stream()
                .mapToDouble(Task::getCost)
                .sum();

        System.out.println("Total estimation = " + totalEstimation + " for tasks " + tasks );
        return totalEstimation;
    }
}
