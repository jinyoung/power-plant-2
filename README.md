# 


```
http :8083/입찰 id="2023-03-13-yo" generatorType="수력"
http :8081/계량 id="2023-03-13-yo-00" generatedAmount=10
http :8082/정산
```

## Model
www.msaez.io/#/storming/power-plant-kor

## Before Running Services
### Make sure there is a Kafka server running
```
cd kafka
docker-compose up
```
- Check the Kafka messages:
```
cd kafka
docker-compose exec -it kafka /bin/bash
cd /bin
./kafka-console-consumer --bootstrap-server localhost:9092 --isolation-level read_committed --topic
```

## Run the backend micro-services
See the README.md files inside the each microservices directory:

- 계량
- 정산
- 입찰
- 마스터


## Run API Gateway (Spring Gateway)
```
cd gateway
mvn spring-boot:run
```

## Test by API
- 계량
```
 http :8088/계량 id="id" subscriberId="subscriberId" plantId="plantId" generatedAmount="generatedAmount" generatorType="generatorType" 
```
- 정산
```
 http :8088/정산 id="id" yearCode="yearCode" monthCode="monthCode" dayCode="dayCode" subscriberId="subscriberId" platId="platId" generationAmount="generationAmount" MEP="MEP" 시간별계량치="시간별계량치" 
```
- 입찰
```
 http :8088/입찰 id="id" subscriberId="subscriberId" plantId="plantId" generatedAmount="generatedAmount" generatorType="generatorType" 
```
- 마스터
```
 http :8088/발전기정보 id="id" 열효율="열효율" 
 http :8088/시장가 id="id" 가격="가격" 
```


## Run the frontend
```
cd frontend
npm i
npm run serve
```

## Test by UI
Open a browser to localhost:8088

## Required Utilities

- httpie (alternative for curl / POSTMAN) and network utils
```
sudo apt-get update
sudo apt-get install net-tools
sudo apt install iputils-ping
pip install httpie
```

- kubernetes utilities (kubectl)
```
curl -LO "https://dl.k8s.io/release/$(curl -L -s https://dl.k8s.io/release/stable.txt)/bin/linux/amd64/kubectl"
sudo install -o root -g root -m 0755 kubectl /usr/local/bin/kubectl
```

- aws cli (aws)
```
curl "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip" -o "awscliv2.zip"
unzip awscliv2.zip
sudo ./aws/install
```

- eksctl 
```
curl --silent --location "https://github.com/weaveworks/eksctl/releases/latest/download/eksctl_$(uname -s)_amd64.tar.gz" | tar xz -C /tmp
sudo mv /tmp/eksctl /usr/local/bin
```

