package Book;

public class STK extends Book{
    String ten,tacgia;
    int soluong;
    int status;
    STK(int ms, String nxb, String ten, String tacgia, int soluong, Float gia,int status,String loai) {
        super(ms, nxb, gia,loai);
        this.status = status;
        this.soluong = soluong;
        this.tacgia = tacgia;
        this.ten = ten;

    }
}
