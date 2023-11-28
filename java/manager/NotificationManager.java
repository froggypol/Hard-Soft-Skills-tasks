package manager;

import entity.Notification;
import entity.Window;
import pool.PoolManager;
import pool.impl.PoolManagerImpl;
import service.NotificationService;
import service.impl.PopupNotificationServiceImpl;
import service.impl.WindowNotificationServiceImpl;

public class NotificationManager {

    public static void main(String[] args) {

        PoolManager poolManager = PoolManagerImpl.getInstance();
        NotificationService windowService = new WindowNotificationServiceImpl(poolManager);
        NotificationService popupService = new PopupNotificationServiceImpl(poolManager);

        Notification window1 = windowService.create("window1");
        windowService.fire(window1);

        Notification popup1 = popupService.create("popup1");
        popupService.fire(popup1);

        Notification popup2 = popupService.create("popup2");
        popupService.fire(popup2);

        poolManager.printState();

        System.out.println("release " + popup1.getDescription());
        popupService.delete(popup1);

        poolManager.printState();

    }

}
