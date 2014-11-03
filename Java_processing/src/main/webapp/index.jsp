<%@ page import="processing.*" %>
<html>
<body>
	<h2>processing</h2>
	<%
		ProcessFile pr = new ProcessFile();
		pr.checkSQS("rowinskiSQS");
	%>


</body>
</html>
