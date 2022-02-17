# docker-hello-world-micro-service
## Create docker image of an application.
- Clone the repository.
- Go inside the cloned directory, run  `mvn clean inatall`.
- Create image, run  `docker build -t docker-hello-world-micro-service-img` .
- Create container, run  `docker run -p 8070:8081 --name docker-hello-world-micro-service-container docker-hello-world-micro-service-img`
- Access the url, http://localhost:8070/hello/name. Mapping can be different, I have mapped 8070 port of the host to 8081 port of the container.
- If you don't want to build image, get it from docker hub using `docker pull getbharat/spring-boot-docker-example:latest`
