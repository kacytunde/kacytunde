FROM frolvlad/alpine-oraclejdk8
VOLUME /tmp
ADD  target/blog-1.0.jar blog.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","/blog.jar"]

