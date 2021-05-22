FROM williamyeh/java8:latest
MAINTAINER 597606065@qq.com
ENV TZ="Asia/Shanghai" HOME="/root" JVM_PARAMS=" " SPRING_PARAMS=" "
WORKDIR ${HOME}
ADD target/*.jar ${HOME}/ROOT.jar
EXPOSE 8092
CMD java $JVM_PARAMS -Djava.security.egd=file:/dev/./urandom -jar ${HOME}/ROOT.jar $SPRING_PARAMS