<html>
    <head>
        <title>Welcome to DXC - Login Form</title>

        <script type="text/javascript"> 
            function check()
            {
                var uname = document.getElementById("username").value;
                var password = document.getElementById("password").value;
                var usernameerror = document.getElementById("usernameerror");
                var passworderror = document.getElementById("passworderror");
                usernameerror.innerHTML =""
                passworderror.innerHTML =""
                if((uname.length==0&&password.length==0)){
                    usernameerror.innerHTML = "<font color=red>Please enter Username</font>"
                    passworderror.innerHTML = "<font color=red>Please enter Password </font>"
                    return false
                }
                else if(password.length==0){
                    passworderror.innerHTML = "<font color=red>Please enter Password </font>"
                    return false
                }
                else if(uname.length==0){
                    if((password.length<6)||(password.length>12))
                    {
                        usernameerror.innerHTML = "<font color=red>Please enter Username</font>"
                        passworderror.innerHTML = "<font color=red> Password should begin with A</font>"
                        passworderror.innerHTML = "<font color=red>and Password Length should be between 6-12 and Password should begin with A</font>"
                        return false
                    }
                    else if((password.charAt(0)!='A'))
                    {
                        usernameerror.innerHTML = "<font color=red>Please enter Username</font>"
                        passworderror.innerHTML = "<font color=red>Password should begin with A</font>"
                        return false
                    } 
                    else
                    {
                        usernameerror.innerHTML = "<font color=red>Please enter Username</font>"
                        return false
                    }
                }
                else if(((password.length<6)||(password.length>12))&&(password.charAt(0)!='A'))
                {
                    passworderror.innerHTML = "<font color=red>Password Length should be between 6-12 and Password should begin with A</font>"
                    return false
                }
                else if((password.length<6)||(password.length>12))
                {
                    passworderror.innerHTML = "<font color=red>Password Length should be between 6-12</font>"
                    return false
                }
                else if(password.charAt(0)!='A')
                {
                    passworderror.innerHTML = "<font color=red>Password should begin with A</font>"
                    return false
                }
                else
                {
                   
                }
            }
        </script>
    </head>
    <body bgcolor="pink" text="blue">
        <form action="success.html" onsubmit="return check()">
            <table cellspacing="10" cellpadding="10" align="center">
                <tr align="center">
                        <td>User Name </td>
                        <td><input type="text" name="username" id="username" /></td>
                        <td><span id="usernameerror"></span></td>
                </tr>
                
                <br/>
                <tr align="center">
                        <td>Password </td>
                        <td><input type="password" name="password" id="password" /></td>
                        <td><span id="passworderror"></span></td>
                </tr>
                
                <br/>
                <tr align="center">
                        <td align="center">
                                <input type="submit" name="Login" value= "Login" />
                        </td>
                        <td align="center"><input type="button" name="Gp" value="Go" onclick="alert('GoForVacation')"/> </td>
                        <td align="center"><input type="reset" name="Clear" value="Clear"/> </td>
                </tr>
                
                   
                
            </table>  
        </form>
         
    </body>   
</html>