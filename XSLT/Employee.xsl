<?xml version = "1.0" encoding = "UTF-8"?>

<xsl:stylesheet version = "1.0" xmlns:xsl = "http://www.w3.org/1999/XSL/Transform">

<xsl:template match = "/">

<html>

	<body>
	
	<h2>Employee Details</h2>
	
	<table border = "1">
	
		<tr bgcolor = "red">
		
		<th>ID</th>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Nick Name</th>
		<th>Salary</th>
		<th>Grade</th>
		
		</tr>
		
		<xsl:for-each select = "class/employee">
		
		<!--<xsl:for-each select = "key('firstname-search','Peter')">This is an example of a  name value pair assigned for a specific element in an XML document-->
		
		<!--<xsl:sort select = "firstname"/>This is an example of sort statement-->
		
		<!--xsl:if test = "firstname = ""/>This is an example of an if statement-->
		
		<!--xsl:message terminate = "yes"/>This is an example of how to display a error message-->
					
		<tr>
		
		<td>
		
		<xsl:value-of select = "@id"/>
		
		</td>
		
		<td>
		
		<xsl:value-of select = "firstname"/>
		
		</td>
		
		<td>
		
		<xsl:value-of select = "lastname"/>
		
		</td>
		
		<td>
		
		<xsl:value-of select = "nickname"/>
		
		</td>
		
		<td>
		
		<xsl:value-of select = "salary"/>
		
		</td>
		
		<!--This is an example of a choose statement that is used to specify a multiple condition test against content></!-->
		
		<td>
		
		<xsl:choose>
		
		<xsl:when test = "salary > 30000">
		
		High
		</xsl:when>
		
		<xsl:when test = "salary > 2000">
		
		Medium
		</xsl:when>
		
		<xsl:otherwise>
		
		Low
		</xsl:otherwise>
		
		
		</xsl:choose>
		
		</td>
		
		</tr>
		
		</xsl:for-each>
		
	</table>
	
	</body>

</html>

</xsl:template>

</xsl:stylesheet>