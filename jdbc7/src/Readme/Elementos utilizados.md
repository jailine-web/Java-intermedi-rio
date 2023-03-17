#Transações 

##Elementos utilizados para a transação

###setAutoCommit(false)

Com o atributo false setado o método garante que o true só será setado quandp a transação for finalizada, atuando como uma confirmação. setado para true ele confirma as operações automáticamente sem a confirmação do programador.

###commit()

Confirmar a transação 

###roolback()

desfaz o que foi feito, restaura o bd ao ponto anterior em que ele estava

#O bloco inserido entre o método setAutoCommit e commit fica protegido por uma lógica de transação.

##Fazendo com que a operação ocorra totalmente e caso contrário ela não ocorrerá.

