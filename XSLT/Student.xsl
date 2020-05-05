<?xml version = "1.0" encoding = "UTF-8"?>

<xsl:stylesheet version = "1.0" xmlns:xsl = "http://www.w3.org/1999/XSL/Transform">

<xsl:template match = "/">

<html>

<body>

<h2>Student Average Marks For The Year</h2>

<table border = "5">

<tr bgcolor = "green">

<th>Student Number</th>
<th>Name</th>
<th>Surname</th>
<th>Semester 1 Mark</th>
<th>Semester 2 Mark</th>
<th>Average For The Year</th>

</tr>


<xsl:for-each select = "class/student">

<tr>
<td>

<xsl:value-of select = "@id"/>

</td>

<td>

<xsl:value-of select = "name"/>

</td>

<td>

<xsl:value-of select = "surname"/>

</td>

<td>

<xsl:value-of select = "firstmark"/>

</td>

<td>

<xsl:value-of select = "secondmark"/>

</td>

</tr>

</xsl:for-each>

</table>

</body>

</html>

</xsl:template>

</xsl:stylesheet>