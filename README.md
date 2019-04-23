# currency-conversion-microserves

http://localhost:8000/currency-exchange/from/USD/to/ENR
http://localhost:8001/currency-exchange/from/USD/to/ENR

http://localhost:8100/currency-converter-feign/from/USD/to/ENR/quantity/100

eureka on http://localhost:8761/

download zipkin jar file and run these two commands to run zipkin from cmd: 

set RABBIT_URI=amqp://localhost
java -jar zipkin-server-2.7.0-exec.jar

dowload rabbit mq: rabbitmq.com/install-windows.html
and erlang.org/downloads


run eureka, then api, then microservices to get the zipkin traces, also launch it in the browser



