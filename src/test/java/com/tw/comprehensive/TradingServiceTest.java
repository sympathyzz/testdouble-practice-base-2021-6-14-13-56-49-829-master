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

    @Test
    void should_call_TradingService_findTrade_execute_TradeRepository_findTrade() {
        //given
        TradeRepository tradeRepository=new TradeRepository();
        Long id=1L;
        TradeRepository mockTradeRepository=mock(TradeRepository.class);
        AuditService auditService=mock(AuditService.class);
        TradingService tradingService=new TradingService(mockTradeRepository,auditService);

        //when
        Trade trade1=tradeRepository.findById(id);
        when(mockTradeRepository.findById(id)).thenReturn(trade1);
        Trade trade2=tradingService.findTrade(id);

        //then
        assertEquals(trade1,trade2);

    }

}