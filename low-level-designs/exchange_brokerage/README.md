
Stock Exchange System 

Actors:
- Users
- Admin 
- System 

User should be able:
- Buy and Sell stocks
- Add/ edit/ remove  multiple watchlist containing multiple stock quotes 
- Place orders in multiple ways: 
  - MARKET 
  - LIMIT 
  - STOP LOSS 
  - STOP LIMIT
- View stocks
- Cancel order 
- Deposit/ Withdraw money 
- Register / Cancel membership 
- Search Stock inventory
Admin 
- Add / edit / Remove User 
- Add / delete stocks
- Login / Log out

System should be able: 
- Generate reports for quarterly updates and yearly tax statements
- Send notifications whenever trade orders are executed 
- Fetch stock quotes from stock exchange 


**Classes
*WatchList
*Account 
*StockExchange 
  - The stock exchange will fetch all stocks and their current prices from the stock exchange 
  - Assign a singleton class encapsulating all interactions with the stock exchange 
*Stock
*StockInventory
*Order
    - Multiple kinds of trading orders 
      - Market 
      - Limit
      - StopLimit
      - StopLoss
- OrderPart
- StockLot
  - Any member can buy multiple lots of the same stock at different times 
- StockPosition
- Statement 
- DepositMoney && WithDrawMoney
- Notification 



