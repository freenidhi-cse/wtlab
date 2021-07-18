<?xml version="1.0"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
<html>
<body>
	<h1>Books</h1>
		<table border="1" cellpadding = "6">
			<tr>
				<th>Title</th>
				<th>Author</th>
				<th>ISBN</th>
				<th>Publisher</th>
				<th>Edition</th>
				<th>Price</th>
			</tr>
			
			<xsl:for-each select="bookshelf/book">
			<tr bgcolor="#2EAF66">
				<td><xsl:value-of select="title"/></td>
				<td><xsl:value-of select="author"/></td>
				<td><xsl:value-of select="isbn"/></td>
				<td><xsl:value-of select="publisher"/></td>
				<td><xsl:value-of select="edition"/></td>
				<td><xsl:value-of select="price"/></td>
			</tr>
			</xsl:for-each>
		</table>
</body>
</html>
</xsl:template>
</xsl:stylesheet>