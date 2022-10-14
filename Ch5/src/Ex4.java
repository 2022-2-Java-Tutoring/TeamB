class Km2Mile extends Converter{
	public Km2Mile(double ratio) {
		this.ratio=ratio;
	}
	@Override
	protected double convert(double src) {
		return src/ratio;
	}
	@Override
	protected String getSrcString() {
		return "km";
	}
	@Override
	protected String getDestString() {
		return "mile";
	}
	public void run() {
		super.run();
	}
}
public class Ex4 {

	public static void main(String[] args) {
		Km2Mile toMile=new Km2Mile(1.6);//1마일은 1.6km
		toMile.run();
	}

}