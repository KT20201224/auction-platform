package com.auction.auction_platform.service;

import com.auction.auction_platform.entity.AuctionItem;
import com.auction.auction_platform.repository.AuctionItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AuctionService {
    private final AuctionItemRepository auctionItemRepository;

    public List<AuctionItem> getActiveAuctions(){
        return auctionItemRepository.findByEndTimeAfter(LocalDateTime.now());
    }
}
