#APIs utilizadas na inserção de dados: 

###PreparedStatement
obj que permite a montagem de uma consulta sql deixando os parâmetros para depois.

###executeUpdate

###Statement.RETURN_GENERATED_KEYS
Permite a recuperação do novo id do novo obj inserido. Sobrecarga do método prepareStatement para retornar o novo Id criado com a inseção dos novos dados.

###getGeneratedKeys