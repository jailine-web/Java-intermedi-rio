#Caminho para inserir a biblioteca JDBC

window -> preferences -> java -> build path -> User Libraries -> Nome da biblioteca -> Add external JARs -> localize o arquivo jar

Adicionar a biblioteca criada ao projeto java:

New projeto java -> nome do projeto -> next -> na aba libraries -> modulepath -> add Library -> User library (biblioteca de usu�rio, ou seja, uma biblioteca que eu criei) -> next -> marca a biblioteca desejada -> finish.

#Links:
Link do banco de dados: https://dev.mysql.com/downloads/workbench/
Link do conector jdbc: https://dev.mysql.com/downloads/connector/j/?os=26 

#Comandos

Statement � a classe da Api respons�vel por montar um comando SQL para ser executado(recupera��o dos 
dados num banco de dados)

ResultSet � a classe respresenta um objeto que cont�m o resultado da consulta em forma de tabela. Al�m
disso o objeto resultSet possui opera��es para posicionar os elementos.

##Opera��es:

first()
beforeFirst()
next()
absolut(int)

Proposta de script banco de dados: https://github.com/acenelio/demo-dao-jdbc/blob/master/database.sql 
