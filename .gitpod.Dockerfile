FROM gitpod/workspace-base

# Install Docker Compose
RUN sudo curl -L "https://github.com/docker/compose/releases/latest/download/docker-compose-$(uname -s)-$(uname -m)" \
    -o /usr/local/bin/docker-compose && \
    sudo chmod +x /usr/local/bin/docker-compose

# Install Java 17 SDK
RUN SDKMAN_DIR="/home/gitpod/.sdkman" && \
    curl -s "https://get.sdkman.io" | bash && \
    bash -c "source $SDKMAN_DIR/bin/sdkman-init.sh && sdk install java 17.0.8-tem"