package pool.impl;

import pool.PoolManager;
import entity.Notification;

import java.util.HashMap;
import java.util.Map;

public class PoolManagerImpl implements PoolManager {

    private static PoolManagerImpl instance;

    private Map<Long, Notification> id2NotificationStorage;

    private PoolManagerImpl() {
        id2NotificationStorage = new HashMap<>();
    }

    @Override
    public void acquire(Notification notification) {
        id2NotificationStorage.putIfAbsent(notification.getUid(), notification);
    }

    @Override
    public void releaseNotification(Long notificationId) {
        id2NotificationStorage.entrySet().
                removeIf(cachedNotificationEntry -> cachedNotificationEntry.getKey().equals(notificationId));
    }

    @Override
    public void printState() {
        System.out.println("Pool size = " + id2NotificationStorage.size());
        System.out.println("Pool entries: ");
        id2NotificationStorage.forEach((key, value) ->
                System.out.println(value.getUid() + " " + value.getDescription()));
    }

    public static PoolManagerImpl getInstance() {
        if (instance == null) {
            instance = new PoolManagerImpl();
        }
        return instance;
    }

}
