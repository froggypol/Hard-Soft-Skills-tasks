package service.impl;

import pool.PoolManager;
import entity.Notification;
import entity.Popup;
import service.NotificationService;

public class PopupNotificationServiceImpl implements NotificationService {

    private PoolManager poolManager;

    public PopupNotificationServiceImpl(PoolManager poolManager) {
        this.poolManager = poolManager;
    }

    @Override
    public Notification create(String description) {
        System.out.println("create popup notification");
        Notification notification = new Popup(description);
        poolManager.acquire(notification);
        return notification;
    }

    @Override
    public void delete(Notification notification) {
        System.out.println("delete popup notification");
        poolManager.releaseNotification(notification.getUid());
        notification = null;
    }

    @Override
    public void fire(Notification notification) {
        System.out.println("Fired popup with uid = " + notification.getUid());
    }
}
