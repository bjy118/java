<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.util.Date"%>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<title>Welcome</title>
</head>

<body>

	<%@include file="Menu.jsp"%>
	<%!String greeting = "Welcome to Web Shopping Mall";
	String tagline = "Welcome to Web Market!";%>
	<div class="image"
		style="background: url('./image/ele.jpg'); background-size: 100% 100%; width: 100%; height: 350px; position: relative; z-index: 88;">
		<div class="jumbotron" style="background-color: rgba(0, 0, 0, 0);">
			<div class="container">
				<div>
					<h1 class="display-3" style="color: white">
						<a class="carousel-control-prev" href="#carouselExampleControls"
							role="button" data-slide="prev"> <span
							class="carousel-control-prev-icon" aria-hidden="true"></span> <span
							class="sr-only">Previous</span>
						</a> <a class="carousel-control-next" href="#carouselExampleControls"
							role="button" data-slide="next"> <span
							class="carousel-control-next-icon" aria-hidden="true"></span> <span
							class="sr-only">Next</span>
						</a>
						<%=greeting%>
					</h1>
				</div>
			</div>
		</div>
	</div>
	<main role="main">
	<div class="container">
		<div class="text-center">
			<h3>
				<%=tagline%>
			</h3>
			<%
				response.setIntHeader("Refresh", 5);
				Date day = new java.util.Date();
				String am_pm;
				int hour = day.getHours();
				int minute = day.getMinutes();
				int second = day.getSeconds();
				if (hour / 12 == 0) {
					am_pm = "AM";
				} else {
					am_pm = "PM";
					hour = hour - 12;
				}
				String CT = hour + ":" + minute + ":" + second + " " + am_pm;
				out.println("현재 접속 시각 : " + CT + "\n");
			%>
		</div>
		<hr>
	</div>
	</main>
	<%@ include file="footer.jsp"%>
</body>
</html>