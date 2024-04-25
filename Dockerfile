FROM public.ecr.aws/amazonlinux/amazonlinux:2.0.20230926.0
RUN yum -y install java-17-amazon-corretto-devel
COPY target/*.jar application.jar
EXPOSE 8080
CMD ["java", "-jar", "application.jar"]