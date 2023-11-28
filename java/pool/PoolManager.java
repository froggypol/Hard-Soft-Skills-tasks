package pool;

import entity.Notification;

public interface PoolManager {

    void acquire(Notification notification);

    void releaseNotification(Long notificationId);
    void printState();

}
