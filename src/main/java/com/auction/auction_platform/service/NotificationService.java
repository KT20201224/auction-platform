package com.auction.auction_platform.service;

import com.auction.auction_platform.entity.Notification;
import com.auction.auction_platform.repository.NotificationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NotificationService {
    private final NotificationRepository notificationRepository;

    public List<Notification> getUnreadNotifications(Long userId){
        return notificationRepository.findByUserIdAndIsReadFalse(userId);
    }
}
