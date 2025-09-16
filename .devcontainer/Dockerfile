FROM ubuntu:25.04

#labels
LABEL MAIN_TAINER="Aloès"
LABEL VERSION_PROJECT=1.0
LABEL DESCRIPTION_PROJECT="db game card in java exo"

#environnements variables
ENV MAVEN_VERSION="3.9.6"
ENV JAVA_VERSION=17
ENV JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64
ENV PATH=${JAVA_HOME}/bin:${PATH}

#running
RUN apt-get update && \
    apt-get install -y openjdk-17-jdk maven && \
    apt-get clean && \
    rm -rf /var/lib/apt/lists/*

WORKDIR /workspace    

EXPOSE 8000    