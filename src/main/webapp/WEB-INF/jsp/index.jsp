<%@ page language="java" contentType="text/html; charset=UTF-8"  
    pageEncoding="UTF-8"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
<title>Register</title>  
</head>  
<body>  
<form action="userAction" method="post">  
 <table width="207" border="0" align="center">  
        <tr>  
          <td colspan="2" align="center" nowrap="nowrap">User register</td>  
        </tr>  
        <tr>  
          <td width="68" nowrap="nowrap">name</td>  
          <td width="127" nowrap="nowrap"><label>  
            <input name="user.username" type="text" id="username" size="20" />  
          </label></td>  
        </tr>  
        <tr>  
          <td nowrap="nowrap">password</td>  
          <td nowrap="nowrap"><input name="user.password" type="password" id="password" size="20" maxlength="10" /></td>  
        </tr>  
        <tr>  
          <td colspan="2" align="center" nowrap="nowrap"><label>  
            <input type="submit"  value="submit" />  
            <input type="reset"  value="reset" />  
          </label></td>  
        </tr>  
  </table>  
</form>  
</body>  
</html>  