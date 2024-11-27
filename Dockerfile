# 베이스 이미지
FROM openjdk:17-jdk-alpine

WORKDIR /app

# JAR 파일 경로 설정
ARG JAR_FILE=build/libs/PostDataToWeb-0.0.1-SNAPSHOT.jar

# JAR 파일을 컨테이너로 복사
COPY ${JAR_FILE} app.jar

EXPOSE 2345

# 컨테이너에서 애플리케이션 실행
ENTRYPOINT ["java", "-jar", "app.jar"]
