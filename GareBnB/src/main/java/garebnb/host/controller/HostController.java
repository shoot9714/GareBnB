package garebnb.host.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;

import garebnb.host.service.HostService;

@Controller
public class HostController {

	Logger log = Logger.getLogger(this.getClass());

	@Resource(name="hostService")
	private HostService hostService;
}
