package com.tw.comprehensive;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class TradingServiceTest {
    @Test
    void should_call_auditService_logNewTrade_execute_TradeService_createTrade() {
        //given
        TradeRepository tradeRepository=mock(TradeRepository.class);
        AuditService auditService=mock(AuditService.class);
        TradingService tradingService=new TradingService(tradeRepository,auditService);
        Trade trade=new Trade("test","test");

        //when
        tradingService.createTrade(trade);

        //then
        verify(auditService).logNewTrade(trade);
    }



}