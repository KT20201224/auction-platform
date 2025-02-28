package com.auction.auction_platform.repository;

import com.auction.auction_platform.entity.AuctionItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface AuctionItemRepository extends JpaRepository<AuctionItem, Long> {
    List<AuctionItem> findByEndTimeAfter(LocalDateTime now);
}
