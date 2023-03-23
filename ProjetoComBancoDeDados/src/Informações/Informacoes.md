#Padrão de projeto DAO(Data Access Object - Objeto de Acesso a dados)

##DAO:
###Para cada entidade, haverá um objeto responsável por fazer acesso a 
dados relacionado a esta entidade. Por exemplo:
A classe Cliente terá um DAO do tipo CLiente, 
Ex: ClienteDao
Produto: ProdutoDao
Pedido: PedidoDao
E assim sucessivamente  

###Cada DAO será defenido por uma interface
### A injeção de dependência pode ser feita por meio do padrão de projeto Factory 
(quando não está utilizando frameworks)

