
package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CategoryController {

	@RequestMapping("/admin/Category")
	public String index() {
		return "category-index";
	}

	@RequestMapping("/admin/Category/list")
	public String list() {
		return "category-list";
	}

	@RequestMapping("/admin/Category/edit")
	public String edit() {
		return "category-edit";
	}

	@RequestMapping("/admin/Category/number")
	public String number() {
		return "category-number";
	}

	@RequestMapping("/admin/Category/close")
	public String close() {
		return "category-close";
	}

}
