-- Last updated: 8/11/2026, 5:50:44 PM
# Write your MySQL query statement below
SELECT
    product_name,
    year,
    price
FROM Sales
LEFT JOIN Product
ON Sales.product_id = Product.product_id;