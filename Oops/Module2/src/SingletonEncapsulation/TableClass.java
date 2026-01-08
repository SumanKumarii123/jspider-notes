package SingletonEncapsulation;

public class TableClass {
	public static void main(String[] args) {
		TableData t1=TableData.getTableData();
		TableData t2=TableData.getTableData();
		TableData t3=TableData.getTableData();
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
	}

}
