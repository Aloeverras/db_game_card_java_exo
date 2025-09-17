FROM debian:trixie-slim

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
LABEL REMOTE_USER=${USER_NAME}

#environnements variables
ENV MAVEN_VERSION="3.9.6"
ENV JAVA_VERSION=21
ENV JAVA_HOME=/usr/lib/jvm/java-21-openjdk-amd64
ENV PATH=${JAVA_HOME}/bin:${PATH}

#running
#basiking update and upgrade
RUN apt-get update && \
    groupadd -g ${GROUP_ID} ${GROUP_NAME} && \
    useradd -u ${USER_ID} -g ${GROUP_NAME} -s /bin/bash -m ${USER_NAME} && \
    # add dependencie
    apt-get install -y openjdk-21-jdk maven && \
    # git intallation binaires
    if [ "${DEVMODE}" = "true" ]; then \
        apt-get install -y git; \
    else \
        echo "DEVMODE deactived";  \  
    fi 

WORKDIR /workspace  

# user setting in project
USER ${USER_NAME}

EXPOSE ${PORT} 

CMD ["sleep", "infinity"]