<%--
  Created by IntelliJ IDEA.
  User: zhangly
  Date: 2017/5/19
  Time: 下午2:48
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
    <title>Spring MVC Demo</title>
</head>

<body>
<h2>All Persons</h2>

<table border="1">
    <tr>
        <th>Person Id</th>
        <th>Person Name</th>
    </tr>
    <c:forEach items="${requestScope.people}" var="person">
        <tr>
            <td>${person.id}</td>
            <td>${person.name}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
