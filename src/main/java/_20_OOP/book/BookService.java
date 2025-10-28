package _20_OOP.book;
//service역할 : 구체적으로 "무엇을 해야하는가"를 코드로 작성
public class BookService {
    BookRepository bookRepository;
    //의존성 : 정상작동하기 위해 필요한 객체.
    //BookService 객체는 BookRepository 객체에 의존하고 있다.
    //생성자를 통해서 의존하는 객체를 주입 -> 의존성 주입
    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }
    void append(Book book){
        //book이 중복되었는가
        //그외 여러 요구사항들을 처리
        bookRepository.insert(book);
    }
    //저장공간 비어있는지 확인 메서드
    boolean isEmpty(){
        int emptyIndex = bookRepository.getEmptyIndex(); // BookRepository에서 비어있는 books[]의 인덱스 번호를 추출하고 emptyIndex에 그 인덱스번호를 넣음.
        if(emptyIndex >= 0) {return true;}
        else {return false;} // -1. 비어있는 인덱스가 없다.
    }
    //등록된 도서를 콘솔로 출력
    void printRegisteredBook(){
        Book books[] = bookRepository.getBookDatas();//books -> 레파지토리가 리턴한 newBooks
        //도서가 하나도 없을 경우 예외처리
        if(books.length == 0) {System.out.println("등록된 도서 없음"); return;}

        for(int i =0; i < books.length; i++){
            Book book = books[i]; // 반복하면서 books배열에서 book을 하나씩 꺼냄.
            System.out.println(book.toString());
        }
    }
}

