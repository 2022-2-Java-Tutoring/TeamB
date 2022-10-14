
class IPTV extends ColorTV{
	private String address;//IPTV의 주소(문자열)
	
	public IPTV(String address,int size,int color) {
		super(size,color);
		this.address=address;
	}
	public void printProperty() {
		System.out.print("나의 IPTV는 "+this.address+" 주소의 ");
		super.printProperty();//ColorTV의 printProperty()호출
	}
}
public class Ex2 {

	public static void main(String[] args) {
		IPTV iptv=new IPTV("192.1.1.2",32,2048);//IPTV의 객체 iptv생성
		                                        //"192.1.1.2",주소에 32인치,2048컬러
 		iptv.printProperty();

	}

}
