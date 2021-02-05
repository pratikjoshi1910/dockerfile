From openjdk:8
copy ./target/DocketFile.jar DocketFile1.jar
CMD ["java","-jar","DocketFile1.jar"]