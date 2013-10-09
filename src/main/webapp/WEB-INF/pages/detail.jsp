<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
	<h1>${substance.name}</h1>
		<ul>
            <li>Molecular Formula: ${substance.molecularFormula}</li>
            <li>Boiling Point: ${substance.boilingPoint}</li>
            <li>Melting Point: ${substance.meltingPoint}</li>
		</ul>
<a href="/BrowseHsdb/list">Back to list</a>
</body>
</html>