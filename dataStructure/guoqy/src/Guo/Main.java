package Guo;

import java.util.ArrayList;
/**
 * main program
 * @author guoqy
 *
 */
public class Main {
	public static void main(String[] args){
		System.out.println("One.");
		UWG uwg = new UWG(4,5);
		uwg.insertVertex("A");
		uwg.insertVertex("B");
		uwg.insertVertex("C");
		uwg.insertVertex("D");
		uwg.insertEdge(5, "A", "A");
		uwg.insertEdge(4, "A", "B");
		uwg.insertEdge(3, "A", "C");
		uwg.insertEdge(1, "B", "D");
		uwg.insertEdge(2, "C", "D");
		System.out.println(uwg.toString());
		System.out.println("Degree: ");
		System.out.println("A : "+uwg.degree("A"));
		System.out.println("B : "+uwg.degree("B"));
		System.out.println("C : "+uwg.degree("C"));
		System.out.println("D : "+uwg.degree("D"));
		System.out.println();
		ArrayList<String> al = new ArrayList<String>();
		al.add("A");
		al.add("A");
		al.add("C");
		al.add("D");
		System.out.println("Path A A C D weight is : "+uwg.totalPathWeight(al));
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("A");
		al2.add("B");
		al2.add("D");
		System.out.println("Path B D C weight is : "+uwg.totalPathWeight(al2));
		System.out.println("Two");
		UWG uwg2 = new UWG();
		uwg2.insertVertex("A");
		uwg2.insertVertex("B");
		uwg2.insertVertex("C");
		uwg2.insertVertex("D");
		uwg2.insertVertex("E");
		uwg2.insertVertex("F");
		uwg2.insertVertex("G");
		uwg2.insertEdge(2, "A", "B");
		uwg2.insertEdge(4, "A", "C");
		uwg2.insertEdge(1, "A", "D");
		uwg2.insertEdge(3, "B", "D");
		uwg2.insertEdge(10, "B", "E");
		uwg2.insertEdge(2, "C", "D");
		uwg2.insertEdge(2, "D", "E");
		uwg2.insertEdge(5, "C", "F");
		uwg2.insertEdge(8, "D", "F");
		uwg2.insertEdge(4, "D", "G");
		uwg2.insertEdge(6, "E", "G");
		uwg2.insertEdge(1, "F", "G");
		System.out.println(uwg2.toString());
		System.out.println("Degree: ");
		System.out.println("A : "+uwg2.degree("A"));
		System.out.println("B : "+uwg2.degree("B"));
		System.out.println("C : "+uwg2.degree("C"));
		System.out.println("D : "+uwg2.degree("D"));
		System.out.println("E : "+uwg2.degree("E"));
		System.out.println("F : "+uwg2.degree("F"));
		System.out.println("G : "+uwg2.degree("G"));
		System.out.println();
		ArrayList<String> al3 = new ArrayList<String>();
		al3.add("A");
		al3.add("B");
		al3.add("D");
		al3.add("G");
		System.out.println("Path A B D G weight is : "+uwg2.totalPathWeight(al3));		
		System.out.println("Three.");
		UWG uwg3 = new UWG();
		uwg3.insertVertex("A");
		uwg3.insertVertex("B");
		uwg3.insertVertex("C");
		uwg3.insertVertex("D");
		uwg3.insertVertex("E");
		uwg3.insertEdge(10, "A", "E");
		uwg3.insertEdge(7, "A", "B");
		uwg3.insertEdge(9, "C", "E");
		uwg3.insertEdge(6, "A", "C");
		uwg3.insertEdge(5, "A", "D");
		uwg3.insertEdge(4, "D", "B");
		uwg3.insertEdge(2, "C", "D");
		System.out.println(uwg3.toString());
		System.out.println("Degree: ");
		System.out.println("A : "+uwg3.degree("A"));
		System.out.println("B : "+uwg3.degree("B"));
		System.out.println("C : "+uwg3.degree("C"));
		System.out.println("D : "+uwg3.degree("D"));
		System.out.println("E : "+uwg3.degree("E"));
		System.out.println();
		ArrayList<String> al4 = new ArrayList<String>();
		al4.add("A");
		al4.add("C");
		al4.add("E");
		System.out.println("Path A C E weight is : "+uwg3.totalPathWeight(al4));	
	}
}
