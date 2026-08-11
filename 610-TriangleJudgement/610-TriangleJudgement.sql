-- Last updated: 8/11/2026, 5:52:58 PM

select *, if(x+y>z and y+z>x and x+z>y, "Yes","No") as triangle from triangle
