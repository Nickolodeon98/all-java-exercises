# all-java-exercises

# 1. DB

## 약 19000개의 서울시 병의원 정보를 받아 DB로 만드는 프로그램 ##

### <프로그램 구성>
`` 1. 사용하는 CSV 파일: 서울시 병의원 위치 정보.csv (8.28MB)``

`` 2. Hospital: 병의원의 정보, 즉 아이디, 주소, 응급실 보유 여부 등을 멤버 변수로 받아서 하나의 클래스 인스턴스로 선언할 수 있게 하는 클래스이다.``

`` 3. Parser: ParseAccordingly 인터페이스와 ParserForHospital 클래스 구현체를 사용해 읽어낸 파일 안에서 필요한 정보를 추출한다.``

`` 4. ReadLineContext: 주어진 Parser의 종류에 맞게 파일을 읽어낸다.``

`` 5. CreateHospitalCsv, CreateHospitalCsvMain: 파일을 읽어서 얻은 정보를 SQL 스크립트의 형식에 맞게 문자열로 구성해 .sql 파일로 작성한다.`` 

# 2. bubblesort

## 버블 정렬 알고리즘을 구현하는 프로그램 ##

``버블 정렬은 배열 내의 인접한 두 수를 비교해서 큰 수를 뒤로 보낸다. 이 작업은 배열의 길이만큼 반복된다.``