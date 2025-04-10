package com.example.app.controller;

import com.example.app.model.Board;
import com.example.app.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/board")
public class BoardController {

	@Autowired
	BoardService boardService;

	@GetMapping("/list")
	public String list(Model model) {
		List<Board> boardList = boardService.getAllBoards();
		model.addAttribute("boardList", boardList);
		return "board/list";
	}

	@GetMapping("/write")
	public String write() {
		return "board/write";
	}

	@PostMapping("/write")
	public String writePost(@ModelAttribute Board board) {
		boardService.createBoard(board);
		return "redirect:/board/list";
	}

	@GetMapping("/view")
	public String view(@RequestParam int id, Model model) {
		Board board = boardService.getBoard(id);
		model.addAttribute("board", board);
		return "board/view";
	}
	
	@GetMapping("/update")
	public String update(@RequestParam int id, Model model) {
		Board board = boardService.getBoard(id);
		model.addAttribute("board", board);
		return "board/update";
	}
	
	@PostMapping("/update")
	public String updatePost(@ModelAttribute Board board) {
		boardService.updateBoard(board);
		return "redirect:/board/view?id=" + board.getId();
	}
	
	@PostMapping("/delete")
	public String delete(@RequestParam int id) {
		boardService.deleteBoard(id);
		return "redirect:/board/list";
	}
}
