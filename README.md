# Description

Trading service can create trade, when new trade created in the repository, it will also be logged in auditService at the same time.


## Task 1:
Check if logNewTrade() of auditService called when execute createTrade() of TradeService

## Task 2:
Check if findTrade() of auditService returns same value as the one findById() returned of TradeRepository

## Task 3:
Check if createTrade() of tradeRepository called when execute createTrade() of TradeService, and the trade id is same as the one returned by tradeRepository
