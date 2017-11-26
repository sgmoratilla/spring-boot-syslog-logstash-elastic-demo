docker build -t logstash .
docker run -p51415:51415/udp -e XPACK_MONITORING_ENABLED=false logstash

mvn install
mvn spring-boot:run

