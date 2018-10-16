# GOF Criacional

## Factory Pattern

### Quando usar:

- É usado quando não se sabe antes do tempo qual classe de objeto você irá precisar.
- É usado quando se necessita que um método retorne uma das várias possibilidades de classes que tem em comum a super classe em questão
- Permite a possibilidade de instanciar uma classe em tempo de execução

> Ex1: Criar um tipo de inimigo em um jogo. Este inimigo pode ter vários tipos e diferenças mas ele só será criado em tempo de execução
> Ex2: Uma fábrica que tem o sistema de injeção de moldes para fabricação de brinquedos de plástico.



### Pontos positivos
- Encapsula a criação do objeto
- Centraliza código de seleção de classe
- O Usuário não precisa saber sobre todas as subclasses.

### Diagrama de Classe UML
![image](https://user-images.githubusercontent.com/18054053/46972834-e5dd7300-d095-11e8-8e41-05c4d44d3e9a.png)
