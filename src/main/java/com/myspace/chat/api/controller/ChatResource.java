package com.myspace.chat.api.controller;

import org.apache.catalina.loader.ResourceEntry;
import org.springframework.beans.factory.config.YamlProcessor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by raghavmysari on 6/21/17.
 */
@RestController
@RequestMapping("/api/chat")
public class ChatResource {

	@RequestMapping(value = "/messages", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<String> chat() {
		return null;
	}
}
