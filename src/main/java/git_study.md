#git이란?
-파일 버전 관리 툴

##git 명령어
1.-git init : 내 프로젝트를 git이 추적하게 만드는 것.
-git config --global user.name [아이디] : 현재 작업자의 서명 등록.
git config --global user.name [이메일] : 현재 작업자의 서명 등록.

2.로컬 : 내 컴퓨터에서 코드 작업(코드 변경)을 함. -> 원격 레포지토리(github)에 게시.
-git add : 변경사항에 대해서 화물차(로컬)에 싣는다.(임시 저장한다 = 스테이징 영역에 올린다.)
-git add : add를 여러번 해서 한 화물차에 많은 짐을 싣게된다.
-git commit -m "커밋메세지" : 화물차 문을 닫고 출발 준비.(스테이징 된 변경사항을 하나의 버전으로 포장.)
-git push : 준비된 화물차들을 원격 레포지토리로 보낸다.(로컬 커밋을 원격 저장소에 게시.)

3.최초 로컬 <--> 원격 레포지토리 연결.(git push 바로 직전에 수행.) 
-본사 창고 주소를 등록.(원격 저장소 등록.)
-git remote add origin [레포지토리주소](https://github.com/)
-최초 push시에만 , git push -u origin main.

4.-다른 로컬에서 원격 레포지토리에 있는 코드를 다운로드 하는 방법
-git clone [원격 레포지토리주소]








