package com.digitalsolutionarchitecture.bpmnlayoutanalyzer.analyze.connectedness;

import java.util.Arrays;
import java.util.List;

import com.digitalsolutionarchitecture.bpmnlayoutanalyzer.analyze.Result;
import com.digitalsolutionarchitecture.bpmnlayoutanalyzer.bpmnmodel.BpmnProcess;

class ConnectednessAnalyzerResult extends Result {

	private Connectedness connectedness;
	private StartAndEndConstellation startAndEnd;
	private int startFlowNodeCount;
	private int subgraphCount;
	private int endFlowNodeCount;
	
	public ConnectednessAnalyzerResult(
			BpmnProcess p, 
			Connectedness connectedness, 
			StartAndEndConstellation startAndEnd, 
			int startFlowNodeCount, 
			int endFlowNodeCount, 
			int subgraphCount
		) {
		
		super(p);
		this.connectedness = connectedness;
		this.startAndEnd = startAndEnd;
		this.startFlowNodeCount = startFlowNodeCount;
		this.endFlowNodeCount = endFlowNodeCount;
		this.subgraphCount = subgraphCount;
	}

	public static final String[] HEADERS = new String[] { "Connectedness", "StartAndEnd", "StartFlowNodeCount", "EndFlowNodeCount", "SubgraphCount" };

	@Override
	public List<Object> getValues() {
		return Arrays.asList(connectedness, startAndEnd, startFlowNodeCount, endFlowNodeCount, subgraphCount);
	}

	public Connectedness getConnectedness() {
		return connectedness;
	}
	
	public StartAndEndConstellation getStartAndEnd() {
		return startAndEnd;
	}
	
	public int getStartFlowNodeCount() {
		return startFlowNodeCount;
	}
	
	public int getEndFlowNodeCount() {
		return endFlowNodeCount;
	}
	
	public int getSubgraphCount() {
		return subgraphCount;
	}

}
