package composite;

import task.Task;

public interface Compositer {

    void addTask(Task task);
    void removeTask(Task task);
    double countTotalEstimation();

}
