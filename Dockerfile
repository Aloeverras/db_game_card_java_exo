FROM alpine:3.22.1

#arguments
ARG DEVMODE=false
#  8000 basic port
ARG PORT=8000

# user, group and id
ARG GROUP_NAME="group"
ARG GROUP_ID=1500
ARG USER_NAME="user"
ARG USER_ID=1000

#labels
LABEL MAIN_TAINER="Aloès"
LABEL VERSION_PROJECT=1.0
LABEL DESCRIPTION_PROJECT="db game card in java exo"

#environnements variables
ENV MAVEN_VERSION="3.9.6"
ENV JAVA_VERSION=21
ENV JAVA_HOME=/usr/lib/jvm/java-21-openjdk
ENV PATH=${JAVA_HOME}/bin:${PATH}

#running
#basiking update and upgrade
RUN apk update && \
    apk upgrade && \
    addgroup -g ${GROUP_ID} ${GROUP_NAME} && \
    adduser -u ${USER_ID} -G ${GROUP_NAME} -S ${USER_NAME} && \
    # add dependencie
    apk add openjdk21 maven && \
    # git intallation binaires
    if [ "${DEVMODE}" = "true" ]; then \
        apk add git; \
    else \
        echo "DEVMODE deactived";  \  
    fi 

WORKDIR /workspace  

# user setting in project
USER ${USER_NAME}

EXPOSE ${PORT} 

CMD ["sleep", "infinity"]