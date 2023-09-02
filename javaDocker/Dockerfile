FROM openjdk:11

ARG PROFILE
ARG ADDITIONAL_OPTS

ENV PROFILE=${PROFILE}
ENV ADDITIONAL_OPTS=${ADDITIONAL_OPTS}

WORKDIR /opt/spring_boot

copy /target/javaDocker-0.jar javaDocker.jar

# SHELL ["/bin/sh", "-c"]

EXPOSE 8080

CMD java $ADDITIONAL_OPTS -jar javaDocker.jar --spring.profiles.active=$PROFILE