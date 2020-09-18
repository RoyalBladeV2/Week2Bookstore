package com.example.Week2Bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Week2Bookstore.model.Book;


@Controller
public class BookController {
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String books(@RequestParam(value = "book", required = false) String name, Model model) {
		Book book = new Book();
		model.addAttribute("book", book);
		return "index";
	}
	
}
