# SQL Notes

### **Different Types of SQL JOINs**

* **(INNER) JOIN:** Returns records that have matching values in both tables
<p align="center">
  <img src="https://raw.githubusercontent.com/jdev-ae/code-snippets/master/images/img_innerjoin.gif" alt="Inner Join"/>
</p>

```sql
SELECT column_name(s)
FROM table1
INNER JOIN table2 ON table1.column_name = table2.column_name;
```

**Joining two tables**
> The following SQL statement selects all orders with customer information:
```sql
SELECT Orders.OrderID, Customers.CustomerName
FROM Orders
INNER JOIN Customers ON Orders.CustomerID = Customers.CustomerID;
```
**Joining three tables**
> The following SQL statement selects all orders with customer and shipper information: 
```sql
SELECT Orders.OrderID, Customers.CustomerName, Shippers.ShipperName
FROM ((Orders
INNER JOIN Customers ON Orders.CustomerID = Customers.CustomerID)
INNER JOIN Shippers ON Orders.ShipperID = Shippers.ShipperID);
```


* **LEFT (OUTER) JOIN:** Return all records from the left table, and the matched records from the right table
<p align="center">
  <img src="https://raw.githubusercontent.com/jdev-ae/code-snippets/master/images/img_leftjoin.gif" alt="Inner Join"/>
</p>

* **RIGHT (OUTER) JOIN:** Return all records from the right table, and the matched records from the left table
<p align="center">
  <img src="https://raw.githubusercontent.com/jdev-ae/code-snippets/master/images/img_rightjoin.gif" alt="Inner Join"/>
</p>

* **FULL (OUTER) JOIN:** Return all records when there is a match in either left or right table
<p align="center">
  <img src="https://raw.githubusercontent.com/jdev-ae/code-snippets/master/images/img_fulljoin.gif" alt="Inner Join"/>
</p>
