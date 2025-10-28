package _20_OOP.book;
//repository 역할 : DB와 연결 관리 , DB에서 데이터를 불러오는 역할.
public class BookRepository {
    Book books[]; // book들을 저장할 배열(DB대용. DB아직 안배운상태.)
    //생성자를 통해서 의존하는 객체를 주입 -> 의존성 주입
    public BookRepository(Book[] books) {
        this.books = books;
    }

    //아래 메서드들은 차후에 sql쿼리가 되어야 한다.
    void insert(Book book) {
        //비어있는 인덱스를 모름.
        int emptyIndex = getEmptyIndex();//리턴한 i를 emptyIndex에 삽입.
        if (emptyIndex == -1) {
            System.out.println("현재 저장할 공간이 없음");
            return;
        }
        books[emptyIndex] = book; // 비어있는 인덱스를 book[]배열에 삽입.
        System.out.println(book + " 저장완료");
    }
    //null : 참조자료형에만 있는 값
    //참조 자료형 변수에 힙주소가 저장되어야 하는데 주소가 없는 경우가 있음(이 경우 초기화 안된것.) 이때 저장된 주소가 없다를 뜻하는 null.
    //NullPointerException -> 참조자료형은 .으로 참조할 수 있는데 초기화가 안되면 null을 참조하게 되어서 예외가 발생.
    int getEmptyIndex() {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                return i;
            }
        }
        return -1;
    }
        //등록된 도서들 조회
        //배열에 5칸 만들어놨는데 만약 2권만 등록됐다면?. 배열의 길이만큼 순회하면 에러 발생.
        //5칸중에 실제 등록된 도서만 모아서 새로운 배열 반환
    Book[] getBookDatas(){
        int count = 0;
        for(int i = 0; i < books.length; i++){ //null이 아닌 도서 갯수 카운트
            if(books[i] != null) {count ++;}
        }
        //2.new Book[count]
        Book newBooks[] = new Book[count];
        //등록된 도서만 복사
        int j = 0;
        for(int i = 0; i < books.length; i++){
            if(books[i] != null) {// j는 복사할 때마다 다음칸으로 1씩 이동.
                newBooks[j] = books[i];
                j++;
            }
        }
        return newBooks;
        }
    }



