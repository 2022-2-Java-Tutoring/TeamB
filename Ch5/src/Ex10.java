
abstract class PairMap{
	protected String keyArray[];//key들을 저장하는 배열
	protected String valueArray[];//value들을 저장하는 배열
	abstract String get(String key);//key값을 가진 value리턴.없으면 null리턴
	abstract void put(String key,String value);//key와 value를 쌍으로 저장.기존에 key가 있으면, 값을 value로 수정
	abstract String delete(String key);//key값을 가진 아이템(value와 함께)삭제.삭제된 value값 리턴
	abstract int legth();//현재 저장된 아이템의 개수 리턴
}

class Dictionary extends PairMap{
	private int size;
	private int index=0;
	public Dictionary(int size) {
		keyArray=new String[size];//size만큼 keyArray배열 생성
		valueArray=new String[size];//size만큼 valueArray배열 생성
		
	}
	@Override
	public String get(String key) {
		for(int i=0;i<index;i++) {//keyArray의 길이만큼
			if(key.equals(keyArray[i]))//입력한 키 값 중 keyArray에 값이 있따면
				return valueArray[i];//key값을 가진 value리턴
		}
		return null;//없으면 null리턴
	}
	@Override
	public void put(String key,String value) {
		//이미 있는 키라면
		for(int i=0;i<index;i++) {//keyArray의 길이만큼
			if(key.equals(keyArray[i]))//입력한 키 값 중 keyArray에 값이 있따면
				valueArray[i]=value;
		}
		//새로운 키라면
		keyArray[index]=key;//keyArray에 키 값 저장
		valueArray[index]=value;//valueArray에 value값 저장
		index++;//값들을 저장한 후 index 증감
		
	}
	@Override
	public String delete(String key) {
		for(int i=0;i<index;i++) {//keyArray의 길이만큼
			if(key.equals(keyArray[i]))//입력한 키 값 중 keyArray에 값이 있따면
				valueArray[i]="null";//key값을 가진 value리턴
			}
		return "null";
	}
	@Override
	public int legth() {
		return index;
	}
}

public class Ex10 {

	public static void main(String[] args) {
		Dictionary dic=new Dictionary(10);
		dic.put("황기태", "자바");
		dic.put("이재문","파이썬");
		dic.put("이재문", "C++");
		System.out.println("이재문의 값은 "+ dic.get("이재문"));
		System.out.println("황기태의 값은 "+ dic.get("황기태"));
		dic.delete("황기태");
		System.out.println("황기태의 값은 "+ dic.get("황기태"));

	}

}
