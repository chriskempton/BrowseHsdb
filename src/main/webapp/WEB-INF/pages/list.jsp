<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
	<h1>Hazardous Substances</h1>
		<ul>
		<c:forEach var="substance" items="${substances}">
            <li><a href="/BrowseHsdb/detail/${substance.id}">${substance.name}</a></li>
        </c:forEach>
		</ul>
</body>
</html>