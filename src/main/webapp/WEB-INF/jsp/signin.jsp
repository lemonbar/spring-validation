<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<html>
<h2>This is login.jsp file.</h2>
<!--modelAttribute接受model中的key为user的对象-->
<sf:form action="signin" modelAttribute="userForm" method="post">
    <table>
        <tr>
            <td>Phone number:</td>
            <td><sf:input path="phone"/></td>
            <td><sf:errors path="phone"/></td>
        </tr>
        <tr>
            <td>Code:</td>
            <td><sf:input path="code"/></td>
            <td><sf:errors path="code"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Save Changes"/>
            </td>
        </tr>
    </table>
</sf:form>
</html>
