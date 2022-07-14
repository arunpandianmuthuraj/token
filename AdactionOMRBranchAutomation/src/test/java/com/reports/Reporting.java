package com.reports;





import java.io.File;
import java.util.ArrayList;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {

	
	public static void generateJVMReprt(String jsonFile) {
		File file =new File(System.getProperty("user.dir")+"\\target");
		Configuration configuration =new Configuration(file,"Adatcin auto");
		configuration.addClassifications("OS", "WIND");
		configuration.addClassifications("Browser", "WIND");
		configuration.addClassifications("version", "108");
		configuration.addClassifications("Sprint", "33");
		
		java.util.List<String> jsonfiles =new ArrayList<>();
		jsonfiles.add(jsonFile);
		
		ReportBuilder builder =new ReportBuilder(jsonfiles,configuration);
		builder.generateReports();
		
		
	}

	


}