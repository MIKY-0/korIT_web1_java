package _20_OOP.book;
import java.util.Scanner;
//서버 : 데이터를 운송하는 것
//main 역할 : 사용자UI(프론트엔드) + 컨트롤러(백엔드)
//사용자 입/출력 , 프로그램 흐름만 제어
//세부로직은 service에 구현 , DB접근은 reposiory에 구현.
//데이터의 흐름 : 사용자UI(프론트엔드) -> 컨트롤러 -> 서비스 -> 레포지토리 -> DB
//layer 아키텍처

public class BookMain {
    public static void main(String[] args) {
        //Book 객체는 어떻게 저장이 되는가
        //BookMain의 main메서드에서 생성 -> bookService -> bookRepository의 배열에 저장
        Scanner scanner = new Scanner(System.in);
        //서비스에 필요한 객체를 모두 생성
        Book books[] = new Book[5];
        BookRepository bookRepository = new BookRepository(books); // books를 알게됨.
        BookService bookService = new BookService(bookRepository);//bookService가 bookRepository를 알게됨.

        while(true){
            System.out.println("도서관리 시스템");
            System.out.println("1.도서 등록\t2.도서 목록 조회\t3.프로그램 종료");
            System.out.print("메뉴 선택 : ");
            String selectMenu = scanner.nextLine();

            if("1".equals(selectMenu)){
                //객체로 포장해서 입력
                String title;
                String author;
                if(!bookService.isEmpty()){ // 저장공간이 없다면
                    System.out.println("등록불가 : 공간없음");
                    continue;
                }
                System.out.print("책제목 입력 : ");
                title = scanner.nextLine();
                System.out.print("책저자 입력 : ");
                author = scanner.nextLine();

                Book book = new Book(title , author); //파편화된 데이터들을 객체로 포장
                bookService.append(book);
            }else if("2".equals(selectMenu)){
                bookService.printRegisteredBook();
            }else if("3".equals(selectMenu)){
                System.out.println("프로그램 종료");
                break;
            }else{
                System.out.println("잘못 입력");
            }
        }
    }
}
