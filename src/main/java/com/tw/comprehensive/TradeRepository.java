package com.tw.comprehensive;

public class TradeRepository {
    public Long createTrade(Trade trade) {
        return 1L;
    }

    public Trade findById(Long id) {
        return new Trade("test", "reference");
    }
}
