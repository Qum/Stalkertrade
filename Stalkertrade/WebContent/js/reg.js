function regDataCheck(regForma){
	
	 var uname = regForma.uname.value; 
	 var upass = regForma.upass.value;
	 var umail = regForma.umail.value;
	 
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
	 else if(umail==null || umail=="")
	 { 
	 alert("Введите почту"); 
	 return false; 
	 } 
    return true;
}