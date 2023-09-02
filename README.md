# javaDocker
projeto de estudo java com Docker  

Para iniciar o projeto fazer o clone pelo git navegar até a pasta raiz do projeto  

executar o comando ./mvnw clear package  

docker-compose up --build --force-recreate  

**O projeto usa o banco de dados H2, então, sempre que for reiniciado, os dados serão perdidos.  
Este é um projeto de estudos, por isso utiliza o banco H2**  

acessar os endpoints pelo postman/insomnia 

+ Para salvar um cadastro

      method:POST
      URL: localhost:8080/pessoas/savePessoa  
      body:  
      {  
          "nome": "Teste",   
          "cnpjcpf": "05579483937",  
          "telefone": "44999411123"  
      }  

+ Para listar os cadastros salvos  
      
      method: GET
      url: localhost:8080/pessoas/getAll  

+ Para deletar um cadastro salvo  

      method: DELETE
      url: localhost:8080/pessoas/{id}  
