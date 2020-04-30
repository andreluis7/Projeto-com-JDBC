select userp.nome, tel.numero, userp.email from userposjava as userp inner join telefoneuser as tel on userp.id = tel.usuariopessoa where tel.usuariopessoa = 1;
