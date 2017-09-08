function nameImageFinderOpen() {//
    var date = new Date(), year = date.getFullYear(),
        month = (date.getMonth() + 1) > 9 ? date.getMonth() + 1 : "0" + (date.getMonth() + 1);
    var url = "user/xiugaimima";
    windowOpen(url, "文件管理", 1000, 700);
    //top.$.jBox("iframe:"+url+"&pwMf=1", {title: "文件管理", width: 1000, height: 500, buttons:{'关闭': true}});
}
function nameImageSelectAction(fileUrl, data, allFiles) {
    var url = "", files = ckfinderAPI.getSelectedFiles();
    for (var i = 0; i < files.length; i++) {//
        url += files[i].getUrl();//
        if (i < files.length - 1) url += "|";
    }//
    $("#nameImage").val(url);//
    nameImagePreview();
    //top.$.jBox.close();
}
function nameImageThumbSelectAction(fileUrl, data, allFiles) {
    var url = "", files = ckfinderAPI.getSelectedFiles();
    for (var i = 0; i < files.length; i++) {
        url += files[i].getThumbnailUrl();
        if (i < files.length - 1) url += "|";
    }//
    $("#nameImage").val(url);//
    nameImagePreview();
    //top.$.jBox.close();
}
function nameImageCallback(api) {
    ckfinderAPI = api;
}
function nameImageDel(obj) {
    var url = $(obj).prev().attr("url");
    $("#nameImage").val($("#nameImage").val().replace("|" + url, "", "").replace(url + "|", "", "").replace(url, "", ""));
    nameImagePreview();
}
function nameImageDelAll() {
    $("#nameImage").val("");
    nameImagePreview();
}
function nameImagePreview() {
    var li, urls = $("#nameImage").val().split("|");
    $("#nameImagePreview").children().remove();
    for (var i = 0; i < urls.length; i++) {
        if (urls[i] != "") {//
            li = "<li><img class='imgList' src=\"" + urls[i] + "\" url=\"" + urls[i] + "\" style=\"max-width:100px;max-height:100px;_height:100px;border:0;padding:3px;\">";//
            li += "&nbsp;&nbsp;<a href=\"javascript:\" onclick=\"nameImageDel(this);\">×</a></li>";
            $("#nameImagePreview").append(li);
        }
    }
    if ($("#nameImagePreview").text() == "") {
        $("#nameImagePreview").html("<li style='list-style:none;padding-top:5px;'>无</li>");
    }
}
nameImagePreview();