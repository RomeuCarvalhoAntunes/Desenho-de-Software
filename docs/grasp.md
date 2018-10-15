# Revisão de conceitos do GRASP

- General Responsability Assignment Software Patterns.

- Consiste de diretrizes para atribuição de responsabilidades a objetos e classes em projetos orientados a Objetos

- Consiste em 9 princípios básicos de um projeto orientado a objetos que são:

### Especialista na informação (Information Expert).
- Problema: Qual é o princípio básico pelo qual atribuimos responsabilidades a objetos ?

- Solução: Atribua responsabilidades à classe que tenha a informação necessária para satisfazê-las.

- Este princípio determina quando devemos delegar  a responsabilidade para um outro objeto que seja especialista naquele domínio.

- Ex: Classe "pagamento" no exemplo do e-commerce ela que deterá todas as informções a respeito dos dois lados do pagamento.
---

## Criador (Creator).

- Problema: Quem cria um A(Um objeto do tipo A) --> "Quem cria um pagamento?"

- Solução: Atribuir à classe B a responsabilidade de criar uma instância da classe A se uma das seguintes afirmativas for verdadeira (quanto mais melhor):

> B "contém" A, ou agrega A de forma composta.

> B registra A

> B usa A de maneira muito próxima

> B contém dados iniciais de A

- Conceito: Este princípio determina qual classe deve ser responsável pela criação certos objetos.

- Ex: A classe caixa seria responsável por criar um novo pagamento visto que usa de maneira muito próxima a classe pagamento e possui os dados iniciais do pagamento
---

### Baixo Acoplamento (Low Coupling).

- Problema: Como reduzir o impacto de modificação.

- Solução: Atribuir responsabilidades de modo que o acoplamento (desnecessário) permaneça baixo. Use esse princípio para avaliar alternativas

- Conceito: Determina que as classes não devem depender de objetos concretos e sim de abstrações, permindo que haja mudanças sem impacto.

---

### Alta Coesão (High Cohesion).

- Problema: Como manter os objetos focados, inteligíveis e gerenciáveis e, como efeito colateral, apoiar o baixo acoplamento

- Solução: Atribuir responsabilidades de modo que a coesão permaneça alta. Use isso para avaliar alternativas

- Conceito: Este principio determina que as classes devem se focar apenas na sua responsabilidade

- Exemplo: Classes, caixa, pagamento, carrinho e cliente todas são especialistas com alta coesão e facilitam o baixo acomplamento.

---

### Controlador (Controller).

- Problema: Qual o primeiro objeto, além da camada de UI(User interface), que recebe e coordena("controla") uma operação do sistema ?

- Solução: Atribuir a responsabilidade a um objeto que representa uma das seguintes escolhas:

> Representa todo o "sistema", um "objeto raiz", um dispositivo dentro doqual o software está sendo executado, ou subsistema importante ( todas essas são variações de um controlador fachada).

> Representa um cenário de caso de uso dentro do qual a operação do sistema ocorre (um caso de uso ou um controlador de sessão).

- Conceito: Este principio atribui a responsabilidade por lidar com eventos do sistema a uma classe que não esteja relacionada a interface com o usuário.

- Exemplo: MVC a UI solicita o comportamento de realizar login a controller chama a classe que é reponsável por este comportamento, a controller delega a comportamento para a classe especialista.

---

### Polimorfismo (Polymorphism).

- Problema: Como tratar alternativas com base no tipo? Como criar componentes de software interconectáveis?

- Solução: Quando alternativas ou comportamentos relacionados variam segundo o tipo (classe), atribua a responsabilidade pelo comportamento aos tipos para os quais o comportamento varia, usando operações polimórficas.

- Conceito: As responsabilidade devem ser atribuidas a abstrações e nao a objetos concretos, permitindo que eles possam variar conforme a necessidade.

- Exemplo: Ainda pensando no e-commerce, pagamentos via boletos ou cartões de crédito e débito... Podem ser utilizadas a sobrescrita, sobrecarga de métodos.

---

### Indireção (Indirection).

- Problema: A quem devemos atribuir a responsabilidade de maneira a evitar o acomplamento direto entre dois (ou mais) objetos ? Como desacoplar os objetos, de modo que o baixo acoplamento seja apoiado e o potencial reúso permaneça alto ?

- Solução: Atribuir a responsabilidade de ser o mediador entre outros componentes ou serviços a um objeto intermediário, para que eles não sejam diretamente acoplados.

> O intermediário cria uma indireção entre os outros componentes

- Conceito: Este principio ajuda a manter o baixo acoplamento, através de delegação de responsabilidades através de um classe mediadora.

- Exemplo: No padrão MVC o controlador faz o papel de indireção, cria o acoplamento entre a view e a model por meio do controller.

---
### Fabricação / Invenção Pura (Pure Fabrication).

- Problema: Que objeto deve ter a responsabilidade quando não se quer violar a alta coesão e o baixo acoplamento ou outros objetivos, mas as soluções oferecidas pelo Especialista na informação (Information Expert), por exemplo, não são apropriadas ?

- Solução: Atribuir um conjunto de responsabilidades altamente coeso a uma classe artificial ou de conveniência que não represente um conceito no domínio do problema - Algo inventado para apoiar a alta coesão, o baixo acoplamento e o reúso.

- Conceito: É uma classe que não representa nenhum conceito no domínio do problema, ela apenas funciona como um classe prestadora de serviços, e é projetada para que possamos ter uma baixo acomplmente e alta coesão no sistema.

- Exemplo: No e-commerce seria criada uma classe de fabrica para pagamentos onde a caixa registradora estaria fazendo dependencia apenas para interface apenas para pagamentos, ela não sofreria impacto para diferentes tipos de pagamentos pois a fabrica que iria criar o pagamento.

---
### Variações Protegidas (Protected Variations).

- Problema: Como projetar objetos, subsistemas e sistemas de modo que as variações ou instabilidades nestes elementos não tenham um impacto indesejável sobre outros elementos.

- Solução: Identificar pontos de variação ou instabilidades previsível; atribuir responsabilidades para criar uma interface estável em torno deles.

- Conceito: Este principio protege o sistema com a variações de componentes, encapsulando o comportmanto que realmente importa.

- Exemplo: Encapsulamento, polimorfismo, indireção, etc....
