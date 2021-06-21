# ExceptionHandler Springboot

Para obter um retorno formatado sob medida de uma exceção, será preciso utilzizar o @ExceptionHandler.

Neste projeto, é simulado uma busca ao banco de dados (H2 Database) na qual será necessário passar o ID de um determinado usuário para busca-lo.

Para simular uma exceção neste projeto e ver o resultado, basta passar como parametro um ID inexistente no banco.

Para fazer uso do recurso, foram utilizados duas classes: 

**StandadError** classe auxiliar para que contem atributos necessários para serem retornados no momento do estouro da execeção java. <br>
**ControllerExceptionHandler** classe que possui metodos, que serão direcionados para determinada exceção.
