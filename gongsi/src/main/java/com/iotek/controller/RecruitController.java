package com.iotek.controller;

import com.iotek.model.Recruit;
import com.iotek.service.RecruitService;
import com.iotek.utils.DoPage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
@Controller
public class RecruitController {
    private final int PAGESIZE = 5;
    @Resource
    private RecruitService recruitService;

    //查看招聘信息
    @RequestMapping("/showRecruit")
    public String showRecruit(int currentPage, Model model) throws Exception {
        int totalRows = recruitService.getAllRecruit().size();
        int totalPages = DoPage.getTotalPages(totalRows);
        HashMap<String, Object> hashMap = new HashMap();
        hashMap.put("currentPage", (currentPage - 1) * PAGESIZE + 1);
        hashMap.put("PAGESIZE", PAGESIZE * currentPage);
        model.addAttribute("totalPages", totalPages);
        List<Recruit> recruitList = recruitService.queryRecruitByArray(hashMap);
        if (recruitList.size() != 0) {
            model.addAttribute("recruitList", recruitList);
            return "main";
        } else {
            return "main";
        }
    }
}
