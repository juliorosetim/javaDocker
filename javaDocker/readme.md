Para iniciar o projeto
fazer o clone pelo git
navegar até a pasta raiz do projeto

executar o comando
./mvnw clear package

docker-compose up  --build --force-recreate

acessar pelo postman/insomnia
method: GET
url: localhost:8080/pessoas/getAll