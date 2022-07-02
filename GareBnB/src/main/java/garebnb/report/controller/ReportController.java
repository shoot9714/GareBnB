package garebnb.report.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;

import garebnb.report.service.ReportService;

@Controller
public class ReportController {
	
	Logger log = Logger.getLogger(this.getClass());

	@Resource(name="reportService")
	private ReportService reportService;
	
}
