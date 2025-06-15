run the kafka container in kraft mode ()-
docker run -d --name kafka -p 9092:9092 `
 -e KAFKA_CFG_NODE_ID=1 `
 -e KAFKA_CFG_PROCESS_ROLES=controller,broker `
 -e KAFKA_CFG_CONTROLLER_QUORUM_VOTERS=1@localhost:9093 `
 -e KAFKA_CFG_LISTENERS=PLAINTEXT://:9092,CONTROLLER://:9093 `
 -e KAFKA_CFG_ADVERTISED_LISTENERS=PLAINTEXT://localhost:9092 `
 -e KAFKA_CFG_CONTROLLER_LISTENER_NAMES=CONTROLLER `
 -e KAFKA_KRAFT_CLUSTER_ID=abcdefghijklmnopqrstuv== `
 -e ALLOW_PLAINTEXT_LISTENER=yes `
 bitnami/kafka:4.0



 curl "http://localhost:8080/api/kafka/publish?message=hello siriiiiiiiii2"

to view messages
container name =kafka
docker exec -it kafka /bin/bash



topic name = javaguider
kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic javaguides --from-beginning
