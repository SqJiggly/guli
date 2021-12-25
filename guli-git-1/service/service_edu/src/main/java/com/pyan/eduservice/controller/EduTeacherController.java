package com.pyan.eduservice.controller;


import com.pyan.eduservice.entity.EduTeacher;
import com.pyan.eduservice.service.EduTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author pyan
 * @since 2021-12-23
 */
@RestController
@RequestMapping("/eduservice/edu-teacher")
public class EduTeacherController {
    // controller调用service方法然后service注入mapper关联查询
    @Autowired
    private EduTeacherService eduTeacherService;
    // 查询所有数据
    @GetMapping("/list")
    public List<EduTeacher> getList () {
        // 调用service方法
        List<EduTeacher> list = eduTeacherService.list(null);
        return  list;
    }
    @PostMapping("/delete")
    public String deleteById(@RequestBody EduTeacher eduTeacher){
        boolean b = eduTeacherService.removeById(eduTeacher.getId());
        if (b) {
            return "删除成功";
        } else {
            return "删除失败";
        }
    }

}

