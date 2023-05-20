
# 개발툴 설치
 - JDK 
 - Maven 
 - IntelliJ or Eclipse
 - GIT


# Rest API 호출하여 hello world 실행
 - MainController.java - helloName 확인
 - 스웨거로 확인 ( http://localhost:8080/swagger-ui.html )

# 데이타생성
 - 데이타베이스 설치 (postgres)
 - 테이블생성
    ```
    CREATE TABLE tb_emp (
      seq SERIAL PRIMARY KEY,
      emp_id character varying(100) NOT NULL,
      emp_name character varying(100) NOT NULL
    );
    ```

# 데이타 CRUD
 - MainController.java 
 - MainService.java, mainSQL.xml
 - 
    ```
    insertColor
    updateColor
    selectColor
    deleteColor
    ```

    
