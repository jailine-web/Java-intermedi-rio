#Caminho para inserir a biblioteca JDBC

window -> preferences -> java -> build path -> User Libraries -> Nome da biblioteca -> Add external JARs -> localize o arquivo jar

Adicionar a biblioteca criada ao projeto java:

New projeto java -> nome do projeto -> next -> na aba libraries -> modulepath -> add Library -> User library (biblioteca de usuário, ou seja, uma biblioteca que eu criei) -> next -> marca a biblioteca desejada -> finish.

#Links:
Link do banco de dados: https://dev.mysql.com/downloads/workbench/
Link do conector jdbc: https://dev.mysql.com/downloads/connector/j/?os=26 

#Comandos

Statement é a classe da Api responsável por montar um comando SQL para ser executado(recuperação dos 
dados num banco de dados)

ResultSet é a classe respresenta um objeto que contém o resultado da consulta em forma de tabela. Além
disso o objeto resultSet possui operações para posicionar os elementos.

##Operações:

first()
beforeFirst()
next()
absolut(int)

Proposta de script banco de dados: https://github.com/acenelio/demo-dao-jdbc/blob/master/database.sql 
