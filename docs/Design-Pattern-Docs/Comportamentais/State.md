# GOF Comportamental

## State Pattern

- Permite que um objeto altere seu comportamento quando seu estado interno muda. Ao fazer isso o objeto aparenta ter mudado de classe.

- Context: Mantem uma instancia do estado concreto da subclasse que define o estado atual.

- State: Define uma interface que encapsula o comportamento associado com o estado particular do contexto.

- Concrete State: Cada subclasse implementa o comportamento associado com o Context.

> Ex1: Caixa de saque eletronico 24
  - **Estados**: Tem o cartão inserido
  - Não tem o cartão inserido
  - Tem a senha correta
  - Não possui dinheiro
  - **Modos de uso do ATM**:
    - O usuário insere o cartão
    - O usuário retira o cartão
    - O usuário Coloca a senha
    - O usuário deseja sacar

### Quando usar:

### Diagrama de Classe UML
TODO + CODE
