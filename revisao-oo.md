#  Revisão de Orientação a Objetos

 - Paradigma de programação bem rico em princípios e boas práticas. Orienta-se por abstrair, do mundo real, o que é essencialmente relevante para representar o software. Encapsula e oculta quando necessário, transforma aquilo que se deseja implementar em objetos. Quando existe semelhanças entre estes objetos os mesmos são agrupados em classes.

---

## Abstração

- É utilizada para definição de entidades do mundo real, auxilia na criação das classes e no pensamento dos objetos, é o momento em que se deve analisar os objetos a serem criados do mundo real para que se possa abstrair e modelar o sistema corretamente, é necessário verificar:

> Características dos objetos --> resultaram em atributos

> Se os obejtos podem ser agrupados --> resultaram em classes

> ações do objeto --> resultaram em métodos

---


## Encapsulamento

- O conceito de encapsulamento vem para proteger atributos e métodos das classes tornando esses atributos ou métodos ocultos para determinados objetos:

> Private --> Atributo ou método privado, apenas objetos da classe tem acesso

> Protected --> atributos ou métodos protegidos, apenas classes originais e derivadas possuem acesso.

> Public --> atributos ou métodos públicos, qualquer objeto ou classe do programa pode acessá-los diretamente.

---

## Classes

- Conceito onde acontece o agrupamento de objetos com as mesmas características, por exemplo: Classe comida, onde os objetos alface, tomate, melancia, hamburguer estariam todos contidos

- A classe é como se fosse uma "planta" do objeto antes de ser formado pois irá conter as características do objeto, as ações e será usada para a criação deste objeto.

> Atributos --> Características do Objetos
> Métodos --> Comportamento do Objeto.

---

## Herança

- É responsável por fazer com que classes primária e classes derivadas compartilhem atributos e métodos. Diz-se que a classe derivada herda da classe pai

> Classe comida (PAI) -> Classe alface (Filha/derivada) contém os mesmos Atributos e métodos da classe pai


---

## Polimorfismo

- Se da quando duas ou mais classes que derivam da mesma classe pai podem invocar o mesmo método com comportamentos diferentes

### Sobrecarga

- Se da quando criamos diferentes variações de um mesmo método criação de dois ou mais métodos com nomes totalmente iguais mas comportamentos diferentes.


### Sobreposição

- É um conceito do polimorfismo que nos permite reescrever um método nas classes filhas métodos que foram inicialmente criados nas classes pai

> Métodos sobrepostos devem possuir os mesmos nomes. quantidades de parametros e retorno do método inicial
