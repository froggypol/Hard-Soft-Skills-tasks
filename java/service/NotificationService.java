package service;

import entity.Notification;

public interface NotificationService {

    Notification create(String description);
    void delete(Notification notification);
    void fire(Notification notification);

}
