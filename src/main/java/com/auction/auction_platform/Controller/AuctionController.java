package com.auction.auction_platform.Controller;

import com.auction.auction_platform.entity.AuctionItem;
import com.auction.auction_platform.service.AuctionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/auctions")
@RequiredArgsConstructor
public class AuctionController {

    private final AuctionService auctionService;

    @GetMapping("/active")
    public ResponseEntity<List<AuctionItem>> getActiveAuctions() {
        return ResponseEntity.ok(auctionService.getActiveAuctions());
    }
}