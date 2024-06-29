package javaLearn;

public class MultiplicationTable {
	void print() {
	for (int i=1; i<=10; i++) {
		System.out.printf("%d*%d=%d", 5,i,5*i).println();}

}


void print( int n) {
	for(int i=1; i<=10; i++) {
		System.out.printf("%d*%d =%d", n,i,n*i).println();
	}
}

void print(int n, int from, int to) {
	for (int i =from; i<= to; i++) {
		System.out.printf("%d*%d =%d", n,i,n*i).println();
	}
}}