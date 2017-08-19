# Pull base image.
FROM ubuntu:16.04

# Install Java.
RUN \
  apt-get update && \
  apt-get install -y software-properties-common && \
  echo oracle-java8-installer shared/accepted-oracle-license-v1-1 select true | debconf-set-selections && \
  add-apt-repository -y ppa:webupd8team/java && \
  apt-get update && \
  apt-get install -y oracle-java8-installer && \
  rm -rf /var/lib/apt/lists/* && \
  rm -rf /var/cache/oracle-jdk8-installer

# Install Maven
RUN \
  wget http://mirrors.tuna.tsinghua.edu.cn/apache/maven/maven-3/3.5.0/binaries/apache-maven-3.5.0-bin.tar.gz && \
  tar -xvzf apache-maven-3.5.0-bin.tar.gz && \
  mv apache-maven-3.5.0 /opt/maven && \
  rm apache-maven-3.5.0-bin.tar.gz && \
  ln -s /opt/maven/bin/mvn /usr/bin/mvn

# Define working directory.
WORKDIR /data
VOLUME /root/.m2

# Define commonly used JAVA_HOME、MAVEN_HOME variable
ENV JAVA_HOME=/usr/lib/jvm/java-8-oracle \
    MAVEN_HOME=/opt/maven

# Define default command.
CMD ["bash"]