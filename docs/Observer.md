# GOF Comportamental

## Observer Pattern

### Quando usar:

- Quando é necessário notificar de um para muitos objetos, quando esse um muda de estado.
- É a parte da "View" do MVC.
- O Subject(Ator que irá notificar) notifica os Observers(Aqueles que serão notificados).
- Acontece o encapsulamento de componentes principais e os componentes variáveis são colocados em hierarquia de Observer.

- Ex:
> O Observer define um relacionamento um-para-muitos, de modo que quando um objeto muda de estado, os outros são notificados e atualizados automaticamente. Alguns leilões demonstram esse padrão. Cada licitante possui uma raquete numerada que é usada para indicar um lance. O leiloeiro inicia a licitação e "observa" quando uma raquete é levantada para aceitar o lance. A aceitação da oferta altera o preço da oferta que é transmitido para todos os licitantes na forma de um novo lance.

> Youtube com os youtubers e os inscritos ou alterações em grandes estoques


### Pontos positivos
- Diminuição do Acoplamento
> Os Subjects(publisher) não precisam saber de nada a respeito dos Observers(subscribers).

### Pontos negativos

- O Subject pode mandar algum tipo de atualização que não importa para os Observers



### Diagrama de Classe UML
![image](https://user-images.githubusercontent.com/18054053/46963486-292ae800-d07c-11e8-9ecd-914a4bf37b9c.png)
