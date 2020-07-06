package net.suncaper.ecommerceanalysis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/uv")
public class UvController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("month")
    @ResponseBody
    public List<Map<String, Object>> listUvMonth() {
        String sql = "SELECT * FROM dws_uv_detail_month ORDER BY month ASC;";

        List<Map<String, Object>> results = jdbcTemplate.queryForList(sql);

        return results;
    }
    @GetMapping("week")
    @ResponseBody
    public List<Map<String,Object>> listUvWk(){
        String sql = " select * from dws_uv_detail_wk order by wk_num ASC;";
        List<Map<String, Object>> results = jdbcTemplate.queryForList(sql);

        return results;
    }
    @GetMapping("increase-day")
    //@RequestMapping(value="yuce",produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public List<Map<String, Object>> listUvYC(){
        String sql = " select * from user_increase_day ;";

        List<Map<String, Object>> results = jdbcTemplate.queryForList(sql);

        return results;
    }
    @GetMapping("province")
    @ResponseBody
    public List<Map<String,Object>> listUvProvince(){
        String sql="select * from province;";
        List<Map<String,Object>> results = jdbcTemplate.queryForList(sql);
        return results;
    }
    @GetMapping("funnel")
    @ResponseBody
    public List<Map<String,Object>> listUvFunnel(){
        String sql="select * from funnel;";
        List<Map<String,Object>> results = jdbcTemplate.queryForList(sql);
        return results;
    }
    @GetMapping("loss-user")
    @ResponseBody
    public List<Map<String,Object>> listUvLossUser(){
        String sql="select * from loss_user;";
        List<Map<String,Object>> results = jdbcTemplate.queryForList(sql);
        return results;
    }
    @GetMapping("retention-1")
    @ResponseBody
    public List<Map<String,Object>> listUvRetention_1(){
        String sql="select * from retention_1;";
        List<Map<String,Object>> results = jdbcTemplate.queryForList(sql);
        return results;
    }
    @GetMapping("retention-4")
    @ResponseBody
    public List<Map<String,Object>> listUvRetention_4(){
        String sql="select * from retention_4;";
        List<Map<String,Object>> results = jdbcTemplate.queryForList(sql);
        return results;
    }
    @GetMapping("retention-7")
    @ResponseBody
    public List<Map<String,Object>> listUvRetention_7(){
        String sql="select * from retention_7;";
        List<Map<String,Object>> results = jdbcTemplate.queryForList(sql);
        return results;
    }
    @GetMapping("retention-14")
    @ResponseBody
    public List<Map<String,Object>> listUvRetention_14(){
        String sql="select * from retention_14;";
        List<Map<String,Object>> results = jdbcTemplate.queryForList(sql);
        return results;
    }
    @GetMapping("info")
    @ResponseBody
    public List<Map<String,Object>> listUvInfo(){
        String sql="select * from info;";
        List<Map<String,Object>> results = jdbcTemplate.queryForList(sql);
        return results;
    }
    @GetMapping("item-top10")
    @ResponseBody
    public List<Map<String,Object>> listUvItem_top10(){
        String sql="select * from item_top10;";
        List<Map<String,Object>> results = jdbcTemplate.queryForList(sql);
        return results;
    }
    @GetMapping("merchant-top10")
    @ResponseBody
    public List<Map<String,Object>> listUvMerchant_top10(){
        String sql="select * from merchant_top10;";
        List<Map<String,Object>> results = jdbcTemplate.queryForList(sql);
        return results;
    }
}
