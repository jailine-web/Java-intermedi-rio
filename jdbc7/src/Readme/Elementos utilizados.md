#Transa��es 

##Elementos utilizados para a transa��o

###setAutoCommit(false)

Com o atributo false setado o m�todo garante que o true s� ser� setado quandp a transa��o for finalizada, atuando como uma confirma��o. setado para true ele confirma as opera��es autom�ticamente sem a confirma��o do programador.

###commit()

Confirmar a transa��o 

###roolback()

desfaz o que foi feito, restaura o bd ao ponto anterior em que ele estava

#O bloco inserido entre o m�todo setAutoCommit e commit fica protegido por uma l�gica de transa��o.

##Fazendo com que a opera��o ocorra totalmente e caso contr�rio ela n�o ocorrer�.

