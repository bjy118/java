<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ 
	String sessionId=(String) session.getAttribute("sessionId"); 
%>
<nav class="navbar navbar-expand navbar-dark bg-dark">
	<div class="container">
		<h1 style="color: olive">Web Shopping</h1>
		<div class="navbar-header">
			<a class="navbar-brand" href="./products.jsp">Home</a> <a
				class="navbar-brand" href="./welcome.jsp">Product</a> <a
				class="navbar-brand" href="./welcome.jsp">Recommended product</a> <a
				class="navbar-brand" href="./welcome.jsp">sale product</a> <a
				class="navbar-brand" href="./welcome.jsp">Login</a>
		</div>
		<div>
			<ul class="navbar-nav mr-auto">
				<c:choose>
					<c:when test="${empty sessionId}">
						<li class="nav-item"><a class="nav-link"
							href="<c:utl value="/member/loginMember.jsp"/>">로그인</a></li>
						<li class="nav-item"><a class="nav-link"
							href='<c:url value="/member/addMember.jsp"/>'>회원 가입</a></li>
					</c:when>
					<c:otherwise>
						<li style="padding-top: 7px; color: white">[<%=session%>님]</li>
						<li class="nav-item"><a class="nav-link"
							href="<c:url value="/member/logoutMember.jsp"/">로그아웃</a></li>
						<li class="nav-item"><a class="nav-link"
							href="<c:url value="/member/updateMember.jsp"/>">회원가입</a></li>
			</c:otherwise>
			</c:choose>
				<li class="nav-item"><a class="nav-link" href="./products.jsp">
						상품 목록</a></li>
				<li class="nav-item"><a class="nav-link"
					href="./addProduct.jsp"></a></li>
				<li class="nav-item"><a class="nav-link"
					href="./editProduct.jsp?edit=update">상품 수정</a></li>
				<li class="nav-item"><a class="nav-link"
					href="./editProduct.jsp?edit=delete">상품 삭제</a></li>
				<li class="nav-item"><a class="nav-link" href="<c:url value="/BoardListAction.do?pageNum=1"/>">게시판</a></li>
			</ul>
		</div>
		<form class="form-inline">
			<input class="form-control mr-sm-2" type="search"
				placeholder="Search" aria-label="Search">
			<button class "btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
		</form>
	</div>
</nav>
