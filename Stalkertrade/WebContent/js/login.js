function loginDataCheck(logForma){
	
	 var uname = logForma.uname.value; 
	 var upass = logForma.upass.value;
	 
	 if (uname==null || uname=="")
	 { 
	 alert("Заполните Имя пользователя"); 
	 return false; 
	 }
	 else if(upass==null || upass=="")
	 { 
	 alert("Заполните пароль"); 
	 return false; 
	 } 
    return true;
}