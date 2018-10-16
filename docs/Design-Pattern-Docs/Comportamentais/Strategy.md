# GOF Comportamental

## Strategy Pattern

### Quando usar:

- Quando se necessita definir uma classe que terá um comportamento que é similar a outros comportamentos da lista, por exemplo:

#### 1
> Comportamento de voo
> Pássaros podem voar, cachorros não.

#### 2
> Comportamento para diferentes tipos de voo
> Voo rápido;
> Voo lento
> Voo super rápido


- Realiza-se a implementação através de uma interface e de subclasses que utilizam do polimorfismo, sobrescrita, para mudar o comportamento desta interface de forma que os objetos que necessitam deste comportamento são setados de forma dinâmica.

### Pontos positivos
- Reduz longas listas de condicionais;
- Evita duplicação de código;
- Esconde código complicado do usuário
- Evita que o código da super classe interfira nas subclasses e vice-versa


### Pontos negativos

- Aumenta o número de objetos e classes do projeto.



### Diagrama de Classe UML
![image](https://user-images.githubusercontent.com/18054053/46925939-014c6d80-d005-11e8-909d-a5ba7d528d2f.png)
