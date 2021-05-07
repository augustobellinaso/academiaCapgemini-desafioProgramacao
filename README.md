# Desafio de Programação - Academia Capgemini

## Descrição do Projeto

Solução para a 2ª parte do Desafio de Programação, onde nos foi solicitado desenvolver um sistema que permite o cadastro de anúncios.
---

<p align="center">
 <a href="#executando-o-projeto">Executando o projeto</a> •
 <a href="#como-utilizar">Como utilizar</a> •
 <a href="#banco-de-dados">Banco de Dados</a> •
 <a href="#tecnologias">Tecnologias</a>
</p>

---

## Executando o Projeto


### Pré-requisitos

- Ter instalado alguma IDE ([Eclipse](https://www.eclipse.org/), [IntelliJ](https://www.jetbrains.com/pt-br/idea/) ou [Spring Tools Suite](https://spring.io/tools))
  - Observações:
    -  Se utilizar o Eclipse, deve-se ter instalado o plugin Spring Tools 4;
    -  Se utilizar o IntelliJ, é necessário ser a versão Ultimate para ter o suporte ao Java Web

### Fazendo download do código e inserindo na IDE

- Fazer o download do código fonte no formato `.zip` e extrair o mesmo para a pasta de destino.

#### Abrindo o projeto com IntelliJ

- Ir no menu `File > Open` e selecionar a pasta do arquivo descompactado.
- A IDE irá identificar que o projeto possui o gerenciador de dependências `Gradle` e irá solicitar a importação das dependências, basta colocar para importar. Caso aparecer a mensagem `Trust Gradle Project`, clique no botão `Trust Project` para que seja possível editar o projeto.
- Após fazer isso basta esperar alguns momentos até que todas as dependendências sejam carregadas e indexadas ao projeto.
  - Pode ser necessário informar a JDK que a IDE deve usar para executar o projeto. Como o projeto foi desenvolvido com Java na versão 11, selecione qualquer JDK que tenha suporte à essa versão.
- Após todas as configurações é possível executar a aplicação clicando na setinha verde que aparece ao lado da declaração da classe dentro do arquivo `CadastroanunciosApplication`, que está localizado no arquivo `src/main/java`.

#### Abrindo o projeto com Eclipse e/ou Spring Tools Suite
- Ir no menu `File > Import > Gradle > Existing Gradle Project`, apertar `Next` e fazer o mesmo na tela de boas vindas do `Gradle`. Na tela seguinte, no campo `Project root directory`, clique em `Browse` e selecione a pasta descompactada do projeto e então clique em `Finish`.
- Aguarde o Eclipse inserir o projeto e as suas dependências;
- Para executar, clique com o botão direito em cima da pasta do projeto no `Package Manager`, vá até `Run As` e selecione `Spring Boot Application`.

---

## Como Utilizar

Após executar a aplicação na IDE, basta ir até o seu Browser de preferência e acessar `http://localhost:8080`.

A página inicial da aplicação apresenta uma tela de boas-vindas (conforme figura abaixo) e nos fornece duas opções de botões: uma para cadastrar novo anúncio e outra para ver o relatório de anúncios cadastrados.

<h1 align="center">
  <img src="/assets/ss1.jpg" height="250"/>
</h1>

Ao clicar para cadastrar um novo anúncio, somos redirecionados para a seguinte tela, onde temos os campos para preencher e abaixo o botão para cadastrar um anúncio e outro para voltar para a tela inicial.
<h1 align="center">
  <img src="/assets/ss2.jpg" height="335"/>
</h1>

Todos os campos são de preenchimento obrigatório, caso seja feita uma tentativa de cadastrar algum anúncio sem um dos campos preenchidos, é exibida na tela uma mensagem de erro logo abaixo de cada campo:
<h1 align="center">
  <img src="/assets/ss9.jpg" height="400"/>
</h1>


Ao preencher corretamente todas as informações como mostra a imagem abaixo:
<h1 align="center">
  <img src="/assets/ss3.jpg" height="400"/>
</h1>

o botão cadastrar nos redireciona para uma nova página informando que o anúncio foi cadastrado com sucesso.
<h1 align="center">
  <img src="/assets/ss4.jpg" height="250"/>
</h1>

Nessa página temos 3 opções de navegação: Voltar para Home, Cadastrar um Novo Anúncio ou Exibir o relatório de anúncios cadastrados. Ao clicar no botão de exibir o relatório de anúncio, somos redirecionados para a seguinte tela:
<h1 align="center">
  <img src="/assets/ss5.jpg" height="450"/>
</h1>

que no primeiro momento exibe todos os anúncios cadastrados até o momento e nos dá a opção de fazer a filtragem dos mesmos com base no nome do cliente, data de início do anúncio e data de término do anúncio.
No relatório de cada anúncio são exibidas as informaçõs como nome do anúncio, nome do cliente, datas de início e término, valor total investido (que é calculado com base no valor do investimento diário informado e no período de tempo que o anúncio ficará disponível), e as quantidades de visualizações, cliques e compartilhamentos dos anúncios, que também são calculadas conforme o investimento diário e o tempo de disponibilidade do anúncio.

Sobre a filtragem dos relatórios, podemos preencher o campo que desejamos filtrar e apertar o botão Buscar.
<h1 align="center">
  <img src="/assets/ss6.jpg" height="450"/>
</h1>
<h1 align="center">
  <img src="/assets/ss7.jpg" height="450"/>
</h1>
<h1 align="center">
  <img src="/assets/ss8.jpg" height="450"/>
</h1>

Para voltar a exibir todos os dados cadastrados, basta deixar todos os campos da área de filtro vazios e clicar em Buscar.
---

## Banco de Dados

O banco de dados utilizado na aplicação é o banco H2 em memória, não sendo necessário fazer nenhuma configuração adicional na hora de executar a aplicação. Ao executar ela o banco já é carregado e irá estar disponível para a persistência dos dados.
Não existem informações pré-carregadas no banco, então cada vez que a aplicação é executada o banco é criado somente com as tabelas (e por isso a tela dos relatórios, ao ir direto para ela, retorna a mensagem informando que não existem anúncios cadastrados).
Para acessar o console do banco de dados, acesse a seguinte URL: `http://localhost:8080/h2` e preencha a tela do console da seguinte maneira:

<h1 align="center">
  <img src="/assets/ss10.jpg" height="450"/>
</h1>


---
## Tecnologias

- [Spring](https://spring.io/)
  - Spring Data JPA
  - Spring Web
  - Spring DevTools
- [Lombok](https://projectlombok.org/)
- [Thymeleaf](https://www.thymeleaf.org/)
- CSS
- HTML5
- JavaScript
