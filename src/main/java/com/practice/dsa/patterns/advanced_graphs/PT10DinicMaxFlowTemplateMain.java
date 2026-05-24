package com.practice.dsa.patterns.advanced_graphs;

public class PT10DinicMaxFlowTemplateMain {
    public static void main(String[] args) {
        PT10DinicMaxFlowTemplate flow = new PT10DinicMaxFlowTemplate(4);
        flow.addEdge(0, 1, 3);
        flow.addEdge(0, 2, 2);
        flow.addEdge(1, 2, 1);
        flow.addEdge(1, 3, 2);
        flow.addEdge(2, 3, 4);
        System.out.println(flow.maxFlow(0, 3));
    }
}
