SELECT TOP (1000) [productid]
      ,[productname]
      ,[supplierid]
      ,[categoryid]
      ,[unitprice]
      ,[discontinued]
  FROM [TSQL2012].[Production].[Products]

  -- INNER JOIN
  -- CASE : Show product name with the corresponding category name !
  SELECT 
  *
  FROM
    Production.Products AS p 
        INNER JOIN 
    Production.Categories AS c 
    ON p.categoryid = c.categoryid;

    -- INNER JOIN 
    -- Case : Show product name with category name, and supplier name 
    SELECT
        p.productid,
        p.productname,
        c.categoryname,
        s.companyname
    FROM
    Production.Products AS p 
        INNER JOIN 
    Production.Categories AS c 
    ON p.categoryid = c.categoryid

        INNER JOIN 
    Production.Suppliers AS s
    ON s.supplierid = p.supplierid;


-- OUTER JOIN 
-- Case : show categories that are existed on product table as well as the ones that does not exist 
-- add new sample categorie first 
INSERT INTO Production.Categories(categoryname, description) VALUES
    ('Jajan Pasar','Traditional Food from Indonesia'), 
    ('Bumbu Dapur', 'Common Ingredients used to cook food');
-- Show the data 
SELECT
    c.categoryid,
    c.categoryname,
    p.productname
FROM 
    Production.Categories AS c
        LEFT OUTER JOIN
 -- RIGHT OUTER JOIN ( Jajan pasar tidak keluar )
    Production.Products AS p 
    ON p.categoryid = c.categoryid;

-- CROSS JOIN
-- It will show all combination of the rows from two or more tables 
-- Case : shw cross join of products and category !
SELECT
    p.productname,
    c.categoryname
FROM 
    Production.Products AS p 
        CROSS JOIN
    Production.Categories AS c;
-- It will give the results -> N of Categories x N of Products

-- SELF JOIN
-- Performs join on the same tables
-- Case : Show the employee and their respective managers !
SELECT
    emp.firstname AS empname,
    mgr.firstname AS mgrname
FROM
    HR.Employees AS emp
        INNER JOIN
    HR.Employees AS mgr
    ON emp.mgrid = mgr.empid;

-- ORDER BY
-- This is to show data in certain order based on the given column(s)
-- Case : Show the name of the productsin descending order based on categoryid and product name.
SELECT
    categoryid,
    productname
FROM Production.Products
ORDER BY categoryid DESC, productname DESC;

-- Filtering with WHERE 
-- Case : Show only products that have categories of condiments, and beverages !
SELECT
    p.productid,
    p.productname,
    c.categoryname
FROM
    Production.Products AS p 
        INNER JOIN 
    Production.Categories AS c 
    ON p.categoryid = c.categoryid
    WHERE c.categoryname = 'Beverages' or c.categoryname = 'Condiments';
    -- or we can  use | WHERE c.categoryname IN ('Condiments','Beverages')

-- TOP
-- To select certain number of percent of lines from a table
-- Case : Show the top 5 most expensive products !
SELECT
* 
FROM Production.Products 
ORDER BY unitprice DESC;
-- Case : Show the top 1% most expensive products !

SELECT TOP 1 PERCENT
* 
FROM Production.Products
ORDER BY unitprice DESC;

--OFFSET-FETCH
-- To take some data from certain line number 
-- OFFSET -> the data you don't want to include 
-- FETCH -> How many rows you want to take 
-- Case : Show the most expensive producst with rank 5-10 !
SELECT 
*
FROM Production.Products
ORDER BY unitprice DESC
OFFSET 4 ROWS FETCH NEXT 6 ROWS ONLY;
-- Compare
SELECT
*
FROM Production.Products
ORDER BY unitprice DESC