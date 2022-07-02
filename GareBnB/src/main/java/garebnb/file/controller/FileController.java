package garebnb.file.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;

import garebnb.file.service.FileService;

@Controller
public class FileController {

	Logger log = Logger.getLogger(this.getClass());

	@Resource(name="fileService")
	private FileService  fileService;
}
