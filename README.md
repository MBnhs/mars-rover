# mars-rover

#### Para iniciar a aplicação:
mvn spring-boot:run


#### Para executar os testes:
mvn test

#### URI para POST:
http://localhost:8080/mars

#### Formato para entrada JSON:
{
	"planalto": "5 5",
	"dadosRover":[{"posicaoInicial":"1 2 N","acoes":"LMLMLMLMM"}, {"posicaoInicial":"3 3 E","acoes":"MMRMMRMRRM"}]
}

#### Formato de saída JSON:
{
    "rovers": [
        "1 3 N",
        "5 1 E"
    ]
}

#### Exemplo CURL
curl -H "Content-Type: application/json" -X POST -d '{ "planalto": "5 5", "dadosRover":[{"posicaoInicial":"1 2 N","acoes":"LMLMLMLMM"}, {"posicaoInicial":"3 3 E","acoes":"MMRMMRMRRM"}] }' http://localhost:8080/mars
