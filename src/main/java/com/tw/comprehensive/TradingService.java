package com.tw.comprehensive;

public class TradingService {
    TradeRepository tradeRepository;
    AuditService auditService;

    public TradingService(TradeRepository tradeRepository,
                          AuditService auditService) {
        this.tradeRepository = tradeRepository;
        this.auditService = auditService;
    }

    public Long createTrade(Trade trade) {
        Long id = tradeRepository.createTrade(trade);
        auditService.logNewTrade(trade);
        return id;
    }

    public Trade findTrade(Long id) {
        return tradeRepository.findById(id);
    }
}
