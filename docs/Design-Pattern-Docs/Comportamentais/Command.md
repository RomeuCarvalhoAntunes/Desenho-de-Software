# GOF Comportamental

## Command Pattern

### Quando usar:

- Em que um objeto se torna responsável por representar e encapsular toda a informação necessária para chamada do método posterior

- As informações incluem o nome do método, o objeto que é dono do método e o valor dos parâmetros do método

- Permite guardar uma lista de código que será executado depois de um tempo ou muitas vezes.
- Responsáveis por isso Recievers e Invokers.

>Ex1: Precisa emitir solicitações para objetos sem saber nada sobre a operação que está sendo solicitada ou o destinatário da solicitação.
>Ex2: Criação de um controle remoto que aumenta, abaixa, diminui e desliga a tv.

### Pontos positivos
- Pode se implementar comandos de desfazer para procedimentos passados.
- Pode armazenar múltiplos comandos em uma classe para serem reutilizados.

### Pontos negativos
-  É necessário criar muitas subclasses menores que serão responsáveis por armazenar a lista de comandos

### Diagrama de Classe UML
TODO + CODE
