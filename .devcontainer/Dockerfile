FROM alpine:3.22.1

#arguments
ARG DEVMODE=false
ARG USER_NAME="undefinied_user"
ARG USER_ID=1000
ARG GROUP_NAME="undefinied_group"
ARG GROUP_ID=2000

#labels
LABEL MAIN_TAINER="Aloès"
LABEL VERSION_PROJECT=1.0
LABEL DESCRIPTION_PROJECT="db game card in java exo"

#environnements variables
ENV MAVEN_VERSION="3.9.6"
ENV JAVA_VERSION=17
ENV JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64
ENV PATH=${JAVA_HOME}/bin:${PATH}
ENV PORT=8000

#running
RUN apk update && \
    apk upgrade && \
    apk add openjdk17 && \
    apk add maven && \
    if [${DEVMODE} = "true"]; then \
        apk add git; \
        export PORT=3000; \
    else \
        echo "no dev mode"; \    
    fi    

WORKDIR /workspace    

EXPOSE ${PORT} 

CMD ["sleep", "infinity"]