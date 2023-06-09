<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="../layout/app.jsp">
    <c:param name = "content">
        <h2>メッセージ一覧</h2>
        <ul>
            <c:forEach var="task" items="${tasks }">
                <li>
                    <a href="${pageContext.request.contextPath }/show?ID=${task.ID}">
                    <c:out value="${task.ID }"/>
                    </a>
                    ：<c:out value="${task.content}"></c:out>
                </li>
            </c:forEach>
        </ul>
        <p><a href="${pageContext.request.contextPath}/new">新規メッセージの投稿</a></p>
    </c:param>
</c:import>