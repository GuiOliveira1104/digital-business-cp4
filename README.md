# Sistema de Gerenciamento de Biblioteca - Design Patterns

## Padrões de Design Utilizados
Singleton Pattern:
- O Singleton Pattern foi aplicado na classe GerenciadorSingleton. Este padrão garante que apenas uma instância da classe GerenciadorSingleton seja criada e fornece um ponto global de acesso a essa instância. É usado para garantir que haja apenas um gerenciador para todos os livros e operações de empréstimo/retorno.

Composite Pattern:
- O Composite Pattern foi aplicado na classe OrquestradorLivro e na classe abstrata TaskComponente. O OrquestradorLivro age como um componente composto que pode conter outros componentes, que podem ser livros individuais ou outros OrquestradorLivro. Isso permite criar uma estrutura hierárquica de componentes para organizar e mostrar informações sobre os livros.

Onde os Padrões de Design Foram Aplicados:
- Singleton Pattern: Aplicado na classe GerenciadorSingleton para garantir uma única instância do gerenciador.
- Composite Pattern: Aplicado na classe OrquestradorLivro para criar uma estrutura hierárquica de componentes que pode conter livros ou outros OrquestradorLivro.

Execução do Projeto
Para testar o sistema de gerenciamento de biblioteca e ver os padrões de design em ação, você pode executar o programa principal ProgramaBiblioteca.java.
