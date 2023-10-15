# Food Java Application

Este é um projeto de exemplo de uma aplicação Java que visa demonstrar os conceitos básicos do SpringBoot. A aplicação gerencia informações sobre alimentos. A aplicação inclui um back-end desenvolvido em Spring Boot.

## Tecnologias Utilizadas

- Spring Boot (Back-end)
- Banco de Dados (configurável, como H2, MySQL, PostgreSQL, etc.) [Neste projecto usei PostgreSQL]

## Requisitos

Certifique-se de ter as seguintes ferramentas instaladas antes de executar a aplicação:

- [Java SDK](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Maven](https://maven.apache.org/download.cgi) (para gerenciar as dependências do projeto)
- [Banco de Dados](https://hcode.com.br/blog/o-que-e-o-postgresql-instalando-e-criando-primeiro-banco-de-dados)


## Configuração

1. Clone o repositório:

   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git

2. Navegue até o diretório do projeto:

    ```bash
   cd seu-repositorio

3. Configurações do Back-end:

- Certifique-se de configurar o banco de dados de acordo com as configurações do projeto no arquivo application.properties ou application.yml.

4. Configurações do Front-end:

- Desenvolva o front-end de acordo com as necessidades do projeto. Os detalhes da integração com o back-end podem variar dependendo da tecnologia do front-end escolhida.

5. Execute a aplicação:

    ```bash
    mvn spring-boot:run

6. Acesse a aplicação no navegador em http://localhost:8080 ou no endereço configurado.

## Endpoints
A aplicação inclui os seguintes endpoints:

`GET /foods`: Retorna a lista de alimentos cadastrados.

`POST /foods`: Adiciona um novo alimento ao banco de dados.

## Contribuição
Sinta-se à vontade para contribuir para este projeto através de pull requests e relatórios de problemas.

## Licença
Este projeto está licenciado sob a Licença MIT - consulte o arquivo [LICENSE](https://github.com/melvintivane/springboot-food-app/blob/main/LICENSE) para obter detalhes.