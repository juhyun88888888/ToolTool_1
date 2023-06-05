package com.ll.sbb.Market;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@RequestMapping("/market")
@RequiredArgsConstructor
@Controller
public class MarketController {

        private final MarketService marketService;

        @GetMapping("/list")
        public String list(Model model) {
            List<Market> productList = this.marketService.getList();
            model.addAttribute("MarketList", marketService);
            return "market_list";
        }
        @GetMapping(value = "/detail/{id}")
        public String detail(Model model, @PathVariable("id") Integer id) {
            Market market = this.marketService.getMarket(id);
            model.addAttribute("market", market);
            return "market_detail";

        }

        @GetMapping("/create")
        public String marketCreate(MarketForm marketForm) {
            return "market_form";
        }
        @PostMapping("/create")
        public String marketCreate(@Valid MarketForm marketForm, BindingResult bindingResult) {
            if (bindingResult.hasErrors()) {
                return "market_form";
            }
            this.marketService.create(marketForm.getSubject(),marketForm.getContent(), marketForm.getPrice());
            return "redirect:/market/list"; // 질문 저장후 질문목록으로 이동
        }

    }
