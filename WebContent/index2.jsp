<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>第一种传递方法   属性封装 --></h1> 
<form action="acquire1" method="post">
用户名：<input name="username"/>
密码：<input name="password"/>
年龄：<input name="age"/>
<input type="submit" value="提交">

</form>

<hr>
<h1>第二种传递方法   驱动模型封装 --></h1> 
<form action="acquire2" method="post">
用户名：<input name="username"/>
密码：<input name="password"/>
年龄：<input name="age"/>
<input type="submit" value="提交">

</form>

<hr>
<h1>第三种传递方法   表达式封装 --></h1> 
<form action="acquire3" method="post">
用户名：<input name="user.username"/>
密码：<input name="user.password"/>
年龄：<input name="user.age"/>
<input type="submit" value="提交">
</form>
<hr>
<h1>传值的问题--></h1> 
<form action="acquire2" method="post">
用户名：<input name="username"/>
密码：<input name="password"/>
年龄：<input name="age"/>
<s:fielderror fieldName="age"/>
<input type="submit" value="提交">
</form>
<hr>
<h1>传值的问题--></h1> 
<s:form action="acquire2">
<s:textfield name="username" label="姓名"></s:textfield>
<s:textfield name="password" label="密码"></s:textfield>
<s:textfield name="age" label="年龄"></s:textfield>
<s:submit value="提交"></s:submit>
</s:form>


</body>
</html>