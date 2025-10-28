package _21_Access;

public class Access {
    private String data;

    public String getData() { return data;}
    public void setData(String data) {this.data = data;} // 데이터 검증하는 코드가 들어감.

    public Access(String data) {this.data = data;}
}
