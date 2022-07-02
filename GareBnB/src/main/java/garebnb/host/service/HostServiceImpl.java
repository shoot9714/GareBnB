package garebnb.host.service;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import garebnb.host.dao.HostDAO;

@Service("hostService")
public class HostServiceImpl implements HostService{
	
	Logger log = Logger.getLogger(this.getClass());

	@Resource(name="hostDAO")
	private HostDAO hostDAO;
}
