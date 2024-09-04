
# Projeto de Índice Remissivo com Estruturas de Dados em Java

## Descrição do Projeto

Este projeto implementa um sistema de índice remissivo utilizando estruturas de dados em Java. O objetivo é criar um mapeamento das palavras presentes em um texto e listar as linhas em que cada palavra aparece, permitindo uma busca eficiente de termos específicos.

### Estruturas de Dados Utilizadas

- **Tabela Hash (`TabelaHash`)**: Utiliza uma tabela hash para organizar as palavras com base na sua primeira letra, permitindo a inserção e busca rápida de palavras.
- **Lista Encadeada (`ListaEncadeada`)**: Cada entrada na tabela hash contém uma lista encadeada de palavras (`Palavra`), onde cada palavra armazena suas ocorrências (linhas) em outra lista encadeada.
- **No (`No`)**: Cada elemento na lista encadeada é representado por um nó, que contém o valor (seja uma palavra ou uma linha) e um link para o próximo nó.

### Arquivos Necessários

Para que o programa funcione corretamente, são necessários os seguintes arquivos de texto:

1. **texto.txt**: Este arquivo deve conter o texto que será analisado. Cada linha representa uma linha no documento original, e as palavras serão extraídas e indexadas com base nelas.

2. **palavras-chave.txt**: Este arquivo deve conter as palavras que você deseja buscar no texto. Cada palavra deve estar em uma linha separada.

### Exemplo de Conteúdo dos Arquivos

**texto.txt**: Good programming is not learned from generalities, but by seeing how significant programs can be made clean, easy to read, easy to maintain and modify, human-engineered, efficient, and reliable, by the application of common sense and by the use of good programming practices.


**palavras-chave.txt**: programming easy efficient reliable human-engineered


### Como Rodar o Projeto

1. **Pré-requisitos**:
   - Certifique-se de ter o JDK instalado (recomendado: JDK 11 ou superior).
   - O projeto deve estar configurado em um ambiente de desenvolvimento Java, como o IntelliJ IDEA.

2. **Configuração Inicial**:
   - Clone o repositório para o seu ambiente local:
     ```bash
     https://github.com/matheusharlen/Trabalho-Estrutura-Dados.git
     ```
   - Navegue até o diretório do projeto:
     ```bash
     cd TrabalhoEstruturaDados
     ```

3. **Adicionando os Arquivos Necessários**:
   - Coloque os arquivos `texto.txt` e `palavras-chave.txt` no diretório raiz do projeto (onde está localizado o `.gitignore`).
   - Certifique-se de que o formato e o conteúdo dos arquivos estão corretos, conforme explicado na seção "Arquivos Necessários".

4. **Executando o Projeto**:
   - Abra o projeto em seu ambiente de desenvolvimento (por exemplo, IntelliJ IDEA).
   - Compile e execute a classe `Principal` (ou `Main`, dependendo de como está nomeada). Ela é responsável por:
     - Ler os arquivos `texto.txt` e `palavras-chave.txt`.
     - Gerar o índice remissivo das palavras-chave.
     - Exibir o resultado no console e salvar em um arquivo `indice_remissivo.txt`.

5. **Verificando os Resultados**:
   - Após a execução, verifique o arquivo `indice_remissivo.txt` gerado no diretório raiz do projeto. Ele conterá as palavras-chave e as linhas onde elas aparecem no texto.

### Contribuições

Contribuições são bem-vindas! Se você encontrar algum problema ou tiver alguma sugestão de melhoria, sinta-se à vontade para abrir uma issue ou enviar um pull request.

### Licença

Este projeto é distribuído sob a licença MIT. Consulte o arquivo LICENSE para obter mais informações.

