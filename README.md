
# 개발툴 설치
 - JDK 
 - Maven 
 - IntelliJ or Eclipse
 - GIT
<br/>

# Rest API 호출하여 hello world 실행
 - MainController.java 
 - http://localhost:8080/hello?name=world 호출
 - 스웨거로 확인 ( http://localhost:8080/swagger-ui.html )
<br/>

# 데이타생성
 - 데이타베이스 설치 (postgres)
 - 테이블생성 
    ```
    CREATE TABLE tb_color (
      color_id character varying(100) PRIMARY KEY,
      color_name character varying(100) NOT NULL
    );
    ```
<br/>

# Rest API 호출하여 tb_color 테이블 CRUD
 - MainController.java, MainService.java, mainSQL.xml 파일 확인
 - CRUD
    ```
    insertColor 
    updateColor
    selectColor
    deleteColor
    ```

    
