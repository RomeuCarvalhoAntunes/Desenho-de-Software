# Diagrama de Classe UML

## Classes
- Criar campo de classe nome no topo
- Segunda parte os atributos
> (Encapsulamento) nome do atributo : Tipo de atributo

- Encapsulamento

  > + Public

  > - Private

  > "#" Protected


- Terceira parte métodos da classe seguindo a mesma forma:
- Não é necessário representar get/set
> (Encapsulamento)nomeDoMetodo();


* **Classe Abstrata** recebe a escrita em Itálico.

- Ex:

![image](https://user-images.githubusercontent.com/18054053/46954128-2624fd00-d066-11e8-995b-55335915f2e4.png)

## Interfaces

- Desenhada como uma classe mas acima do nome exite a TAG <<interface>>
- Quando uma classe implementa uma interface está é simbolizada por uma seta pontilhada, que sai de quem implemnta com a ponta na interface, sendo esta ponta fechada mas sem coloração.

- Ex:


![image](https://user-images.githubusercontent.com/18054053/46955427-44402c80-d069-11e8-8680-3ffaedec7f5a.png)


## Herança

- Representada por uma seta sólida com a ponta fechada, não pintada que aponta para a super classe.

- Ex:

![image](https://user-images.githubusercontent.com/18054053/46954221-67b5a800-d066-11e8-815f-6c4399e9604a.png)


## Associação

### Bidirecional

- Sempre consideradas bidirecionais (classes cientes uma das outras)
- Representado por uma linha sólida entre duas classes
- Ao lado de cada classe se coloca a função com o valor da multiplicade
- A multiplicidade pode ser de (0..1 , 0..* , 1..* , * , 1)

- Ex:

![image](https://user-images.githubusercontent.com/18054053/46955010-49e94280-d068-11e8-8fc7-b283406ec21d.png)

### Unidirecional

- Somente uma das classes sabe do "existencia" da outra
- Seta solida com ponta da seta aberta saindo de quem reconhece para quem é reconhecido
- na ponta da seta se coloca a multiplicidade e a função

- Ex:

![image](https://user-images.githubusercontent.com/18054053/46955180-b3695100-d068-11e8-804a-2cde752fe3ad.png)


### Classes de associação
- Na modelagem de associações, algumas vezes é necessário incluir outra classe porque ela inclui informações valiosas sobre o relacionamento.
- Vincula-se à associação primária. uma classe de associaçõa que é representada por uma linha pontilhada ligada na associação principal.

- Ex:

![image](https://user-images.githubusercontent.com/18054053/46955726-042d7980-d06a-11e8-9d42-ed5cafde7ae3.png)

### Associação Reflexiva.

- Quando uma classe está relacionada com ela mesma
- Ex: funcionário GERENCIA funcionário
- linha sólida ligando a classe com ela mesma, mostrando a multiplicidade e a função representadas na linha

- Ex:

![image](https://user-images.githubusercontent.com/18054053/46956633-22947480-d06c-11e8-8f49-92f0b904032e.png)


## Agregação

### Agregação Básica
- Quando as classes podem existir de maneira separada mas eventualmente são colocadas juntas
- Ex: Classe carro e Classe Rodas elas existem de formas separadas mas eventualmente são agregadas uma na outra.
- A representação ocorre por meio de uma seta sólida, aberta e com um losango na ponta da classe Pai e a ponta da seta na classe filha.

- Ex:

![image](https://user-images.githubusercontent.com/18054053/46956092-cc730180-d06a-11e8-976b-a841dbb6117e.png)


### Agregação de Composição
- Funciona da mesma forma que a agregação básica, no entando a vida da classe filha necessita obrigatoriamente da classe pai.
- Ex: uma empresa e seus departamentos, os departamentos não podem existir antes da empresa
- A representação ocorre por meio de uma seta sólida, aberta com um losango na ponta da classe pai, este losango totalmente preenchido, e a ponta da seta ligada na classe filha.

- Ex:

![image](https://user-images.githubusercontent.com/18054053/46956290-4dca9400-d06b-11e8-83b1-07c67702c795.png)
