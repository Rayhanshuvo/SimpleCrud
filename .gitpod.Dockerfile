FROM gitpod/workspace-full:latest

# Install Java 17 using SDKMAN (already installed in base image)
RUN yes | sdk install java 17.0.8-tem && \
    sdk use java 17.0.8-tem

# Optional: install MySQL CLI tool (not the server, just client)
RUN sudo apt-get update && sudo apt-get install -y mysql-client
