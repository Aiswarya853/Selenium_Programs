package javaLearn;

public class MultiplicationTables {
	void printTable(int num) {
		for(int i=1; i<=10; i++) {
			System.out.printf("%d*%d =%d", num,i,num*i).println();
		}
	}
	void printTable(int num, int from, int to) {
		for(int i=from; i<=to; i++) {
			System.out.printf("%d*%d =%d", num,i,num*i).println();
		}
	}

}

	
