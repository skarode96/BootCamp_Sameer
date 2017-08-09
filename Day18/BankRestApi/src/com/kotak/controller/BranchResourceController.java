package com.kotak.controller;


import com.kotak.branches.Branch;
import com.kotak.dao.BranchDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;


@RestController
public class BranchResourceController {

    @Autowired
    BranchDAO branchDAO;

    @RequestMapping(value = "getbranch/{ifsc}",produces = MediaType.TEXT_PLAIN_VALUE,method = RequestMethod.GET)
    public String readBranch(@PathVariable long ifsc){
        try {
            System.out.println("in text plain");
            Branch branch = branchDAO.getBranch(ifsc);
            System.out.println(branch.toString());
            return branch.toString();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return " Nothing found ";
    }

    @RequestMapping(value = "getbranch/{ifsc}",produces = MediaType.APPLICATION_XML_VALUE,method = RequestMethod.GET)
    public Branch getBranchInXml(@PathVariable long ifsc){
        try {
            System.out.println("in xml");

            Branch branch = branchDAO.getBranch(ifsc);
            return branch;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }



}
