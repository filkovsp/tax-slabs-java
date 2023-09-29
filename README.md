# Income Taxation (Java Challenge)

Given a number (which is income), compute applicable tax.

## Tax Slabs:
<pre>
- Slab1: 0   - 100   =  no tax
- Slab2: 100 - 200   = 10% tax
- Slab3: 200 - 400   = 20% tax
- Slab4: 400 - above = 25% tax
</pre>

## Test Cases:

<pre>
income: 500
0   - 100 = 0
100 - 200 = 10% tax = 10 = (200 - 100) * 0.10
200 - 400 = 20% tax = 40 = (400 - 200) * 0.20
400 - 500 = 25% tax = 25 = (400 - 200) * 0.25
---------------------------------------------
Total Tax = 75
</pre>

<pre>
income: 350
0   - 100 = 0
100 - 200 = 10% tax = 10 = (200 - 100) * 0.10
200 - 400 = 20% tax = 30 = (350 - 200) * 0.20
---------------------------------------------
Total Tax = 40
</pre>