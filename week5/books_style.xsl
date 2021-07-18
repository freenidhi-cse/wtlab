<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
<html>
<body>
	<h1 align="center">Books</h1>
		<table border="4" cellpadding = "10" align="center">
			<tr bgcolor="grey">
				<th>Title</th>
				<th>Author</th>
				<th>ISBN</th>
				<th>Publisher</th>
				<th>Edition</th>
				<th>Price</th>
			</tr>
			
			<xsl:for-each select="bookshelf/book">
			<tr>
				<td bgcolor="red"><xsl:value-of select="title"/></td>
				<td bgcolor="blue"><xsl:value-of select="author"/></td>
				<td bgcolor="green"><xsl:value-of select="isbn"/></td>
				<td bgcolor="yellow"><xsl:value-of select="publisher"/></td>
				<td bgcolor="lightblue"><xsl:value-of select="edition"/></td>
				<td bgcolor="pink"><xsl:value-of select="price"/></td>
			</tr>
			</xsl:for-each>
		</table>
</body>
</html>
</xsl:template>
</xsl:stylesheet>