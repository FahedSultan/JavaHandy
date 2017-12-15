package io.sudheer.practice.jenkins;

import io.sudheer.practice.jenkins.ReadBuildAndStageInfo;

public class TestReadBuildAndStageInfo {

	public static void main(String[] args) throws Exception {
		String jenkinsURL = "http://192.168.43.115:8080";
		String projectName = "devops-web-hackathon";
		String projectBranch = "master";
		String buildNumber = "4";
		boolean multiBranchPipeline = true;
		//URL for MultiBranch Configuration Pipelines
		//String mainURL = "http://192.168.43.115:8080/job/devops-web-hackathon/job/master/4";
		
		//URL for Simple Pipelines
		//String mainURL = "http://192.168.43.115:8080/job/Pipeline-devops-web-maven/26";
		
		ReadBuildAndStageInfo infoObject = new ReadBuildAndStageInfo();
		infoObject.setJenkinsURL(jenkinsURL);
		infoObject.setProjectName(projectName);
		infoObject.setProjectBranch(projectBranch);
		infoObject.setBuildNumber(buildNumber);
		infoObject.setMultiBranchPipeline(multiBranchPipeline);
		System.out.println(infoObject.getFullInfo());

	}

}
