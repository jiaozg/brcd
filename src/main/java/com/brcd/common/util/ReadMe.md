//工具类导出demo使用方法
       @RequestMapping("/slectALl")
        public void slectALl(HttpServletResponse response, HttpServletRequest request) throws IOException {

           String[] headers = {"遍号","标题","卖点","价格","数量","状态码","图片地址","id","状态","创建时间","更新时间"};

           String fileName="日志导出.xls";
           String userAgent = request.getHeader("User-Agent");
           //针对IE或者以IE为内核的浏览器：
           if (userAgent.contains("MSIE")||userAgent.contains("Trident")) {
               fileName = URLEncoder.encode(fileName, "GBK");
           } else {//非IE浏览器的处理：
               fileName = new String(fileName.getBytes("GBK"),"ISO-8859-1");
           }

           response.setHeader("Content-Disposition", String.format("attachment; filename=\"%s\"", fileName));
           response.setContentType("application/vnd.ms-excel;charset=GBK");
           response.setCharacterEncoding("GBK");

           ExportExcel<Item> ex = new ExportExcel<>();

           List<Item> Item = itemService.getList();

           OutputStream out = response.getOutputStream();
           ex.exportExcel(headers, Item, out);
           out.close();

    }
//