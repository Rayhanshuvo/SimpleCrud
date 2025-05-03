FROM gitpod/workspace-full:latest

# Install Java 17 using SDKMAN
RUN yes | sdk install java 17.0.8-tem && \
    sdk use java 17.0.8-tem

# Install MySQL client (optional)
RUN sudo apt-get update && sudo apt-get install -y mysql-client
