package com.auction.auction_platform.service;

import com.auction.auction_platform.entity.AuctionItem;
import com.auction.auction_platform.entity.Bid;
import com.auction.auction_platform.entity.User;
import com.auction.auction_platform.repository.BidRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class BidService {
    private final BidRepository bidRepository;

    @Transactional
    public void placeBid(Long auctionItemId, User user, int bidAmount) {
        Bid bid = new Bid();
        bid.setAuctionItem(new AuctionItem(auctionItemId));
        bid.setUser(user);
        bid.setBidAmount(bidAmount);
        bidRepository.save(bid);
    }
}