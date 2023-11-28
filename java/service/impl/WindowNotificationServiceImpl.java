package service.impl;

import pool.PoolManager;
import entity.Notification;
import entity.Window;
import service.NotificationService;

public class WindowNotificationServiceImpl implements NotificationService {

    private PoolManager poolManager;

    public WindowNotificationServiceImpl(PoolManager poolManager) {
        this.poolManager = poolManager;
    }

    @Override
    public Notification create(String description) {
        System.out.println("create window notification");
        Notification notification = new Window(description);
        poolManager.acquire(notification);
        return notification;
    }

    @Override
    public void delete(Notification notification) {
        System.out.println("delete window notification");
        poolManager.releaseNotification(notification.getUid());
        notification = null;
    }

    @Override
    public void fire(Notification notification) {
        System.out.println("Fired widow with uid = " + notification.getUid());
    }
}
