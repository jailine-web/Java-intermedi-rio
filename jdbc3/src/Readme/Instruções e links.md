## APIs utilizadas na inserção de dados: 

### PreparedStatement é o objeto que permite a montagem de uma consulta sql deixando os parâmetros para depois.

### executeUpdate executa o comando com a consulta SQL.

### Statement.RETURN_GENERATED_KEYS: Retorna o novo id do novo obj inserido. É a sobrecarga do método prepareStatement para retornar o novo Id criado com a inseção dos novos dados.

### getGeneratedKeys Guarda/contém todas as chaves geradas por inserção no banco de dados. 
### Ele retorna um resultSet com todos os códigos dos objeto(s) inseridos, via insert.

