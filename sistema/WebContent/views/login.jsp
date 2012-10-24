<%@ taglib uri="/struts-tags" prefix="s" %>

<span class="section-title" style="margin-left:200px; margin-top:20px; display:block">Login!</span>

<form id="loginForm" action="login-authenticate" method="POST" class="form">

	<fieldset style="margin-left:200px">
		<p>
			<label>Email:</label>
			<s:textfield id="email" name="userDTO.email" />
		</p>
		<p>
			<label>Password:</label>
			<s:password id="password" name="userDTO.password" />
		</p>
		<input type="submit" value="Entrar!" class="button" style="height:24px; margin-left:90px;"/>
		
		<center>
			<span style="float:left;margin-top:10px;">Todavia no est&aacute;s registrado? <a href="register-init">Registrate</a>!</span>
		</center>
	</fieldset>
	
</form>
