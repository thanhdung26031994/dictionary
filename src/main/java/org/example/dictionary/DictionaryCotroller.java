package org.example.dictionary;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@Controller

public class DictionaryCotroller {
    @GetMapping("/home")
    public String showDictionary(){
        return "home";
    }
    @PostMapping("/home")
    public String simpleDictionary(@RequestParam("dictionary") String dictionary, Model model){
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("hello", "xin chào");
        stringMap.put("book", "sách");
        stringMap.put("student", "học sinh");
        String tiengViet = stringMap.get(dictionary);
        model.addAttribute("tiengViet", tiengViet);

        boolean check = false;
        for (Map.Entry<String, String> entry: stringMap.entrySet()){
            if (entry.getKey().equalsIgnoreCase(tiengViet)){
                model.addAttribute("result", entry.getValue());
                check = true;
            }
        }
        if (check){
            model.addAttribute("result", "Không tìm thấy");
        }
        return "home";

    }
}
