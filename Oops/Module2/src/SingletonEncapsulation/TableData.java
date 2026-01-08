package SingletonEncapsulation;

public class TableData {
	private static TableData td=new TableData();
	public static TableData getTableData() {
		if(td !=null) {
			return td;
		}
		else {
			td=new TableData();
			return td;
		}
	}
	private TableData() {
		
	}

}
