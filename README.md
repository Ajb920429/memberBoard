
#회원제 게시판
#첫 화면(index.jsp)
```
1. 회원가입 링크
2. 로그인 링크 및 로그아웃 버튼
```
#1. 회원가입 기능
````
이름 ,비밀번호, 이메일, 전화번호 입력 가능
admin 으로 회원가입 과 일반회원으로 가입의 차이를 주었음
````
#(1)일반 회원 로그인
````
1. 로그아웃 기능
2. 마이페이지 기능
3. 글쓰기 및 글목록을 확인을 할 수 있으며 페이징 처리된 글목록을 기능을 추가함
````
#(2)admin 회원 로그인
````
1. 일반회원과 달리 관리자 페이지 기능이 있음
2. 관리자 페이지를 에서 회원목록페이지로 이동 가능
3. 로그아웃기능
````
#(3)로그아웃 기능
````
1. 로그아웃을 했을시 index(기본페이지)로 리턴값을줌
````
#(4)관리자(admin전용)
````
1. 회원들의 상세조희 기능 과 삭제 수정 기능을 만들어줌
2. 또한 ajax로 상세조회 가능한 기능을 만들어줌
3. 회원 삭제 가능
````


#2.게시판 기능

```
(1) 글쓰기
 1. 제목, 내용, 파일 업로드 기능
 2. 글을 작성할 시 index로 돌아가서 해줌
```
```
(2) 글목록
 1. 제목을 클릑시 상세조회 가능하게 해줌
 2. ajax 기능으로 현 페이지에서 상세조회 가능하게 해줌
```
```
(3) 댓글 작성
 1. 댓글작성시 글에 대한 작성자가 맞아야지 댓글을 쓸 수 있게 해줌
```
```
(5) 글 수정 삭제
 1. 수정을 할시 redirect 기능을 넣어줌으로써 전으로 돌아가게 않게 해줌
 2. 또한 ajax로도 수정이 가능하게 해줌
 3. 삭제 할 시 글 목록으로 돌아가게 해줌으로써 새로운글을 선택 하게 해줌
```
```
(5) 검색 기능
 1. 제목과 작성자를 통해서 검색을 가능하게 해줌
```
#3. Entity  정의
```
총 4가지의 Entity의 Entity를 정의를 해주었음
1.BaseEntity: 작성시간과 수행시간이 가능한 Entity
2.BoardEntity: board_table을 만들어 주었고 맵퍼의 기능을 가졌지만 변환을 해줘야 사용이 가능하기때문에 static을 사용함으로써 변환을 해줌
3.CommentEntity: comment_table 만들어 주었고 맵퍼의 기능을 가졌지만 변환을 해줘야 사용이 가능하기때문에 static을 사용함으로써 변환을 해줌
4.MemberEntity: member_table 만들어 주었고 맵퍼의 기능을 가졌지만 변환을 해줘야 사용이 가능하기때문에 static을 사용함으로써 변환을 해줌
```
# interceptor
````
interceptor을 사용을 해줌으로써 로그인 체크 기능과 로그인 여부에 따른 접속가능 페이지를 구분하게 해줌
````
# Repository
````
sts와 달리 인텔리제이의 경우 extends 기능으로 연동이 쉽고 간단하게 담겨줄수 있기 때문에 사용이 간편하고 조회수 처리 기능을 넣어줌
````
# Common
````
Const기능
페이징 처리의 글갯수와 페이지처리와 로그인에따른 접속 다른 권환을 사용하게 하기 위해 만들어줌
````
