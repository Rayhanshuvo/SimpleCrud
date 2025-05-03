FROM gitpod/workspace-full

# Install Java 17 using SDKMAN
RUN sdk install java 17.0.8-tem
RUN sdk use java 17.0.8-tem

# Optional: MySQL client for connecting manually
RUN sudo apt-get update && sudo apt-get install -y mysql-client
