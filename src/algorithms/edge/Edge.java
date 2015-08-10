package algorithms.edge;

import algorithms.graphnode.GraphNode;

public class Edge {
	/* 边左边的节点*/
	private GraphNode leftNode;
	/* 边右边的节点*/
	private GraphNode rightNode;
	/* 边权值*/
	private double weight;
	
	public Edge(GraphNode leftNode, GraphNode rightNode, double weight) {
		this.leftNode = leftNode;
		this.rightNode = rightNode;
		this.weight = weight;
	}
	
	public GraphNode getLeftNode() {
		return leftNode;
	}
	
	public GraphNode getRightNode() {
		return rightNode;
	}
	
	public double getWeight() {
		return weight;
	}
	
	@Override
	public boolean equals(Object o) {
		Edge edge = (Edge) o;
		return edge.getLeftNode().equals(this.leftNode) && edge.getRightNode().equals(this.rightNode);
	}
	
	@Override
	public int hashCode() {
		return this.leftNode.hashCode() * this.rightNode.hashCode() % Integer.MAX_VALUE;
	}
	
	@Override
	public String toString() {
		return "left:" + leftNode.getLabel() + " " + "right:" + rightNode.getLabel() + " " + "weight:" + weight;
	}
}