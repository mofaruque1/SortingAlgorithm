package test;

import java.util.LinkedList;

public class Graph {
	
	public int v;
	public LinkedList<Integer>[] adjListArray;
	
	@SuppressWarnings("unchecked")
	public Graph(int noOfVertices) {
		this.v = noOfVertices;
		adjListArray = new LinkedList[noOfVertices];
		
		for(int i=0;i<noOfVertices;i++){
			adjListArray[i] = new LinkedList<>();
		}
		
	}
	
	public void addEdge(int v, int w){
		adjListArray[v].add(w);
	}
	
	
	

}
