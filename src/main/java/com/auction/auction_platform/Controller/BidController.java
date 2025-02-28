package com.auction.auction_platform.Controller;

import com.auction.auction_platform.entity.User;
import com.auction.auction_platform.service.BidService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bids")
@RequiredArgsConstructor
public class BidController {
    private final BidService bidService;

    @PostMapping("/place")
    public ResponseEntity<String> placeBid(
            @RequestParam Long auctionItemId,
            @RequestParam Long userId,
            @RequestParam int bidAmount
    ) {
        bidService.placeBid(auctionItemId, new User(userId), bidAmount);
        return ResponseEntity.ok("입찰 성공!");
    }
}
