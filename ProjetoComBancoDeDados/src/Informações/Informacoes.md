#Padr�o de projeto DAO(Data Access Object - Objeto de Acesso a dados)

##DAO:
###Para cada entidade, haver� um objeto respons�vel por fazer acesso a 
dados relacionado a esta entidade. Por exemplo:
A classe Cliente ter� um DAO do tipo CLiente, 
Ex: ClienteDao
Produto: ProdutoDao
Pedido: PedidoDao
E assim sucessivamente  

###Cada DAO ser� defenido por uma interface
### A inje��o de depend�ncia pode ser feita por meio do padr�o de projeto Factory 
(quando n�o est� utilizando frameworks)

