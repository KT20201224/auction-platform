package com.auction.auction_platform.repository;

import com.auction.auction_platform.entity.Bid;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BidRepository extends JpaRepository<Bid, Long> {
    List<Bid> findByAuctionItemIdOrderByBidAmountDesc(Long auctionItemId);
}
