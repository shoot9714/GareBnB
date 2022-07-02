package garebnb.report.service;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import garebnb.report.dao.ReportDAO;

@Service("reportService")
public class ReportServiceImpl implements ReportService{
	
	Logger log = Logger.getLogger(this.getClass());

	@Resource(name="reportDAO")
	private ReportDAO reportDAO;
}
