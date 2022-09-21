package part27;

import java.io.Serializable;

public class SerialDTO  implements Serializable{
	static final long serialVersionUID=2L;
	private String bookTypes="IT";
	private String bookName;
	transient private int bookOrder;
	private boolean bestSeller;
	private long soldPerDay;
	public SerialDTO(String bookName, int bookOrder, boolean bestSeller, long soldPerDay) {
		super();
		this.bookName = bookName;
		this.bookOrder = bookOrder;
		this.bestSeller = bestSeller;
		this.soldPerDay = soldPerDay;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "SerialDTO [ bookName=" + bookName + ", bookOrder=" + bookOrder
				+ ", bestSeller=" + bestSeller + ", soldPerDay=" + soldPerDay
				+ ", bookType=" + bookTypes+ "]";
	}
}
